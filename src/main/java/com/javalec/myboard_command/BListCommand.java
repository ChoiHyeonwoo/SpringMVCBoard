package com.javalec.myboard_command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.myboard_dao.BDao;
import com.javalec.myboard_dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		//데이터 베이스에 있는 데이터를  jsp 페이지로 가져와서 Dto객체를 통해 뿌려줌

		BDao dao = new BDao();
		dao.list();
		
		ArrayList<BDto> dtos = dao.list();
		
		model.addAttribute("list", dtos);
		//뉸ㄴㄴ냐냐
	}

}
