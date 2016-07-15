package com.javalec.myboard_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.myboard_command.BCommand;
import com.javalec.myboard_command.BListCommand;

@Controller
public class BController {
	
	BCommand command;
	
	@RequestMapping("/list")
	public String list(Model model){
		
		command = new BListCommand();
		command.execute(model);
		
		return "list";
	}
	

}
