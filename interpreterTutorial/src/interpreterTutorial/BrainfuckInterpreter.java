package interpreterTutorial;

import java.util.ArrayList;

public class BrainfuckInterpreter {
	
	final private ArrayList<Integer> output_ = new ArrayList<>();
	private int				   		 currPos_ = 0;
	
	private class Bracket{
		
		final private int position_;
		
		public Bracket(int position){
			position_ = position;
		}
				
		public int getBracketPosition(){
			return position_;
		}
	}
	
	public void interpret(String input){
		
		int inputLength = input.length();
		Token token;
		
		while(currPos_ < inputLength){
			char currToken = input.charAt(currPos_);
			
			switch(currToken){
			
				case '+':
					token = new Plus(currToken);
					token.interpret(output_.get(currPos_));
					++currPos_;
					token = null;
					break;
				
				case '-':
					token = new Minus(currToken);
					token.interpret(output_.get(currPos_));
					++currPos_;
					token = null;
					break;
				
				case '>':
					token = new RightShift(currToken);
					token.interpret(output_.get(currPos_));
					++currPos_;
					token = null;
					break;
					
				case '<':
					token = new LeftShift(currToken);
					token.interpret(output_.get(currPos_));
					--currPos_;
					token = null;
					break;	
					
				default:
					++currPos_;
					
				
			}
		}
	}
}
