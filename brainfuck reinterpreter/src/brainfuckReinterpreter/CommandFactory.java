package brainfuckReinterpreter;

public class CommandFactory {
	
   protected Reinterpreter reinterpreter_;
	
	public CommandFactory(Reinterpreter reinterpreter) {
		reinterpreter_ = reinterpreter;
	}

	public ICommand createCommand(Token token){
		ICommand command = null;
		
		switch(token){
			case MINUS: command = new Increment(reinterpreter_);
				break;
				
			case PLUS:  command = new Decrement(reinterpreter_);
				break;
				
			case OPEN_ANGLE: command = new Prev(reinterpreter_);
				break;
				
			case CLOSE_ANGLE: command = new Next(reinterpreter_);
				break;
				
			case OPEN_BRACKET: command = new StartLoop(reinterpreter_);
				break;
				
			case CLOSE_BRACKET: command = new FinishLoop(reinterpreter_);
				break;
				
			case COMMA: command = new GetMemByte(reinterpreter_);
				break;
				
			case DOT: command = new PutMemByte(reinterpreter_);	
				break;	
				
			default: command = new DoNothing(reinterpreter_);
			 
		}
		
		return command;
	}
}
