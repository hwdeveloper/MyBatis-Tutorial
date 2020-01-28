package com.ff.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.ff.mapper.ClassRoomMapper;
import com.ff.po.ClassRoom;
import com.ff.util.DBUtil;

public class ClassMapperTest {

	public void insertClassRoom() {
		// ����SqlSession�Ự����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// ��������ӳ����
		ClassRoomMapper classRoomMapper = session.getMapper(ClassRoomMapper.class);
		// ��������
		classRoomMapper.insertClassRoom("һ��", 1);
		// �Ự�ύ
		session.commit();
		// �Ự�ر�
		session.close();
	}

	public void selectAllClass() {
		// ����SqlSession�Ự����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// ��������ӳ����
		ClassRoomMapper classRoomMapper = session.getMapper(ClassRoomMapper.class);
		// ��������
		List<ClassRoom> rooms=classRoomMapper.selectAllClass();
		System.out.print(rooms);
		// �Ự�ύ
		session.commit();
		// �Ự�ر�
		session.close();
	}
	
	public void selectAllClassAndStu(){
		// ����SqlSession�Ự����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		// ��������ӳ����
		ClassRoomMapper classRoomMapper = session.getMapper(ClassRoomMapper.class);
		// ��������
		List<ClassRoom> rooms=classRoomMapper.selectAllClassAndStu();
		System.out.print(rooms);
		// �Ự�ύ
		session.commit();
		// �Ự�ر�
		session.close();
	}

	public static void main(String[] args) {
		ClassMapperTest test = new ClassMapperTest();
		test.selectAllClassAndStu();
	}
}