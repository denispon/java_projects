package brainfuckReinterpreter;

import java.util.Arrays;

public abstract class Reinterpreter {
	
	protected final Language language_;
	String         		     input_;
	char[]		             memory_;
	int 		             memPtr_;
	final int 				 memLength_;
	int 					 currPosInInput_;	

	//	ICommand       command_;
	CommandFactory commandFactory_;
	
	public Reinterpreter(final Language language, final int memSize){
		language_  = language;
		memLength_ = memSize;
		memory_    = new char[memLength_];
		memPtr_    = 0;
		currPosInInput_ = 0;
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
