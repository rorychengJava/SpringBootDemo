package com.SpringBootDemo.util;


import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
public class AsyncTest {
	
	@Async
	public Future<Boolean> AsyncTask1() throws Exception {
		long start=System.currentTimeMillis();
		Thread.sleep(1000);//在该方法等待的时间去同步执行其他方法
		long end=System.currentTimeMillis();
		System.out.println("执行AsyncTask1方法耗时："+(end-start)+"毫秒");
		return new AsyncResult<Boolean>(true);
	}
	
	@Async
	public Future<Boolean> AsyncTask2() throws Exception {
		long start=System.currentTimeMillis();
		Thread.sleep(300);
		long end=System.currentTimeMillis();
		System.out.println("执行AsyncTask2方法耗时："+(end-start)+"毫秒");
		return new AsyncResult<Boolean>(true);
	}
	
	@Async
	public Future<Boolean> AsyncTask3() throws Exception {
		long start=System.currentTimeMillis();
		Thread.sleep(400);
		long end=System.currentTimeMillis();
		System.out.println("执行AsyncTask3方法耗时："+(end-start)+"毫秒");
		return new AsyncResult<Boolean>(true);
	}
}
