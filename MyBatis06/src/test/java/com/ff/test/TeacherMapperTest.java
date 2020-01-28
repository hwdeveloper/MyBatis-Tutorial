package com.ff.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.ff.mapper.TeacherMapper;
import com.ff.po.Teacher;
import com.ff.util.DBUtil;

public class TeacherMapperTest {
	
	public void selectAllTeacher() {
		//����SqlSession����
		SqlSession session = DBUtil.getSqlSessionFactory().openSession(); 
		//������ʦӳ����
		TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);
		//�����ʦ�б�
        List<Teacher> list = teacherMapper.selectAllTeacher();
		session.commit();//�ύ
		session.close();
		for (Teacher teacher : list) {
			System.out.println(teacher);
		}
	}
	
	public void insertTeacher() {
		SqlSession session = DBUtil.getSqlSessionFactory().openSession(); 
		TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);
		Map<String, Object> map = new HashMap<>();
		map.put("myName", "����");
		map.put("mySex", "��");
		map.put("myAge", 100);
		map.put("myPwd", "1234567");
		teacherMapper.insertTeacher(map);
		session.commit();//�ύ
		        session.close();
}
	
	public static void main(String[] args) {
		TeacherMapperTest test = new TeacherMapperTest();
		test.insertTeacher();
	}
}






