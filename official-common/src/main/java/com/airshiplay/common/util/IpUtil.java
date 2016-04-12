package com.airshiplay.common.util;

import javax.servlet.http.HttpServletRequest;

public class IpUtil {
	public static String getIpAddr(HttpServletRequest req) {
		String ip = req.getHeader("X-Forwarded-For");
		if (ip != null) {
			if (ip.indexOf(',') == -1) {
				return ip;
			}
			return ip.split(",")[0];
		}

		if (!validateIp(ip)) {
			ip = req.getHeader("Proxy-Client-IP");
		}
		if (!validateIp(ip)) {
			ip = req.getHeader("WL-Proxy-Client-IP");
		}
		if (!validateIp(ip)) {
			ip = req.getHeader("clientip");
		}
		if (!validateIp(ip)) {
			ip = req.getRemoteAddr();
		}
		return ip;
	}

	private static boolean validateIp(String ip) {
		return (ip == null || ip.length() == 0 || "unknown"
				.equalsIgnoreCase(ip)) ? false : true;
	}

	public static boolean isInRange(String ip, String ipRange) {
		String[] ips = ip.split("\\.");
		int ipAddr = (Integer.parseInt(ips[0]) << 24)
				| (Integer.parseInt(ips[1]) << 16)
				| (Integer.parseInt(ips[2]) << 8) | Integer.parseInt(ips[3]);
		int type = Integer.parseInt(ipRange.replaceAll(".*/", ""));
		int mask = 0xFFFFFFFF << (32 - type);
		String cidrIp = ipRange.replaceAll("/.*", "");
		String[] cidrIps = cidrIp.split("\\.");
		int cidrIpAddr = (Integer.parseInt(cidrIps[0]) << 24)
				| (Integer.parseInt(cidrIps[1]) << 16)
				| (Integer.parseInt(cidrIps[2]) << 8)
				| Integer.parseInt(cidrIps[3]);

		return (ipAddr & mask) == (cidrIpAddr & mask);
	}

	/**
	 * IP(String) 转 Long string ip to long
	 * */
	public static long ipStr2Long(String ipaddress) {
		long[] ip = new long[4];
		int i = 0;
		for (String ipStr : ipaddress.split("\\.")) {
			ip[i] = Long.parseLong(ipStr);
			i++;
		}
		return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
	}

	/**
	 * Long 转 IP(String) ip long to String
	 * */
	public static String ip2IpStr(long ipaddress) {
		StringBuffer sb = new StringBuffer("");
		sb.append(String.valueOf((ipaddress >>> 24)));
		sb.append(".");
		sb.append(String.valueOf((ipaddress & 0x00FFFFFF) >>> 16));
		sb.append(".");
		sb.append(String.valueOf((ipaddress & 0x0000FFFF) >>> 8));
		sb.append(".");
		sb.append(String.valueOf((ipaddress & 0x000000FF)));
		return sb.toString();
	}
}