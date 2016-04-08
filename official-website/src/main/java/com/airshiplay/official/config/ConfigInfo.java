package com.airshiplay.official.config;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Singleton
@Component("configInfo")
public class ConfigInfo {

	@Value("${file.save.dir}")
	private Resource fileSaveDir;

	public Resource getFileSaveDir() {
		return fileSaveDir;
	}

	public void setFileSaveDir(Resource fileSavePath) {
		this.fileSaveDir = fileSavePath;
	}

}
