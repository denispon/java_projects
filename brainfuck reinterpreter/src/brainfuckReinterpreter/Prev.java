package brainfuckReinterpreter;

public class Prev extends BrainfuckCommand implements ICommand {

	public Prev(Reinterpreter reinterpreter) {
		super(reinterpreter);
	}

	@Override
	public void execute() throws ArrayIndexOutOfBoundsException {
		if(--reinterpreter_.memPtr_ < 0 ){
			throw new  ArrayIndexOutOfBoundsException(reinterpreter_.memPtr_);
		}

	}

}
