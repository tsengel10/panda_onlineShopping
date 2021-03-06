package com.panda.onlineshopping.services;

import java.util.List;

import com.panda.onlineshopping.entities.AuthToken;
import com.panda.onlineshopping.entities.User;

public interface IUserService {

	public User getUserById(int userId);

	public void createUser(User user);

	public User updateUser(User user);

	public void deleteUser(User user);

	public List<User> getAllUsers();

	public User getAdminById(int userId);

	public List<User> getAllAdmins();

	public User authenticateUser(User user);

	public AuthToken generateTokenForUser(User user);

	public List<AuthToken> getAllInactiveAuthTokensByUser(User user);

	public AuthToken getActiveAuthTokenByUser(User user);

	public void createAuthToken(AuthToken authToken);

	public void setInactiveAuthToken(AuthToken authToken);

	public boolean isActiveToken(String token);

	public AuthToken getTokenByToken(String token);

}
