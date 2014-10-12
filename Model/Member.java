package Model;

import java.util.LinkedList;

import Model.Boat.Type;

public class Member {

	private String name;
	private String personalNumber;
	private int memberNumber;
	private final int startNumber = 10000; 
	private LinkedList<Boat> boats = new LinkedList<Boat>();

	public Member(String a_name, String a_personalNumber, List a_list) {

		this.name = a_name;
		this.personalNumber = a_personalNumber;
		this.memberNumber = startNumber + a_list.size();

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

	public void addBoat(Type m_type, double m_lenght) {
		Boat b = new Boat(m_type, m_lenght);
		this.boats.add(b);
	}

	public String printBoats() {
		StringBuilder buff = new StringBuilder();
		for (int i = 0; i < boats.size(); i++) {
			buff.append(boats.get(i).getBoatType());
			buff.append(" ");
			buff.append(boats.get(i).getBoatLength());
			
		}
		return buff.toString();
	}

	public void deleteBoat(int i) {
		boats.remove(i);
	}
	
	public Boat getBoat(int i){
		return boats.get(i);
	}
}
