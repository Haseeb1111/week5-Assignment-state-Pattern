package haseeb;
public class RacketBasic {

	private String state="";
	
	public void setState(String state){
		this.state=state;
	}
	
	public void doAction(){
		if(state.equalsIgnoreCase("RIGHT")){
			System.out.println("Racket is turned towards RIGHT");
		}else if(state.equalsIgnoreCase("LEFT")){
			System.out.println("Racket is turned towards LEFT");
		}
	}

	public static void main(String args[]){
		RacketBasic racket = new RacketBasic();
		
		racket.setState("RIGHT");
		racket.doAction();
		
		racket.setState("LEFT");
		racket.doAction();
	}

}

