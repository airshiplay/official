package com.airshiplay.official.web.model;

public class ResultMessage<T> {
	private T content;

	public ResultMessage(T t) {
		this.content = t;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
