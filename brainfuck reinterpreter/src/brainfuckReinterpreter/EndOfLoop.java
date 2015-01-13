package brainfuckReinterpreter;

public class EndOfLoop extends BrainfuckCommand implements ICommand {

	
	public EndOfLoop(Reinterpreter reinterpreter) {
		super(reinterpreter);
	}

	@Override
	public void execute() {
		
		int numOfCloseBrackets = 1;
		
		while(numOfCloseBrackets > 0){
			char currChar = reinterpreter_.input_.charAt(--reinterpreter_.currPosInInput_);
			
			if(reinterpreter_.language_.getTokenByChar(currChar) == Token.OPEN_BRACKET){
				--numOfCloseBrackets;
			}
			
			if(reinterpreter_.language_.getTokenByChar(currChar) == Token.CLOSE_BRACKET){
				++numOfCloseBrackets;
			}
			
		}
	}

}
