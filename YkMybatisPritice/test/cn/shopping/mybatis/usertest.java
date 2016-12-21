package cn.shopping.mybatis;



import cn.shopping.mybatis.mapper.Usermapper;
import cn.shopping.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created by tpusers on 2016/12/20.
 */
public class usertest {
    private SqlSessionFactory sqlSessionFactory;

    // 此方法是在执行testFindUserById之前执行
    @Before
    public void setUp() throws Exception {
        // 创建sqlSessionFactory

        // mybatis配置文件
        String resource = "SqlMapConfig.xml";
        // 得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂，传入mybatis的配置文件信息
        sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);
    }

    //用户信息的综合 查询
    @Test
    public void testFindUserByUsername() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Usermapper usermapper = sqlSession.getMapper(Usermapper.class);
        List<User> userlist = usermapper.finduserbyusername("y");
        System.out.println(userlist);

    }
    //用户信息的综合 插入
    @Test
    public void testinsertuser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Usermapper usermapper = sqlSession.getMapper(Usermapper.class);
        Date date = new Date(1994-01-29);
        User user = new User("648049530","yk","m",date,"zju");
        usermapper.insertuser(user);
        sqlSession.commit();
    }

    //用户信息的综合 更新
    @Test
    public void testupdateuser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Usermapper usermapper = sqlSession.getMapper(Usermapper.class);
        Date date = new Date(1994-01-29);
        User user = new User("648049530","yk","m",date,"zju");
        usermapper.updateuserbyid(user);
        sqlSession.commit();
    }
}
