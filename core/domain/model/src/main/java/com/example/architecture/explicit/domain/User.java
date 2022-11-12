package com.example.architecture.explicit.domain;


import lombok.Value;

public class User {


	@Value
	public static class UserId {
		Integer value;
	}
}
