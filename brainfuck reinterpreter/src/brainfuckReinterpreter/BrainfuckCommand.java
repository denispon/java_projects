package brainfuckReinterpreter;

public abstract class BrainfuckCommand {
	
	protected Reinterpreter reinterpreter_;
	
	public BrainfuckCommand(Reinterpreter reinterpreter){
		reinterpreter_ = reinterpreter;
	}
	
	abstract public void execute();
}
