package cn.personage.common.studys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.personage.common.studys.mapper")
public class StudysApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudysApplication.class, args);
    }

}
