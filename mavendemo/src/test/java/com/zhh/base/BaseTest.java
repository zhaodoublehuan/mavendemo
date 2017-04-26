package com.zhh.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/zhh/spring/spring.xml"})
public class BaseTest extends AbstractJUnit4SpringContextTests{

}
