package com.unicom.test;

import com.unicom.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 *
 */
public class MyTest {
    SqlSession sqlSession;

    @Before  //在所有的@Test方法执行前先执行的代码
    public void openSqlSession() throws IOException {
        //使用文件流读取核心配置文件SqlMapConfig.xml
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //取出sqlSession的对象
        sqlSession = factory.openSession();
    }

    @After
    public void closeSqlSession(){
        //关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void testGetAll() throws IOException {
        //完成查询操作
        List<Student> list = sqlSession.selectList("zar.getAll");
        list.forEach(student -> System.out.println(student));
    }

    @Test
    public void testGetById() throws IOException {
        //按主键查学生
        Student stu = sqlSession.selectOne("zar.getById",3);
        System.out.println(stu);
    }

    @Test
    public void testGetByName()throws IOException{

        //4.调用方法
        List<Student> list = sqlSession.selectList("zar.getByName","李");
        list.forEach(student -> System.out.println(student));

    }

    @Test
    public void testInsert()throws IOException{

        //4.调用方法
        int num = sqlSession.insert("zar.insert",new Student("haha0821","haha@126.com",23));
        //切记切记切记:在所有的增删改后必须手工提交事务!!!
        sqlSession.commit();

    }

    @Test
    public void testDelete()throws IOException {

        //4.调用方法
        int num = sqlSession.delete("zar.delete",1);
        System.out.println(num);
        //切记切记切记:在所有的增删改后必须手工提交事务!!!
        sqlSession.commit();

    }

    @Test
    public void testUpdate()throws IOException {
        Student studentNew = new Student(10, "hehe-new", "hehe@126.com", 111);
        //4.调用方法
        int num = sqlSession.update("zar.update",studentNew);
        System.out.println(num);
        sqlSession.commit();

    }
}
