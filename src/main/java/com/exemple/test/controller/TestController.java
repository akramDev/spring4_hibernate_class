package com.exemple.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exemple.test.model.TestModel;
import com.exemple.test.service.TestService;


@Controller
public class TestController {
	
	@Autowired
	private TestService testService;

	@RequestMapping(value = "/ws", method = RequestMethod.GET)
	@ResponseBody
	public TestModel getTest() {
		return testService.getTest();
	}

}
