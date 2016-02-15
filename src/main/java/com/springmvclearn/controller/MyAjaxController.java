/*package com.springmvclearn.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvclearn.model.User;
import com.springmvclearn.model.User1;

@Controller
@RequestMapping("myajax.do")
public class MyAjaxController {
	
	@RequestMapping(params="method=test1",method=RequestMethod.GET)
	public @ResponseBody List<User1> test1(String uname) throws Exception{ 
		String uname2 = new String(uname.getBytes("iso8859-1"),"gbk");
		System.out.println(uname2); 
		System.out.println("MyAjaxController.test1()");
		List<User1> list = new ArrayList<User1>();
		list.add(new User1("55","123"));
		list.add(new User1("tt","456"));
		
		return list;
	}
	
}
*/