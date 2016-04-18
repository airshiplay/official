package com.airshiplay.official.web.model;

public class ResultMessage<T> {
	private T content;
	private int resultcode;
	private String resultmsg;

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

}
