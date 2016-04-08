package com.airshiplay.ftp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.ftpserver.impl.DefaultFtpServer;
import org.slf4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * ftp 服务，配置在web.xml文件中
 * 
 * @author lig
 *
 */
public class FtpServerListener implements ServletContextListener {
	static Logger logger = org.slf4j.LoggerFactory
			.getLogger(FtpServerListener.class);

	public void contextInitialized(ServletContextEvent contextEvent) {
		logger.info("Starting FtpServer");
		WebApplicationContext ctx = WebApplicationContextUtils
				.getWebApplicationContext(contextEvent.getServletContext());
		DefaultFtpServer server = (DefaultFtpServer) ctx.getBean("ftpServers");
		contextEvent.getServletContext().setAttribute("FTPSERVER_CONTEXT_NAME",
				server);
		try {
			server.start();
			logger.info("FtpServer started");
		} catch (Exception e) {
			logger.error("FtpServer", e);
			throw new RuntimeException("Failed to start FtpServer", e);
		}
	}

	public void contextDestroyed(ServletContextEvent contextEvent) {
		logger.info("Stopping FtpServer");
		DefaultFtpServer server = (DefaultFtpServer) contextEvent
				.getServletContext().getAttribute("FTPSERVER_CONTEXT_NAME");
		if (server != null) {
			server.stop();
			contextEvent.getServletContext().removeAttribute(
					"FTPSERVER_CONTEXT_NAME");
			logger.info("FtpServer stopped");
		} else {
			logger.info("No running FtpServer found");
		}
	}
}