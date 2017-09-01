package com.zhm.db;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 链接数据库
 *
 * @author ZhangHuanmeng
 *         <p>
 *         2017年8月31日
 */
public class DBConnect {
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            //通过配置文件获得连接信息
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //通过配置信息构建SqlSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        if(sqlSessionFactory == null) {
            throw new RuntimeException("sqlSessionFactory is null");
        }
        //通过sqlSessionFactory打开一个数据库会话
        return sqlSessionFactory.openSession();
    }
}
