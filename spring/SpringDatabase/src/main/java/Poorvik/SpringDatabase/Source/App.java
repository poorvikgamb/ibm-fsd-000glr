package Poorvik.SpringDatabase.Source;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        EmployeeDao dao= context.getBean("eDao",EmployeeDao.class);
        dao.createEmployee(new Employee("sundar"));
    }
}
