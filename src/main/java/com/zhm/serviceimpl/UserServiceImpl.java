package com.zhm.serviceimpl;

import com.zhm.dao.UserDao;
import org.apache.ibatis.session.SqlSession;

import com.zhm.db.DBConnect;
import com.zhm.entity.User;
import com.zhm.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean userLogin(User u) {
		SqlSession sqlSession = DBConnect.getSqlSession();
		User user = null;
		try {
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			user = userDao.select(u.getUsername(), u.getPassword());
		} finally {
			sqlSession.close();
		}
		return user != null;
	}

	@Override
	public boolean userAdd(User u) {
		SqlSession sqlSession = DBConnect.getSqlSession();
		int count = 0;
		try {
			UserDao userDao = sqlSession.getMapper(UserDao.class);
			count = userDao.insert(u);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}

		return count > 0;
	}

	@Override
	public boolean userDelete(int id) {

		return false;
	}

}
