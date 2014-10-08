package Controller;

import Model.Boat.Type;
import Model.List;
import Model.Member;

import java.util.Scanner;

public class AddMember {
	
//	private Member member;
	private String memberName;
	private	String memberPIN;
	private int countBoats = 0;
	private Scanner scan = new Scanner(System.in);

	
	public void	addMember(List list, View.AddMemberScreen s){
		s.namePrompt();
		memberName = scan.nextLine();
		
		memberName = scan.nextLine();
		
		s.numberPrompt();
		memberPIN = scan.next();
		
		s.boatCountPrompt();
		countBoats = scan.nextInt();
		
		Member member = new Member(memberName,memberPIN);
		
		for(int i=1; i<=countBoats;i++){
			s.boatTypePrompt();
			int typePrompt = scan.nextInt();
			s.boatLengthPrompt();
			double lenghtPrompt = scan.nextDouble();
			
			switch(typePrompt){
			case 1:
				member.addBoat(Type.Sailboat,lenghtPrompt);
				break;
			case 2:
				member.addBoat(Type.Motorsailer,lenghtPrompt);
				break;
			case 3:
				member.addBoat(Type.Kayak,lenghtPrompt);
				break;
			case 4:
				member.addBoat(Type.Other,lenghtPrompt);
				break;
			}
			
			
		}
		//scan.close();
		list.add(member);
//		System.out.println(memberName);
//		System.out.println(memberPIN);
//		System.out.println(countBoats);
		
		
		
	}
		
//	private void addBoat(Type m_type, double m_lenght){
//		member.addBoat(m_type, m_lenght);
//	}

}
