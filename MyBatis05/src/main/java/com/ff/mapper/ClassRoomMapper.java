package com.ff.mapper;

import java.util.List;

import com.ff.po.ClassRoom;

public interface ClassRoomMapper {

	/**
	 * 查询所有的教室
	 * 
	 * @return
	 */
	public ClassRoom selectClass();

	/**
	 * 获得教室
	 * 
	 * @return 教室对象
	 */
	public List<ClassRoom> selectAllClassAndStu();
}
