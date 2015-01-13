package brainfuckReinterpreter;

public class DoNothing extends BrainfuckCommand implements ICommand {

	public DoNothing(Reinterpreter reinterpreter) {
		super(reinterpreter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		++reinterpreter_.currPosInInput_;
	}

}
