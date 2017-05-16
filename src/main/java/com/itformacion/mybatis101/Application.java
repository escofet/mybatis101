package com.itformacion.mybatis101;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Application {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis101.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try {
			List<Discount> discounts = session.selectList("com.itformacion.mybatis101.DiscountMapper.showDiscounts");
			System.out.println(discounts);
		} finally {
			session.close();
		}
	}
}