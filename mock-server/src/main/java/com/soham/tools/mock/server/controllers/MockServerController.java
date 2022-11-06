package com.soham.tools.mock.server.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MockServerController {

	private Map<String,String> data = new HashMap<>();

	@PostMapping("/save/{ruleId}")
	public void loadData(@RequestBody String code,@PathVariable("ruleId")String ruleId) {
		data.put(ruleId,code);
	}

	@GetMapping("/get/{ruleId}")
	public String get(@PathVariable("ruleId")String ruleId) {
		return data.get(ruleId);
	}

}
