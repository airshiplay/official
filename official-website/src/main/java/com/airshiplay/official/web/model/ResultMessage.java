package com.airshiplay.official.web.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultMessage<T> {
	private T content;
	private int resultcode;
	private String resultmsg;
	private String redirectUrl;

	public ResultMessage(int resultCode, String resultMessage) {
		this.resultcode = resultCode;
		this.resultmsg = resultMessage;
	}

	public static <T> ResultMessage<T> fail(String msg) {
		ResultMessage<T> result = new ResultMessage<T>(500, msg);
		return result;
	}

	public static <T> ResultMessage<T> success(String msg) {
		ResultMessage<T> result = new ResultMessage<T>(200, msg);
		return result;
	}

	public static <T> ResultMessage<T> redirectUrl(String redirectUrl) {
		ResultMessage<T> result = new ResultMessage<T>(302, null);
		result.setRedirectUrl(redirectUrl);
		return result;
	}

	public ResultMessage(T t) {
		this.content = t;
		this.resultcode = 200;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public int getResultcode() {
		return resultcode;
	}

	public void setResultcode(int resultCode) {
		this.resultcode = resultCode;
	}

	public String getResultmsg() {
		return resultmsg;
	}

	public void setResultmsg(String resultMessage) {
		this.resultmsg = resultMessage;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
