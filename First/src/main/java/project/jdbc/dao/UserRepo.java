package project.jdbc.dao;

import java.util.List;

import project.jdbc.domain.User;

public interface UserRepo {
	public List<User> findAll();
	public User findUserById(int id);
	public User create(final User user);
}
