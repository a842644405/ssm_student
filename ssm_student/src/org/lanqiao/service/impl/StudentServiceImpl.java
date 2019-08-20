package org.lanqiao.service.impl;

import org.lanqiao.entity.Student;
import org.lanqiao.mapper.StudentMapper;
import org.lanqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
@Service("studentService")
public class StudentServiceImpl implements StudentService {
	//service依赖dao（mapper）
	@Autowired
	private StudentMapper studentMapper;
	//set
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	@Override
	public Student queryStudentByNo(int stuNo) {
		Student student= studentMapper.queryStudentByStuNo(stuNo);	
		return student;
	}
	@Override
	public void addStudent(Student student) {
		 studentMapper.addStudent(student);
	}
	@Override
	public void deleteStudentByNo(Integer stuNo) {
		studentMapper.deleteStudentByNo(stuNo);
	}
	@Override
	public void updateStudentByNo(Student student) {
		studentMapper.updateStudentByNo(student);
	}
	
}
