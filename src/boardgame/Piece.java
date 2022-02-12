package boardgame;

public class Piece {
	protected Position position; 
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Essa linha é opcional, pois no java quando um atribudo é criado ele recebe valor nulo
	}

	protected Board getBoard() {
		return board;
	}

	
	
	

}
