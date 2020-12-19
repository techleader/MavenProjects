package org.school;
//import org.school.config.FileConfig;
import org.school.config.MySqlConfig;
import org.school.model.Student;
import org.school.service.DataService;
import org.school.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@EnableAutoConfiguration
//@ComponentScan("org.school.*")
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] s) {
        ApplicationContext context = SpringApplication.run(MySqlConfig.class, s);
        StudentService studentService = context.getBean(StudentService.class);
        long count = studentService.getCountOfAllStudent();
        System.out.println(count);
        Scanner student =new Scanner(System.in);
        System.out.println("Enter Your First Name");
        String firstName=student.nextLine();
        System.out.println("Enter Your Last Name :");
        String lastName= student.nextLine();
        System.out.println("Enter your Email :");
        String email=student.nextLine();
        System.out.println("Enter Password :");
        String password = student.nextLine();
        System.out.println("Enter Your Address :");
        String address =student.nextLine();
        System.out.println("Select your State ");
        String state = student.next();
        System.out.println("Select Your Gender");
        String sex = student.next();
        System.out.println("Select Your Marital Status :");
        String maritalStatus = student.next();

        studentService.addNewStudent(new Student(firstName,lastName,email,password,address,state,sex,maritalStatus));
        System.out.println("Student saved");
//       studentService.dataDelete();
//        System.out.println("Data Deleted");



    }

}
