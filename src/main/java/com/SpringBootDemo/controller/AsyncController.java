package com.SpringBootDemo.controller;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.util.AsyncTest;

@RestController
public class AsyncController {
	
	@Autowired
	private AsyncTest asyncTest;
	
		@RequestMapping("async")
		public String SyncTest() throws Exception {
			
			long start=System.currentTimeMillis();
			Future<Boolean> a1=asyncTest.AsyncTask1();
			Future<Boolean> a2=asyncTest.AsyncTask2();
			Future<Boolean> a3=asyncTest.AsyncTask3();
			while(!a1.isDone()||!a2.isDone()||!a3.isDone()) {
				while(a1.isDone() && a2.isDone() && a3.isDone()) {
					break;
				}
			}
			long end=System.currentTimeMillis();
			String s="总耗时："+(end - start)+"毫秒";
			return s;
		}
}
