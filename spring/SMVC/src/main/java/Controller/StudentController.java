package Controller;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.StudentDaoImp;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/showForm")
	public String getStudentView(Model theModel)
	{
		Student student = new Student();
		theModel.addAttribute("student", student);
		return "student-form";
	}

	@PostMapping("/processForm")
	public String postStudentView(@ModelAttribute("theStudent") Student theStudent,Model theModel)
	{
		theModel.addAttribute("tempStudent",theStudent);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDaoImp dao = context.getBean("sDao",StudentDaoImp.class);
		dao.insert(theStudent);
		return "student-process" ;
	}
	
	@GetMapping("/viewStudent")
	public String getStudents(Model theModel)
	{

		System.out.println("working");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		List<Student> list;
		StudentDaoImp dao = context.getBean("sDao",StudentDaoImp.class);
		list = dao.getStudentList();
		theModel.addAttribute("StudentList",list);
		return "view-students";	
	}

}
