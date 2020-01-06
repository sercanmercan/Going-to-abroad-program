package goingToAbroad;
import java.util.*;

public class passenger implements rulesForAbroad{

	private int fee;
	private boolean politicalBan;
	private boolean visaStatus;
	
	public passenger() {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("How much fee do you pay: ");
		this.fee= scanner.nextInt();	
		scanner.nextLine();
		
		System.out.println("Do you have any political ban(Y/N) : ");
		String ans= scanner.nextLine();
		
		if(ans=="Y") {
			this.politicalBan=true;
			
		}
		
		else {
			this.politicalBan=false;
			
		}
		
		System.out.println("Do you have a visa (Y/N): ");
		String ans2= scanner.nextLine();
		
		if(ans2.equals("Y")) {
			this.visaStatus=true;
			
		}
		
		else {
			this.visaStatus =false;
		}
	}
	
	@Override
	public boolean departureFeeControl() {
		// TODO Auto-generated method stub
		
		if(this.fee<15) {
			System.out.println("Please pay your fee completely...");
			return false;
		}
		else {
			System.out.println("Fee of abroad complete");
			return true;
		}
		
		
		
		
	}
	@Override
	public boolean politicalBanControl() {
		// TODO Auto-generated method stub
		
		if(this.politicalBan==true) {
			System.out.println("You have political ban and you mustn't go to abroad...");
			return false;
		}
		
		else {
			System.out.println("You can go to abroad...");
			return true;
		}
	}
	@Override
	public boolean visaStatusControl() {
		// TODO Auto-generated method stub
		
		if(this.visaStatus==true) {
			System.out.println("You have the visa.");
			return true;
		}
		else {
			System.out.println("You dont have the visa.");
			return false;
		}
		
	}
	
	
}
