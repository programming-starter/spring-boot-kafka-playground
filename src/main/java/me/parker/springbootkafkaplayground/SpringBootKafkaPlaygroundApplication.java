package me.parker.springbootkafkaplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringBootKafkaPlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaPlaygroundApplication.class, args);
    }

}
