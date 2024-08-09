package com.test;
/**
 * 测试dao层的工作
 * @author 63287
 *
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dao.EmpLoginMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	EmpLoginMapper emploginMapper;
	
	/**
	 * 测试EmpLoginMapper
	 */
	@Test
	public void testCRUD() {
		System.out.println(emploginMapper);
		//emploginMapper.insertSelective(new EmpLogin(1,"123456"));
	}
}
