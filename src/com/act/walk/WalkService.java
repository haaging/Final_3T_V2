package com.act.walk;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.act.sitting.ISittingDAO;
import com.act.sitting.SittingDTO;
import com.act.walk.IWalkDAO;
import com.act.walk.WalkDTO;

@Service
public class WalkService
{
	@Autowired
	private SqlSession sqlSession;

	// 대리산책러의 정보를 리스트로 가져오기
	public ArrayList<WalkDTO> list() {
		ArrayList<WalkDTO> list = new ArrayList<WalkDTO>();

		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		list = dao.list();

		return list;
	}

	// 대리산책 범례태그 리스트 가져오기
	public ArrayList<WalkDTO> IndexTagList() {
		ArrayList<WalkDTO> IndexTagList = new ArrayList<WalkDTO>();

		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		IndexTagList = dao.IndexTagList();

		return IndexTagList;
	}

	
	 // 대리산책러 등급과 기본가격 정보 public ArrayList<SittingDTO> gradeList() {
	public ArrayList<WalkDTO> gradeList()
	{
		ArrayList<WalkDTO> grade = new ArrayList<WalkDTO>();
		
		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		grade = dao.gradeList();
		
		return grade;
	}
	 
	// 견주로서 오늘 대리산책 예약 취소된 내역
	public ArrayList<WalkDTO> memWalkCancelToday(String memSid)
	{
		ArrayList<WalkDTO> result = new ArrayList<WalkDTO>();
		
		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		
		result = dao.memWalkCancelToday(memSid);
		
		return result;
	}
	
	// 대리산책러로서 오늘 달린 대리산책 후기들
	public ArrayList<WalkDTO> walkReviewToday(String memSid)
	{
		ArrayList<WalkDTO> result = new ArrayList<WalkDTO>();
		
		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		
		result = dao.walkReviewToday(memSid);
		
		return result;
	}
	
	// 대리산책러로서 오늘 반려당한 대리산책 공고글
	public ArrayList<WalkDTO> walkCompanionToday(String memSid)
	{
		ArrayList<WalkDTO> result = new ArrayList<WalkDTO>();
		
		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		
		result = dao.walkCompanionToday(memSid);
		
		return result;
	}
	
	// 견주입장에서 본인이 오늘 결제한 대리산책의 시작일 ~ 종료일 
	public ArrayList<WalkDTO> memWalkBookToday(String memSid)
	{
		ArrayList<WalkDTO> result = new ArrayList<WalkDTO>();
		
		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		
		result = dao.memWalkBookToday(memSid);
		
		return result;
	}
	
	// 대리산책러로서 오늘 들어온 예약의 시작일 ~ 종료일
	public ArrayList<WalkDTO> walkBookToday(String memSid)
	{
		ArrayList<WalkDTO> result = new ArrayList<WalkDTO>();
		
		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		
		result = dao.walkBookToday(memSid);
		
		return result;
	}
	
	// 대리산책러로서 들어온 예약의 시작일 ~ 종료일
	public ArrayList<WalkDTO> walkBookMyPage(String memSid)
	{
		ArrayList<WalkDTO> result = new ArrayList<WalkDTO>();
		
		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		
		result = dao.walkBookMyPage(memSid);
		
		return result;
	}
	
	// 대리산책러로서 나에게 달린 후기 조회
	public ArrayList<WalkDTO> walkReviews(String memSid)
	{
		ArrayList<WalkDTO> result = new ArrayList<WalkDTO>();
		
		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		
		result = dao.walkReviews(memSid);
		
		return result;
	}
	
	// 후기를 쓴 사람의 회원번호로 그 회원의 닉네임 조회를 위한 전체출력
	public ArrayList<WalkDTO> walkReviewers()
	{
		ArrayList<WalkDTO> result = new ArrayList<WalkDTO>();
		
		IWalkDAO dao = sqlSession.getMapper(IWalkDAO.class);
		
		result = dao.walkReviewers();
		
		return result;
	}
	
	
	
}
