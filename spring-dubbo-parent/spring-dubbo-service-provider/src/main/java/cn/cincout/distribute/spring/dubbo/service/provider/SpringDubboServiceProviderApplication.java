package cn.cincout.distribute.spring.dubbo.service.provider;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringDubboServiceProviderApplication {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
		context.start();
		System.in.read(); // 按任意键退出
	}
}
