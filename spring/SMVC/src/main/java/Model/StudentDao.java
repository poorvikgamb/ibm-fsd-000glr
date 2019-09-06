package Model;

import java.util.List;

import Controller.Student;

public interface StudentDao {
	
	public void insert(Student student);
	
	public void delete (int id);
	
	public void get(int id);
	
	public List<Student> getStudentList();
 
}
