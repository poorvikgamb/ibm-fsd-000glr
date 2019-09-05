package Poorvik.FirstTimeSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Poorvik.FirstTimeSpring.bean.BaseballCoach;
import Poorvik.FirstTimeSpring.bean.Coach;
import Poorvik.FirstTimeSpring.bean.CricketCoach;
import Poorvik.FirstTimeSpring.bean.Employee;
import Poorvik.FirstTimeSpring.bean.Prop;

public class App 
{
    public static void main( String[] args )
    {
        try {
			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("applicationContext.xml");
			//Coach myCoach = context.getBean("theCoach",BaseballCoach.class);
			//System.out.println(myCoach.getDailyWorkOut());
			CricketCoach theCricket  =  context.getBean("theCricket",CricketCoach.class);
			System.out.println(theCricket.getDailyWorkOut() + " " + theCricket.getMyLuck());
			Prop prop = context.getBean("prop",Prop.class);
			System.out.println(prop.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
