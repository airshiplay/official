package com.airshiplay.official.web.model;

public class ResultMessage<T> {
	private T content;
	private int resultCode;
	private String resultMessage;

	public ResultMessage() {
		this.resultCode = 200;
	}

	public ResultMessage(T t) {
		this.content = t;
		this.resultCode = 200;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

}
