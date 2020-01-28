package com.ff.mapper;

import java.util.List;

import com.ff.po.Student;

public interface StudentMapper {
	/**
	 * 增加学生
	 * @param Student
	 * @return  是否成功
	 */
	public int insertStudent(Student student);
	
	/**
	 * 删除当前的学生
	 * @param student
	 * @return 是否成功
	 */
	public int deleteStudentById(Student student);
	
	/**
	 * 更新学生
	 * @param student
	 * @return
	 */
	public int updateStudentById(Student student);
	
	/**
	 * 
	 * @return  学生总数
	 */
	public int totalizeStudent();
	
	/**
	 * 获得学生的名字
	 * @param student
	 * @return
	 */
	public String getNameById(Student student);
	
	/**
	 * 查询所有的学生
	 * @return
	 */
	public List<Student> selectAllStudent();
	
	/**
	 * 获得学生对象
	 * @return
	 */
	public Student selectStudentById(Student student);
	
	
	
}
