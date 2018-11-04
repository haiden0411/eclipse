package com.huawei.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedule
{
	@Scheduled(cron ="0/3 * * * * ?")
	public void test1() {
		System.out.println("执行时间为---"+new Date());
	}
}
