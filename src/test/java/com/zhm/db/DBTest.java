package com.zhm.db;

import com.zhm.entity.User;
import com.zhm.service.UserService;
import com.zhm.serviceimpl.UserServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * 测试数据库能否连接
 * 
 * @author ZhangHuanmeng
 *
 * 2017年8月31日
 */
public class DBTest {

	@Test
	public void testSqlSession(){
		SqlSession session = DBConnect.getSqlSession();
		if (session == null) {
			System.out.println("null");
		}
	}

	@Test
	public void testAddUser() {
		User user = new User();
		user.setUsername("b");
		user.setPassword("123456");
		UserService userService = new UserServiceImpl();
		boolean result = userService.userAdd(user);
		System.out.println(result);
	}

	@Test
	public void testSelect() {
		User user = new User();
		user.setUsername("c");
		user.setPassword("123456");
		UserService userService = new UserServiceImpl();
		boolean result = userService.userLogin(user);
		System.out.println(result);

	}

}