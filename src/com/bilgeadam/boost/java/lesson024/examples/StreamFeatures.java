package com.bilgeadam.boost.java.lesson024.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFeatures {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();

		users.add(new User(1, "Semih"));
		users.add(new User(2, "Tugce"));
		users.add(new User(3, "Alp"));
		users.add(new User(4, "Nisa"));
		users.add(new User(5, "Sarp"));
		users.add(new User(6, "Yase"));
		users.add(new User(7, "Esin"));

//		users.stream().forEach(user -> System.out.println(user));

//		users.stream().forEach(user -> {
//			System.out.println("Java8");
//			System.out.println(user);
//			});

//		users.stream().forEach(user -> user.talk());
//
//		users.stream().forEach(User::talk); //method referance

		// id'si 5 ten büyük elemanların adetini buldum
//		long count = users.stream().filter(user -> user.id > 5).count();
//		System.out.println("count :" + count);

//		// id'si 4 ten büyük elemanların talk methodunu çalıştırdım
//		List<User> filteredList = users.stream().filter(user -> user.id > 4).collect(Collectors.toList());
//		filteredList.stream().forEach(User::talk);

		List<User> mappedList = users.stream().map(user -> new User(user.id + 100, user.name))
				.collect(Collectors.toList());

		mappedList.stream().forEach(user -> System.out.println(user));

		Map<Integer, String> userMap = users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
		userMap.forEach((key, value) -> System.out.println(key + " : " + value));
		;

	}

}
