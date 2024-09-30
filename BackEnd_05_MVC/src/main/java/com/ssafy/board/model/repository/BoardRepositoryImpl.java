package com.ssafy.board.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.board.model.dto.Board;

// 싱글턴
public class BoardRepositoryImpl implements BoardRepository{
	
	private static BoardRepository repo = new BoardRepositoryImpl();
	
	private List<Board> list = new ArrayList<>();
	private Map<Integer, Board> boards = new HashMap<>();	
	
	
	
	private BoardRepositoryImpl() {
		boards.put(1, new Board("SSAFY 완벽가이드", "양띵균", "1학기를 잘 이수하는 방법은..."));
	}
	
	public static BoardRepository getInstance() {
		return repo;
	}
	
	@Override
	public List<Board> selectAll() {
//		return list; // 리스트로 관리
//		return (List<Board>)boards.values();
		
		List<Board> tmp = new ArrayList<>();
		for (int key : boards.keySet()) {
			tmp.add(boards.get(key));
		}
		
		return tmp;
	}

	@Override
	public Board selectOne(int id) {
		
		return boards.get(id);
	}

	@Override
	public void insertBoard(Board board) {
		boards.put(board.getId(), board); // ID를 키로 해서 맵으로 관리
		list.add(board); // 리스트로 목록을 관리
	}

	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateViewCnt(int id) {
		// TODO Auto-generated method stub
		
	}

}
