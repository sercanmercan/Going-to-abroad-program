package goingToAbroad;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Sabiha Gökçen Airport...");
		
		String condition="Rules for departure abroad...\n"+
						"you shouldnt have any political ban...\n"+
						"you need to pay 15 TL as visa fee...\n"+
						"you have to have a visa for country...";
		
		String message = "Yo have to provide all of the these rules...";
		
		while(true) {
			System.out.println("***********************************************");
			System.out.println(condition);
			System.out.println("***********************************************");
			
			
			passenger psg= new passenger();
			
			System.out.println("this fee is being controled...");
			Thread.sleep(3000);
			
			if(psg.departureFeeControl() ==false) {
				System.out.println(message);
				continue;
			}
			
			System.out.println("this visa status is being controled...");
			Thread.sleep(3000);
			if(psg.visaStatusControl()==false) {
				System.out.println(message);
				continue;
			}
			
			System.out.println("OK... You will go to abroad...");
			break;
		}
	}

}
