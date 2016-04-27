package com.airshiplay.common.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.AbstractUrlBasedView;

import rx.Observable;

import com.airshiplay.official.config.GlobalObject;

public class OfficialViewResolver extends
		org.springframework.web.servlet.view.InternalResourceViewResolver {
	private String style = "";
	@Autowired
	private GlobalObject globalObject;

	@Override
	protected String getPrefix() {
		return super.getPrefix();
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
		Observable.just(style).subscribe(globalObject.actionSiteStyle());
	}

	@Override
	protected AbstractUrlBasedView buildView(String viewName) throws Exception {
		if (viewName.startsWith("admin")) {
			return super.buildView(viewName);
		}
		return super.buildView(style + "/" + viewName);
	}
}
