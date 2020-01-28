package com.ff.mapper;

import java.util.List;

import com.ff.po.Student;

public interface StudentMapper {
	/**
	 * ����ѧ��
	 * @param Student
	 * @return  �Ƿ�ɹ�
	 */
	public int insertStudent(Student student);
	
	/**
	 * ɾ����ǰ��ѧ��
	 * @param student
	 * @return �Ƿ�ɹ�
	 */
	public int deleteStudentById(Student student);
	
	/**
	 * ����ѧ��
	 * @param student
	 * @return
	 */
	public int updateStudentById(Student student);
	
	/**
	 * 
	 * @return  ѧ������
	 */
	public int totalizeStudent();
	
	/**
	 * ���ѧ��������
	 * @param student
	 * @return
	 */
	public String getNameById(Student student);
	
	/**
	 * ��ѯ���е�ѧ��
	 * @return
	 */
	public List<Student> selectAllStudent();
	
	/**
	 * ���ѧ������
	 * @return
	 */
	public Student selectStudentById(Student student);
	
	
	
}