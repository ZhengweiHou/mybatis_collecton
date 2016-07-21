package me.hzw.mybatis_collection.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * ��ȡmybatis session�Ĺ�����
 * @author houzw
 *
 */
public class MybatisUtil {

	public static SqlSessionFactory getSessionFactory(){
		String source = "conf.xml";
		InputStream is = MybatisUtil.class.getClassLoader().getResourceAsStream(source);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sessionFactory;			
	}
	
	public static SqlSession getSqlSession(){
		return MybatisUtil.getSessionFactory().openSession();
	}
	
	
	public static SqlSession getSqlSession(Boolean isAutoCommit){
		return MybatisUtil.getSessionFactory().openSession(isAutoCommit);
	}
	
}
