package brainfuckReinterpreter;

import java.util.HashMap;

public class Language {
	
	public final HashMap<Character, Token> tokens_;
	
	public Language(){
		tokens_ = new HashMap<>();
		
		for(Token t: Token.values()){
			tokens_.put(t.getSymbol(), t);
		}
	}
	
	Token getTokenByChar(char character){
		return tokens_.get(character);
	}

}
