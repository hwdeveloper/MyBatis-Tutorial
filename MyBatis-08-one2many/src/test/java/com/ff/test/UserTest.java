package com.ff.test;

import com.ff.bean.User;
import com.ff.mapper.IUserMapper;
import com.ff.mybatis.util.DBUtil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class UserTest {

	
	public static void main(String[] args) {
		UserTest test = new UserTest();
		test.findAll();
	}

  
    public void findAll(){
    	
    	SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		IUserMapper mapper = session.getMapper(IUserMapper.class);
        List<User> users = mapper.findAll();
        for(User user : users){
            System.out.println(user);
        }
    }



}
