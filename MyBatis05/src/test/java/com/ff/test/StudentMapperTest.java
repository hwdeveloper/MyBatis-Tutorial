package com.ff.test;

import org.apache.ibatis.session.SqlSession;
import com.ff.mapper.StudentMapper;
import com.ff.po.Student;
import com.ff.util.DBUtil;

public class StudentMapperTest {

	public void selectStudentById() {
		// ����SqlSession�Ự����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// ��������ӳ����
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		Student student = new Student();
		student.setId(2);
		// ���ѧ���б�
		 student = studentMapper.selectStudentById(student);
		System.out.print(student);
		// �Ự�ύ
		session.commit();
		// �Ự�ر�
		session.close();
	}

	public static void main(String[] args) {
		StudentMapperTest test = new StudentMapperTest();
		test.selectStudentById();
	}
}