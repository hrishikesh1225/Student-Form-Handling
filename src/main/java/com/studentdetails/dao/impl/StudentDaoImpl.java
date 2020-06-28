package com.studentdetails.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.studentdetails.dao.StudentDao;
import com.studentdetails.model.Student;

@Repository
public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao{
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	@Override
	public void insertStudent(Student stu) {
		String sql = "INSERT INTO student " +
				"(USN,Full_Name,Father_Name,Email,Phone,Date_Join,B_date,ADMNO,Address,Branch) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				stu.getUSN(), stu.getFull_Name(),stu.getFather_Name(),stu.getEmail(),stu.getPhone(),stu.getDate_Join(),stu.getB_date(),stu.getADMNO(),stu.getAddress(),stu.getBranch()
		});
	}

	
	@Override
	public List<Student> getAllStudents(){
		String sql = "SELECT * FROM student";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Student> result = new ArrayList<Student>();
		for(Map<String, Object> row:rows){
			Student stu = new Student();
			stu.setUSN((String)row.get("USN"));
			stu.setFull_Name((String)row.get("Full_Name"));
			stu.setFather_Name((String)row.get("Father_Name"));
			stu.setEmail((String)row.get("Email"));
			stu.setPhone((String)row.get("Phone"));
			stu.setDate_Join((String)row.get("Date_Join"));
			stu.setB_date((String)row.get("B_date"));
			stu.setADMNO((String)row.get("ADMNO"));
			stu.setAddress((String)row.get("Address"));
			stu.setBranch((String)row.get("Branch"));
			
			result.add(stu);
		}
		
		return result;
	}

	@Override
	public void deleteStudent(Student stu) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM student Where USN = ?" ;
		getJdbcTemplate().update(sql, new Object[]{
				stu.getUSN()
		});
		
	}

	@Override
	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update("update student " + " set Email = ?, Phone = ? ,Address = ?" + " where USN = ?",
				new Object[] {stu.getEmail(),stu.getPhone(),stu.getAddress(),stu.getUSN()});
		
	}

	@Override
	public List<Student> FindStudentById(Student stu){
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList("select * from student where USN=?", new Object[]{stu.getUSN()});
		
		List<Student> result = new ArrayList<Student>();
		for(Map<String, Object> row:rows){
			Student stu1 = new Student();
			stu1.setUSN((String)row.get("USN"));
			stu1.setFull_Name((String)row.get("Full_Name"));
			stu1.setFather_Name((String)row.get("Father_Name"));
			stu1.setEmail((String)row.get("Email"));
			stu1.setPhone((String)row.get("Phone"));
			stu1.setDate_Join((String)row.get("Date_Join"));
			stu1.setB_date((String)row.get("B_date"));
			stu1.setADMNO((String)row.get("ADMNO"));
			stu1.setAddress((String)row.get("Address"));
			stu1.setBranch((String)row.get("Branch"));
			
			result.add(stu);
		}
		
		return result;
	}

}