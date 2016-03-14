package com.pdk.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class StringUtil {
	public String printme(){
		System.out.println("YOU PRINT ME ASSHOLE");
		return "a";
	}

	StringUtil(){
		System.out.println("WTF IM INITIALIZE");
	}
	
}
