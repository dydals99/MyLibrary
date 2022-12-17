package library.Book;

import java.util.List;
import java.util.Vector;

import library.comm.ConnectPool;

public class BookDAO extends ConnectPool{
	
	public BookDAO() {
		super();
	}
	public List<BookDTO> selectList(){
		List<BookDTO> board = new Vector<BookDTO>();
		
		String query = " select book_title, book_author from book ";
		
		try {
			psmt = con.prepareStatement(query);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				
				dto.setBook_title(rs.getString(1));
				dto.setBook_author(rs.getString(2));
				
				board.add(dto);
			}
		}
		catch(Exception e) {
			System.out.println("조회중 예외발생");
			e.printStackTrace();
		}
		return board;
	}
}
