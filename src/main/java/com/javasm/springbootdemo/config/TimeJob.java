package com.javasm.springbootdemo.config;

import org.springframework.scheduling.annotation.Scheduled;
/*任务调度工作类
* */
//@Component
public class TimeJob {
    @Scheduled(cron = "0/5 * * * * ?")
    public void test(){
        System.out.println("zzzzzzz..........");
    }
}
