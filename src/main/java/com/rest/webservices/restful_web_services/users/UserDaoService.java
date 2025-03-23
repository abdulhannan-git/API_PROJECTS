package com.rest.webservices.restful_web_services.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<User>();
	private static int usersCount = 0;
	static {
		users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(20)));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
	}

	public User save(@PathVariable User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
}
