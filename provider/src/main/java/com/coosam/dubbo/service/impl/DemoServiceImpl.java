package com.coosam.dubbo.service.impl;

import com.coosam.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService
{
	@Override
	public String sayHello(String name)
	{
		return "Hello " + name;
	}
}
