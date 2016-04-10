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
			
			resp.sendRedirect(req.getContextPath()+"/admin/login");
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {

	}

}
