package com.airshiplay.common.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class IpUtilTest {

	@Test
	public void testIp2IpStr() {
		assertEquals("1.1.2.0", IpUtil.ip2IpStr(16843264));
		assertEquals("1.1.63.255", IpUtil.ip2IpStr(16859135));
		// System.out.println(IpUtil.ip2IpStr(16859135));
	}

}
