package brainfuckReinterpreter;

public class Increment extends BrainfuckCommand implements ICommand{

	public Increment(Reinterpreter reinterpreter) {
		super(reinterpreter);
	}

	@Override
	public void execute() {
		(reinterpreter_.memory_[reinterpreter_.memPtr_])++;
		
	}

	
}
