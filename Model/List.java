package Model;

import java.util.LinkedList;

public class List {

	private LinkedList<Member> list = new LinkedList<Member>();

	public void add(Member m) {
		list.add(m);
	}

	public void print() {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getPersonalNumber());
			System.out.println(list.get(i).getBoatsNumber());
			System.out.println(list.get(i).printBoats());
			// System.out.println(list.get(i).get);
		}
	}
}
