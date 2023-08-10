package com.act.sitting;

import java.util.ArrayList;

public interface ISittingDAO
{
	public ArrayList<SittingDTO> list();
	public ArrayList<SittingDTO> IndexTagList();
	public ArrayList<SittingDTO> gradeList();
	//public ArrayList<SittingDTO> tagList(String memSid);

	// 회원의 시험제출 유무 확인
	public int stsCount(SittingDTO dto);
	
	// 회원의 펫시터 면허번호 유무 확인
	public int slCount(SittingDTO dto);

	public ArrayList<SittingDTO> booklist(String memSid);
	
	// 회원번호로 펫시터 휴무일 확인 → 수정필요 회원번호가 아니라 허브시드
	public ArrayList<SittingDTO> sittingRest(String memSid);
	
	// 회원번호로 마이페이지에서 돌봄장소 기본정보 조회
	public ArrayList<SittingDTO> sittingPlaceBasic(String memSid);
}
