package com.tabuyos.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Tabuyos
 * @Time 3/16/20 12:56 AM
 * @Site www.tabuyos.com
 * @Email tabuyos@outlook.com
 * @Description
 */
@SpringBootApplication(scanBasePackages = {"com.tabuyos.microservice"})
public class UserApplication {
  public static void main(String[] args) {
    SpringApplication.run(UserApplication.class);
  }
}
