package interpreterTutorial;

public abstract class Token {
	
	char token_;
	
	public Token(char token){
		token_ = token;
	}
	abstract public void interpret(Object obj); 
}
