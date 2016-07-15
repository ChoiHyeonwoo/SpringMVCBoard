package com.javalec.myboard_command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.myboard_dao.BDao;
import com.javalec.myboard_dto.BDto;

public class BContentCommand implements BCommand {
	// 클릭한 게시판의 내용을 보는 
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		 Map<String, Object> map = model.asMap();
		 HttpServletRequest request = (HttpServletRequest) map.get("request");
		 String bId = request.getParameter("bId");
		 
		 BDao dao = new BDao();
		 BDto dto = new BDto();
		 
		 model.addAttribute("content_view", dto);
		 
	}

}
