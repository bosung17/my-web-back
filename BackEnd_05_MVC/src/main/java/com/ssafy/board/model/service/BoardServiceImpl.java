package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.repository.BoardRepository;
import com.ssafy.board.model.repository.BoardRepositoryImpl;

// 싱글턴으로 관리
public class BoardServiceImpl implements BoardService {

	private static BoardService service = new BoardServiceImpl();
	private BoardRepository repo = BoardRepositoryImpl.getInstance();
	
	private BoardServiceImpl() {
	}
	
	public static BoardService getInstance() {
		return service;
	}
	
	@Override
	public List<Board> getList() {
		return repo.selectAll();
	}

	@Override
	public Board getBoard(int id) {
		return repo.selectOne(id);
	}

	@Override
	public void writeBoard(Board board) {
		// 게시글 등록! Repository 호출
		repo.insertBoard(board);
	}

	@Override
	public void modifyBoard(Board board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeBoard(int id) {
		// TODO Auto-generated method stub

	}

}
