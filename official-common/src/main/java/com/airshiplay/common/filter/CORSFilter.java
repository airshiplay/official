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

/**
 * 解决跨域请求 filter
 * 
 * @author lig
 *
 */
public class CORSFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		request.getHeader("Origin");
		// 解决跨域请求问题
		HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin",
				request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Headers",
				"x-requested-with,accept, content-type");
		response.setHeader("Access-Control-Allow-Methods",
				"POST, GET, OPTIONS, DELETE");
		// response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("XDomainRequestAllowed", "1");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		chain.doFilter(req, res);

	}

	public void init(FilterConfig filterConfig) {
	}

	public void destroy() {
	}

}
