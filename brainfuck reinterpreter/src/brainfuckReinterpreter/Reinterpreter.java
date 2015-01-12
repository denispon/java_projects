package brainfuckReinterpreter;

import java.util.Arrays;

public abstract class Reinterpreter {
	
	protected final Language language_;
	String         		     input_;
	char[]		             memory_;
	int 		             memPtr_;

	//	ICommand       command_;
	CommandFactory commandFactory_;
	
	public Reinterpreter(final Language language, final int memSize){
		language_ = language;
		memory_   = new char[memSize];
		memPtr_   = 0;
	}
	
	public abstract void interpret(String input);

	@Override
	public String toString() {
		return "Reinterpreter [memory_=" + Arrays.toString(memory_) + "]";
	}
	
	public void setCommandFactory(CommandFactory commandFactory) {
		commandFactory_ = commandFactory;
	}
}
