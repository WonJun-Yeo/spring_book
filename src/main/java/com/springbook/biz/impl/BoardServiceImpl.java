package com.springbook.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.Impl.BoardDAOSpring;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAOSpring boardDAO;

	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	@Override
	public void getBoard(BoardVO vo) {
		boardDAO.getBoard(vo);
		
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
	
}
