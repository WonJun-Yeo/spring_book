package com.springbook.biz.board.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOSpring {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// SQL 명령어
	private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values (?, ?, ?, ?)";
	private final String BOARD_UPDATE = "update board set title = ?, content = ? where seq = ?";
	private final String BOARD_DELETE = "delete board where seq = ?";
	private final String BOARD_GET = "select * from board where seq = ?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	
	// 1. 글 등록
		public void insertBoard (BoardVO vo) {
			System.out.println("===> JDBC로 insertBoard() 기능 처리");
			
			jdbcTemplate.update(BOARD_INSERT, vo.getSeq(), vo.getTitle(), vo.getWriter(), vo.getContent());
		}
		
		// 2. 글 수정
		public void updateBoard (BoardVO vo) {
			System.out.println("===> JDBC로 updateBoard() 기능 처리");
			
			jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
		}
		
		// 3. 글 삭제
		public void deleteBoard (BoardVO vo) {
			System.out.println("===> JDBC로 deleteBoard() 기능 처리");
			
			jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
		}
		
		// 4. 글 상세 조회
		public BoardVO getBoard (BoardVO vo) {
			System.out.println("===> JDBC로 getBoard() 기능 처리");
			
			Object[] args = {vo.getSeq()};
			return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
		}
		
		// 5. 글 목록 조회
		public List<BoardVO> getBoardList (BoardVO vo) {
			System.out.println("===> JDBC로 getBoardList() 기능 처리");
			return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
		}
}

class BoardRowMapper implements RowMapper<BoardVO> {
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO board = new BoardVO();
		board.setSeq(rs.getInt("SEQ"));
		board.setTitle(rs.getString("title"));
		board.setWriter(rs.getString("writer"));
		board.setContent(rs.getString("content"));
		board.setRegDate(rs.getDate("REGDATE"));
		board.setCnt(rs.getInt("CNT"));
		return board;
	}
}
