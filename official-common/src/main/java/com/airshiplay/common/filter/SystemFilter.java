package com.airshiplay.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airshiplay.common.constants.SessionConstants;

public class SystemFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		req.getRequestURL();
		HttpSession session = req.getSession();

		if (!req.getRequestURL().toString().contains("/admin/login")
				&& (session == null || session
						.getAttribute(SessionConstants.SESSION_USER) == null)) {
			String contentType = req.getHeader("Content-Type");
			String url = req.getRequestURL().toString();
			if ("application/json".equals(contentType)) {
				resp.setHeader("Content-Type", "application/json;charset=UTF-8");
				resp.getOutputStream().write(
						redirectJSON(req.getContextPath() + "/admin/login").getBytes("utf-8"));
				resp.getOutputStream().flush();
				resp.getOutputStream().close();
			} else {
				session.setAttribute(SessionConstants.SESSION_LATEST_Servlet_Path,
						req.getServletPath());
				session.setAttribute(SessionConstants.SESSION_LATEST_URL, url);
				resp.sendRedirect(req.getContextPath() + "/admin/login");
			}
		} else {
			chain.doFilter(request, response);
		}
	}

	private String redirectJSON(String redirectUrl) {
		return "{\"resultcode\": 302,\"resultmsg\": \"跳转，需要登录\",\"redirectUrl\": \"" + redirectUrl + "\"}";
	}

	@Override
	public void destroy() {

	}

}
