package Controller;

import java.util.Scanner;

import Model.List;

public class SearchMember {

	private String searchQuery;
	Scanner scan = new Scanner(System.in);

	public void search(List list, View.SearchScreen ss) {

		ss.searchPrompt();
		searchQuery = scan.nextLine();
		searchQuery = scan.nextLine();
		
		
		for (int i = 0; i < list.size(); i++) {
			if (searchQuery.equals(list.get(i).getPersonalNumber())) {
				
				System.out.println(list.get(i).getMemberNumber());
				System.out.println(list.get(i).getName());
				System.out.println(list.get(i).getPersonalNumber());
				System.out.println(list.get(i).getBoatsNumber());
				System.out.println(list.get(i).printBoats());

			}
			else if(i==list.size()-1) ss.searchError();
				
		}
		ss.pressEnterPrompt();

	}

}
