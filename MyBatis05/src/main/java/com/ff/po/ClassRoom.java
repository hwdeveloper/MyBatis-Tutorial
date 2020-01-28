package com.ff.po;

import java.util.List;

public class ClassRoom {
	/**
	 * ����id
	 */
	private int id;

	/**
	 * ���ҵ�����
	 */
	private String name;

	/**
	 * ��ʦ��id
	 */
	private int teacherId;
	/**
	 * ѧ���б�
	 */
	private List<Student> students;
	
	/**
	 * ��ʦ
	 */
	private Teacher teacher;

	public ClassRoom() {
		super();
	}

	public ClassRoom(int id, String name, int teacherId, List<Student> students, Teacher teacher) {
		super();
		this.id = id;
		this.name = name;
		this.teacherId = teacherId;
		this.students = students;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "ClassRoom [id=" + id + ", name=" + name + ", teacherId=" + teacherId + ", students=" + students
				+ ", teacher=" + teacher + "]";
	}

	
	
}