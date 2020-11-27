																																	package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		this.board = new Board(8, 8);
	}

//	private int turn;
//	private Color currentPlayer;
//	private boolean check;
//	private boolean checkMate;
//	private ChessPiece enPassantVulnerable;
//	private ChessPiece promoted;

	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[this.board.getRows()][this.board.getColumns()];
		
		for(int i = 0; i < this.board.getRows(); i++) {
			for(int j = 0; j < this.board.getRows(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

// public boolean [][] possibleMoves(ChessPosition sourcePosition) {}
// public ChessPosition performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {}
// public ChessPiece replacePromotedPiece(String type) {}

}
