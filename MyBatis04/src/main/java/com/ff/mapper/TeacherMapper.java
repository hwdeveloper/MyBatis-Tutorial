package com.ff.mapper;

import java.util.List;
import java.util.Map;

import com.ff.po.Teacher;

public interface TeacherMapper {
	/**
	 * 查询所有老师
	 * @return  老师列表
	 */
	public List<Teacher> selectAllTeacher();
	/**
	 * 增加老师
	 * @param teacher
	 * @return  是否成功
	 */
	public int insertTeacher(Map<String, Object> map);
}
