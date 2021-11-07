package com.renxuan.aspectJ.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext2.xml")
public class SpringDemo2 {

	@Resource(name = "customerDao")
	private CustomerDao customerDao;
	@Test
	public void demo2() {
		customerDao.save();
		customerDao.update();
		customerDao.findOne();
		customerDao.findAll();
		customerDao.delete();
	}
	
	
	com.renxuan.aspectJ.demo2.CustomerDaoImp a;
	com.renxuan.aspectJ.demo2.MyAspectXml b;
	
}
