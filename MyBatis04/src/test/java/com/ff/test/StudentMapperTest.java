package com.ff.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.ff.mapper.StudentMapper;
import com.ff.po.Student;
import com.ff.util.DBUtil;

public class StudentMapperTest {

	public void insertStudent() {
		// ����SqlSession�Ự����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// ��������ӳ����
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		// ����ѧ������
		Student student = new Student();
		student.setName("С��");
		student.setClassroomId(1);
		// ��������
		studentMapper.insertStudent(student);
		// �Ự�ύ
		session.commit();
		// �Ự�ر�
		session.close();
	}

	public void deleteStudent() {
		// ����SqlSession�Ự����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// ��������ӳ����
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		// ����ѧ������
		Student student = new Student();
		student.setId(2);
		// ��������
		studentMapper.deleteStudentById(student);
		// �Ự�ύ
		session.commit();
		// �Ự�ر�
		session.close();
	}

	public void updateStudent() {
		// ����SqlSession�Ự����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// ��������ӳ����
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		// ����ѧ������
		Student student = new Student();
		student.setId(2);
		student.setName("Сǿ");
		student.setClassroomId(2);
		// ��������
		studentMapper.updateStudentById(student);
		// �Ự�ύ
		session.commit();
		// �Ự�ر�
		session.close();
	}

	public void totalizeStudent() {
		// ����SqlSession�Ự����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// ��������ӳ����
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		// ���ѧ������
		int number = studentMapper.totalizeStudent();
		System.out.print(number);
		// �Ự�ύ
		session.commit();
		// �Ự�ر�
		session.close();
	}

	public void getNameById() {
		// ����SqlSession�Ự����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// ��������ӳ����
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		// ����ѧ������
		Student student = new Student();
		student.setId(2);
		// ���ѧ������
		String name = studentMapper.getNameById(student);
		System.out.print(name);
		// �Ự�ύ
		session.commit();
		// �Ự�ر�
		session.close();
	}

	public void selectAllStudent() {
		// ����SqlSession�Ự����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// ��������ӳ����
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		// ���ѧ���б�
		List<Student> list = studentMapper.selectAllStudent();
		System.out.print(list);
		// �Ự�ύ
		session.commit();
		// �Ự�ر�
		session.close();
	}

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
		test.selectAllStudent();
	}
}