package com.ff.mapper;

import java.util.List;

import com.ff.po.Student;

public interface StudentMapper {

	/**
	 * 增加学生
	 * 
	 * @param Student
	 * @return 是否成功
	 */
	public int insertStudent(Student student);

	/**
	 * 查询所有的学生
	 * 
	 * @return
	 */
	public List<Student> selectAllStudent();

}
