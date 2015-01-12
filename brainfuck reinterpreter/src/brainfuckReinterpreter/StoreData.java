package brainfuckReinterpreter;

import java.io.IOException;

public class StoreData extends BrainfuckCommand implements ICommand {

	public StoreData(Reinterpreter reinterpreter) {
		super(reinterpreter);
	}

	@Override
	public void execute() {
		try {
			reinterpreter_.memory_[reinterpreter_.memPtr_] = (char) System.in.read();
		} catch (IOException e) {
			//TODO:ask if throw exception declaration influence on overloading
			e.printStackTrace();
		}

	}

}
