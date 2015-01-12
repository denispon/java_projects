package brainfuckReinterpreter;

public class Decrement extends BrainfuckCommand implements ICommand {

	public Decrement(Reinterpreter reinterpreter) {
		super(reinterpreter);
	}

	@Override
	public void execute() {
		--(reinterpreter_.memory_[reinterpreter_.memPtr_]);

	}

}
