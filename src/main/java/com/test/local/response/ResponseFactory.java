package com.test.local.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseFactory {

	public static class Unsuccess extends Response {
		public Unsuccess(String message) {
			this.setMessage(message);
			this.setStatus(false);
		}
	}

	public static class Success extends Response {
		@JsonProperty
		private Map<String, Object> data = new HashMap<String, Object>();

		public Success(Map<String, Object> data, String message) {
			this.setMessage(message);
			this.setData(data);
			this.setStatus(true);
		}

		public Map<String, Object> getData() {
			return data;
		}

		public void setData(Map<String, Object> data) {
			this.data = data;
		}

	}

	public static Success successfulResponse(Map<String, Object> data, String message) {
		Success succes = new Success(data, message);
		return succes;
	}

	public static Unsuccess unsuccessfulResponse(String message) {
		Unsuccess unsuccess = new Unsuccess(message);
		return unsuccess;
	}
}
