package Model;

import java.util.LinkedList;

import Model.Boat.Type;

public class Member {

	private String name;
	private String personalNumber;
	private int memberNumber;
	private LinkedList<Boat> boats;

	public Member(String a_name, String a_personalNumber) {

		this.name = a_name;
		this.personalNumber = a_personalNumber;
		//this.memberNumber = personalNumber.hashCode();
		this.boats = new LinkedList<Boat>();
	}

	public void editName(String m_name) {
		this.name = m_name;
	}

	public void editPersonalNumber(String m_number) {
		this.personalNumber = m_number;
	}

	public String getName() {
		return name;
	}

	public String getPersonalNumber() {
		return personalNumber;
	}

	public int getMemberNumber() {
		return memberNumber;
	}
	
	public int getBoatsNumber() {
		return boats.size();
	}
	
	public void addBoat(Type m_type, double m_lenght){
		boats.add(new Boat(m_type,m_lenght));
	}
	
	public void deleteBoat(){
		
	}
}
