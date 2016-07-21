package me.hzw.mybatis_collection.test;

import static org.junit.Assert.*;

import me.hzw.mybatis_collection.domain.Classes;
import me.hzw.mybatis_collection.util.MybatisUtil;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SelectClassesTest {

	@Test
	public void getClasses1(){
		SqlSession session = MybatisUtil.getSqlSession();
		String statement = "me.hzw.mybatis_collection.mapping.classesMapper.getClasses1";
		Classes clazzes = session.selectOne(statement, 1);
		System.out.println(clazzes);
		session.close();
	}
	
	@Test
	public void getClasses2(){
		SqlSession session = MybatisUtil.getSqlSession();
		String statement = "me.hzw.mybatis_collection.mapping.classesMapper.getClasses2";
		Classes clazzes = session.selectOne(statement, 1);
		System.out.println(clazzes);
		session.close();
	}
	
	@Test
	public void getClasses3(){
		SqlSession session = MybatisUtil.getSqlSession();
		String statement = "me.hzw.mybatis_collection.mapping.classesMapper.getClasses3";
		Classes clazzes = session.selectOne(statement, 1);
		System.out.println(clazzes);
		session.close();
	}
	
	@Test
	public void getClasses4(){
		SqlSession session = MybatisUtil.getSqlSession();
		String statement = "me.hzw.mybatis_collection.mapping.classesMapper.getClasses4";
		Classes clazzes = session.selectOne(statement, 1);
		System.out.println(clazzes);
		session.close();
	}

}
