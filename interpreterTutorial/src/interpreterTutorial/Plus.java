package interpreterTutorial;

public class Plus extends Token{

	public Plus(char token) {
		super(token);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interpret(Object obj) {
		if(obj instanceof Integer){
				Integer value = (Integer)obj;
				++value;
			}
	}

}
