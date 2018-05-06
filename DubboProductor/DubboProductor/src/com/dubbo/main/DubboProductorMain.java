package com.dubbo.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProductorMain {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext cfg = new ClassPathXmlApplicationContext(
				"com/dubbo/config/ApplicationContextProducror.xml");
		cfg.start();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		System.out.println("��������˳�,ʱ�䣺" + sdf.format(date));
		// ��֤����ʼ�տ���
		System.in.read();
	}
}
