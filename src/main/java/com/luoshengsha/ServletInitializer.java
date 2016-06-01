package com.luoshengsha;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * 没有这个，打成war部署到tomcat，没有办法运行程序。至于什么原因，我就不知道了
 * @author luoshengsha
 *
 * 2016年5月31日-下午5:17:12
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SampleWebJspApplication.class);
	}

}
