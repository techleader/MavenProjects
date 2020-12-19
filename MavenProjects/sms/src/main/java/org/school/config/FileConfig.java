//package org.school.config;
//
//
//import org.school.model.Student;
//import org.school.repository.CustomerRepository;
//import org.school.service.DataService;
//import org.school.service.FileDataService;
//import org.school.service.MySqlDataService;
//import org.school.service.StudentService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;;
//
//@Profile("file")
//@Configuration
//public class FileConfig {
//
//    private static final Logger log = LoggerFactory.getLogger(FileConfig.class);
//
//    @Bean
//    public DataService FileDataService() {
//        FileDataService service = new FileDataService();
//        return service;
//    }
//
//    @Bean
//    public StudentService studentService(){
//        return new StudentService();
//    }
//
//
//}
//
