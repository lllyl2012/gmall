package top.lllyl2012.gmall.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "top.lllyl2012.gmall.manage.mapper")
public class GmallManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallManageApplication.class, args);
    }

}
