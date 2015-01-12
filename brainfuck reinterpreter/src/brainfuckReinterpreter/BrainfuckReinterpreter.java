package brainfuckReinterpreter;

public class BrainfuckReinterpreter extends Reinterpreter {

	public BrainfuckReinterpreter(Language language, int memSize) {
		super(language, memSize);
		
	}

	@Override
	public void interpret(String input) {
		// TODO Auto-generated method stub
		input_ = input;
		int inputLength = input.length();
		int indxInInput = 0;
		
		while(indxInInput < inputLength){
			
			char currChar = input_.charAt(indxInInput);
			ICommand command = commandFactory_.createCommand(language_.getTokenByChar(currChar));
			command.execute();
		}
	}

}
