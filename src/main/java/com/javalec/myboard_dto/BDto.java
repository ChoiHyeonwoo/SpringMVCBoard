package com.javalec.myboard_dto;

import java.sql.Timestamp;

public class BDto {
	//데이터베이스를 객체로 바꿔주는 객체
	//데이터베이스 컬럼명 그대로 쓰기
	int bId;
	String bName;
	String bTitle;
	String bContent;
	Timestamp bDate;
	int bHit;
	int bGroup;
	int bStep;
	public int getbStep() {
		return bStep;
	}
	public void setbStep(int bStep) {
		this.bStep = bStep;
	}

	int bIndent;
	
	public BDto(){
		
	}
	public BDto(int bId, String bName, 
			String bTitle,String bContent, Timestamp bDate, int bHit, int bGroup, int bStep, int bIndent){
		this.bId = bId;
		this.bName = bName;
		this.bContent = bContent;
		this.bTitle = bTitle;
		this.bDate = bDate;
		this.bHit = bHit;
		this.bGroup = bGroup;
		this.bIndent = bIndent;
		
	}

	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public Timestamp getbDate() {
		return bDate;
	}

	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}

	public int getbHit() {
		return bHit;
	}

	public void setbHit(int bHit) {
		this.bHit = bHit;
	}

	public int getbGroup() {
		return bGroup;
	}

	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}

	public int getbIndent() {
		return bIndent;
	}

	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}
	

}
