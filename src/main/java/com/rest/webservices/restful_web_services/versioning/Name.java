package com.rest.webservices.restful_web_services.versioning;

public class Name {
	private String first_name;
	private String second_name;

	public Name(String first_name, String second_name) {
		super();
		this.first_name = first_name;
		this.second_name = second_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	@Override
	public String toString() {
		return "PersonV2 [first_name=" + first_name + ", second_name=" + second_name + "]";
	}

}
