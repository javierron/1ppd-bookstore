package com.oneppd.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public class ServiceFactory {
	
	public Service getService(Class serviceClass, InvocationHandler handler) throws UndeclaredThrowableException {
		
		Service bookService = (Service) Proxy.newProxyInstance(serviceClass.getClassLoader(), new Class<?>[] { serviceClass }, handler);
		return bookService;
	}

}
