package com.javalec.myboard_controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.myboard_command.BCommand;
import com.javalec.myboard_command.BContentCommand;
import com.javalec.myboard_command.BListCommand;
import com.javalec.myboard_command.BWriteCommand;

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
		//리스트를 보여주는 컨트롤러
		
		System.out.println("write_view()");
		
		return "write_view";
	}
	@RequestMapping("write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", request);
		command = new BWriteCommand();
		command.execute(model);
					
		return "redirect:list";
	}
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view()");
		
		model.addAttribute("request", request);
		
		command = new BContentCommand();
		command.execute(model);
			
		return "content_view";
	}
}
