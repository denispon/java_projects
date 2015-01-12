package brainfuckReinterpreter;

public class Next extends BrainfuckCommand implements ICommand {

	public Next(Reinterpreter reinterpreter) {
		super(reinterpreter);
	}

	@Override
	public void execute() throws ArrayIndexOutOfBoundsException {
		if(++reinterpreter_.memPtr_ > reinterpreter_.memLength_ ){
			throw new  ArrayIndexOutOfBoundsException(reinterpreter_.memPtr_);
		}

	}

}
