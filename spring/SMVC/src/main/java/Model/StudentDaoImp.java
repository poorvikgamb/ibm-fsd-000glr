package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import Controller.Student;

@Component(value="sDao")
public class StudentDaoImp implements StudentDao {
	
	private JdbcTemplate template;

	public StudentDaoImp(DataSource source) {
		super();
	template = new JdbcTemplate(source);	
	}

	public void insert(Student student) {
		String query = "insert into student1 (first_name,last_name,country,language1) values (?,?,?,?)";
		template.update(query, 
				student.getFirstName(),
				student.getLastName(),
				student.getCountry(),
				student.getFavoriteLanguage());		
	}

	public void delete(int id) {
		String query = "delete from student where id=?";
		template.update(query,id);
	}

	public void get(int id) {
		String query = "select * from student where id = ?";
		template.update(query, new ResultSetExtractor<Student>() {

			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next())
				{
					Student s = new Student();
					s.setFirstName(rs.getString(2));
					s.setLastName(rs.getString(3));
					s.setCountry(rs.getString(4));
					s.setFavoriteLanguage(rs.getString(5));
				}
				return null;
			}
			
		});
		
	}

	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
	   String query = "select * from student";
	   List <Student> list = template.query(query, new RowMapper<Student>() {

		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Student s = new Student();
			if(rs.next())
			{
				s.setFirstName(rs.getString(2));
				s.setLastName(rs.getString(3));
				s.setCountry(rs.getString(4));
				s.setFavoriteLanguage(rs.getString(5));
			}
			return null;
		}   
	   });
		return null;
	}

	
}
