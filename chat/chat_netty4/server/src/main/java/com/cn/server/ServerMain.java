package com.cn.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动函数
 * @author admin
 *
 */
public class ServerMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String path =  ServerMain.class.getClassLoader().getResource("").getPath();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path.replace("target/classes/","resource/")+"applicationContext.xml");
		
		Server server = applicationContext.getBean(Server.class);
		
		server.start();
	}

}
