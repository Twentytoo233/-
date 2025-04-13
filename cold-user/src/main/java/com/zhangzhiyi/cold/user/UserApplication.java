package com.zhangzhiyi.cold.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) {

        SpringApplication.run(UserApplication.class,args);
        System.out.println("用户中心启动成功  \n" +
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