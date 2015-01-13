package brainfuckReinterpreter;

public class OutputData extends BrainfuckCommand implements ICommand {

	public OutputData(Reinterpreter reinterpreter) {
		super(reinterpreter);
	}

	@Override
	public void execute() {
		System.out.println(reinterpreter_.memory_[reinterpreter_.memPtr_]);
		++reinterpreter_.currPosInInput_;

	}

}
