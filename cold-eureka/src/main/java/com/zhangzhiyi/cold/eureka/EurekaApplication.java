package com.zhangzhiyi.cold.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
        System.out.println("注册中心启动成功  \n" +
                " ___________                  _____________                  ___________    \n" +
                "(___        \\________       //     /^\\     \\\\       ________/        ___)   \n" +
                "   (____             \\_____//     //^\\\\     \\\\_____/             ____)      \n" +
                "       (____              //\\__  // * \\\\  __/\\\\              ____)          \n" +
                "            (__           ||   \\//_____\\\\/   ||           __)               \n" +
                "               (__        ||   //       \\\\   ||       ___)                  \n" +
                "                  (__     \\\\  //         \\\\  //    ___)                     \n" +
                "                     (____ \\\\//_AEROSMITH_\\\\// ____)                        \n" +
                "                          (_\\\\_____________//_)                             \n" +
                "                          /__\\_/\\_/\\/\\_/\\_/__\\                              ");

    }
}
