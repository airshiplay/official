package com.airshiplay.official.config;

import java.net.MalformedURLException;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Component;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

@Singleton
@Scope("singleton")
@Component("configInfo")
@DisconfFile(filename = "office.config.properties")
public class ConfigInfo {

	private Resource fileSaveDir;

	private String remoteFileSaveDir;
	// 代表连接地址
	private String host;

	// 代表连接port
	private int port;

	public Resource getFileSaveDir() {
		try {
			return new UrlResource(getRemoteFileSaveDir());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return fileSaveDir;
	}

	@DisconfFileItem(name = "file.save.dir")
	public String getRemoteFileSaveDir() {
		return remoteFileSaveDir;
	}

	public void setFileSaveDir(Resource fileSavePath) {
		this.fileSaveDir = fileSavePath;
	}

	/**
	 * 地址
	 *
	 * @return
	 */
	@DisconfFileItem(name = "host")
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * 端口
	 *
	 * @return
	 */
	@DisconfFileItem(name = "port")
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
