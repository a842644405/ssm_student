package org.lanqiao.controller;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.entity.Student;
import org.lanqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("StudentController")
public class StudentController {
	@Autowired 
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	//get 查询学生
	@RequestMapping(value="queryStudentByNo",method= RequestMethod.GET)
	public String queryStudentByNo(@RequestParam Integer stuNo,Map<String, Object> map) {
		Student student = studentService.queryStudentByNo(stuNo);		
		map.put("student", student);
		return "result";
	}
	
	@RequestMapping(value="addStudent",method= RequestMethod.POST)
	public String addStudentByNo(@RequestParam Integer stuNo,
								 @RequestParam String stuName,
								 @RequestParam Integer stuAge) {
		Student student = new Student(stuNo, stuName, stuAge);
		studentService.addStudent(student);		
		System.out.println("增加成功");
		return "result";
	}
	
	@RequestMapping(value="deleteStudentByNo")
	public String deleteStudentByNo(@RequestParam Integer stuNo) {
		studentService.deleteStudentByNo(stuNo);
		System.out.println("delete successfully");
		return "result";
	}
	//update
	@RequestMapping(value="updateStudentByNo",method= RequestMethod.POST)
	public String updateStudentByNo(@RequestParam Integer stuNo,
								 @RequestParam String stuName,
								 @RequestParam Integer stuAge) {
		Student student = studentService.queryStudentByNo(stuNo);
		student.setStuName(stuName);
		student.setStuAge(stuAge);
		studentService.updateStudentByNo(student);
		System.out.println("update成功");
		return "result";
	}
}
