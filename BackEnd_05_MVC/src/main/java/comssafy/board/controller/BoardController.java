package comssafy.board.controller;

import java.io.IOException;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.service.BoardService;
import com.ssafy.board.model.service.BoardServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/board")
public class BoardController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private BoardService service = BoardServiceImpl.getInstance();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "writeform":
			doWriteFrom(request, response);
			break;
		case "write":
			doWrite(request, response);
			break;
		case "list":
			doList(request, response);
			break;
		case "detail":
			doDetail(request, response);
			break;
		default:
			System.out.println("에러페이지로 가라");
			break;
		}
		
	}

	private void doDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		request.setAttribute("board", service.getBoard(id));
		request.getRequestDispatcher("/WEB-INF/board/detail.jsp").forward(request, response);
	}

	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("list", service.getList());
		request.getRequestDispatcher("/WEB-INF/board/list.jsp").forward(request, response);
	}

	private void doWrite(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		//객체를 만들겠다.
		Board board = new Board(title, writer, content);
		
		service.writeBoard(board);
		
		// 1. 등록한 게시글을 보러가는 법
		
		// 2. 게시글 전체목록으로 가는 법
		response.sendRedirect("board?action=list");
		
	}

	private void doWriteFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/board/writeform.jsp").forward(request, response);
		
	}

}
