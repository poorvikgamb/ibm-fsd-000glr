package Poorvik.Annotaions.imp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PoorvikConfig.class);
    }
}
