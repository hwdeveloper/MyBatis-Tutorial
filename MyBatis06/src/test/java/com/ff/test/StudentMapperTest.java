package com.ff.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.ff.mapper.StudentMapper;
import com.ff.po.Student;
import com.ff.util.DBUtil;

public class StudentMapperTest {

	public void selectStudentById() {
		// 创建SqlSession会话对象
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// 创建教室映射器
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		Student student = new Student();
		student.setName("小王");
		student.setClassroomId(3);
		//增加学生，执行后缓存会清空
		int index=  studentMapper.insertStudent(student);
		System.out.print(index);

		// 会话提交，执行后缓存会清空
		session.commit();
        //sqlSession.clearCache();//执行后缓存会清空
		// 会话关闭
		session.close();
	}

	public void selectAllStudent() {
		
		
		// 创建SqlSession会话对象
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// 创建教室映射器
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		// 获得学生列表
		List<Student> list = studentMapper.selectAllStudent();
		System.out.print(list);
		// 会话提交
		session.commit();
		// 会话关闭
		session.close();
	}
	public static void main(String[] args) {
		StudentMapperTest test = new StudentMapperTest();
		test.selectStudentById();
	}
}
