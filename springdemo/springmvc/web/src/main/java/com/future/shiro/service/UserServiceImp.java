package com.future.shiro.service;

import java.util.HashSet;
import java.util.Set;

import com.future.shiro.entity.User;

public class UserServiceImp implements  UserService {

	
    private PasswordHelper passwordHelper;
    public void setPasswordHelper(PasswordHelper passwordHelper) {
        this.passwordHelper = passwordHelper;
    }
    @Override
	public User createUser(User user) {
        //��������
        passwordHelper.encryptPassword(user);
		return null;
	}

	@Override
	public void changePassword(Long userId, String newPassword) {
        /*User user =userDao.findOne(userId);
        user.setPassword(newPassword);
        passwordHelper.encryptPassword(user);*/
		
	}

	@Override
	public void correlationRoles(Long userId, Long... roleIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uncorrelationRoles(Long userId, Long... roleIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findByUsername(String username) {
		User user=new User("chenke","chenke");
        passwordHelper.encryptPassword(user);

		return user;
	}

	@Override
	public Set<String> findRoles(String username) {
		HashSet<String> set=new HashSet<String>();
		set.add("admin");
		return set;
	}

	@Override
	public Set<String> findPermissions(String username) {
		HashSet<String> set=new HashSet<String>();
		set.add("write");
		return set;
	}

}
