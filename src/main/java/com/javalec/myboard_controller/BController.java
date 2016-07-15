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
		System.out.println("list();");
		
		command = new BListCommand();
		command.execute(model);
		
		return "list";
	}
	@RequestMapping("write_view")
	public String write_view(Model model){
		
		System.out.println("write_view()");
		
		return "write_view";
	}
	
}
