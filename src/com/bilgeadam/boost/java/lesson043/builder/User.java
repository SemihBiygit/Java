package com.bilgeadam.boost.java.lesson043.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

// Builder example 
public class User {
	
	public static void main(String[] args) {
		User user = new User.UserBuilder("Semih", "Biygit")
				.age(25)
				.adress("Bursa")
				.phoneNumber("123")
				.build();
		
		StringBuilder builder = new StringBuilder("Temp");
		String data = builder.append(1).append(true).append("friend").toString();
		System.out.println(data);
		System.out.println(user);
	}

	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phoneNumber;
	private final String address;

	public User(UserBuilder userBuilder) {
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.age = userBuilder.age;
		this.phoneNumber = userBuilder.phoneNumber;
		this.address = userBuilder.address;
	}

	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String phoneNumber;
		private String address;

		public UserBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;

		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public UserBuilder adress(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}

	}

}
