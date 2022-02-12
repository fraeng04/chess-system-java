package boardgame;

public class Piece {
	protected Position position; 
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Essa linha � opcional, pois no java quando um atribudo � criado ele recebe valor nulo
	}

	protected Board getBoard() {
		return board;
	}

	
	
	

}
