package interpreterTutorial;

public class Minus extends Token {
	
	public Minus(char token) {
		super(token);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interpret(Object obj) {
		if(obj instanceof Integer){
			Integer value = (Integer)obj;
			--value;
		}
	}
	
}

