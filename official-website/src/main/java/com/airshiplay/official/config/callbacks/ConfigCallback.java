package com.airshiplay.official.config.callbacks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.airshiplay.official.config.ConfigInfo;
import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;

@DisconfUpdateService(classes = { ConfigInfo.class })
public class ConfigCallback implements IDisconfUpdate {
	  protected static final Logger LOGGER = LoggerFactory
	            .getLogger(ConfigCallback.class);
	@Override
	public void reload() throws Exception {
		LOGGER.debug("ConfigInfo  reload");
	}

}
