package brainfuckReinterpreter;

public enum Token {
	MINUS('-'),
	PLUS('+'),
	OPEN_ANGLE('<'),
	CLOSE_ANGLE('>'),
	OPEN_BRACKET('['),
	CLOSE_BRACKET(']'),
	COMMA(','),
	DOT('.');
	
	static int s_orderId = 0;
	private final char symbol_;
//	private final int  id_;
	
	private Token(final char symbol){
		
//		id_ = s_orderId++;
		symbol_ = symbol;
	}

	public char getSymbol() {
		return symbol_;
	}
	
	
	
}
