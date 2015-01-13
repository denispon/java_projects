package brainfuckReinterpreter;

public class StartOfLoop extends BrainfuckCommand implements ICommand {

	public StartOfLoop(Reinterpreter reinterpreter) {
		super(reinterpreter);
	}

	
	@Override
	public void execute() {
		if(reinterpreter_.memory_[reinterpreter_.memPtr_] == 0){
			int numOfOpenBrackets = 1;
		
			while(numOfOpenBrackets >0){
				char currChar = reinterpreter_.input_.charAt(++reinterpreter_.currPosInInput_);
				
				if(reinterpreter_.language_.getTokenByChar(currChar) == Token.OPEN_BRACKET){
					++numOfOpenBrackets;
				}
				
				if(reinterpreter_.language_.getTokenByChar(currChar) == Token.CLOSE_BRACKET){
					--numOfOpenBrackets;
				}
			
			}
		}
	}

}
