package com.ff.mapper;

import java.util.List;

import com.ff.po.ClassRoom;

public interface ClassRoomMapper {

	/**
	 * ��ѯ���еĽ���
	 * 
	 * @return
	 */
	public ClassRoom selectClass();

	/**
	 * ��ý���
	 * 
	 * @return ���Ҷ���
	 */
	public List<ClassRoom> selectAllClassAndStu();
}