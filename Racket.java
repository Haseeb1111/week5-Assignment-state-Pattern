package haseeb;

public class Racket {

	public static void main(String[] args) {
		RcketCon context = new RcketCon();
		State racketRightState = new RacketRightState();
		State racketLeftState = new RacketLeftState();
		
		context.setState(racketRightState);
		context.doAction();
		
		
		context.setState(racketLeftState);
		context.doAction();
		
	}

}