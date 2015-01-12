package brainfuckReinterpreter;

public class BrainfuckReinterpreter extends Reinterpreter {

	public BrainfuckReinterpreter(Language language, int memSize) {
		super(language, memSize);
		
	}

	@Override
	public void interpret(String input) {
		input_ = input;
		int inputLength = input.length();
		
		while(currPosInInput_++ < inputLength){
			
			char currChar = input_.charAt(currPosInInput_);
			ICommand command = commandFactory_.createCommand(language_.getTokenByChar(currChar));
			command.execute();
		}
	}

}
