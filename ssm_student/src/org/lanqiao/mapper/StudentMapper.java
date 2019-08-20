package org.lanqiao.mapper;

import org.lanqiao.entity.Student;

public interface StudentMapper {
	public void addStudent(Student student);
	public Student queryStudentByStuNo(int stuNo);
	public void deleteStudentByNo(Integer stuNo);
	public void updateStudentByNo(Student student);
}
