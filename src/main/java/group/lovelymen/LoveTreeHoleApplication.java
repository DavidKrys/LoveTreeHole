package group.lovelymen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("group.lovelymen.dao")
public class LoveTreeHoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveTreeHoleApplication.class, args);
	}

}
