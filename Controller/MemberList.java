package Controller;

import Model.List;
import View.ListScreen;

public class MemberList {

	private boolean viewFlag = true;

	public void printCompact(List list, ListScreen ls) {

		ls.compactViewHeaders();

		for (int i = 0; i < list.size(); i++) {
			System.out.print("| " + list.get(i).getMemberNumber());
			System.out.print("| " + list.get(i).getName());
			System.out.print("| " + list.get(i).getBoatsNumber() + " |");
			System.out.println();
		}
		ls.addFooter();
		ls.showListOptions();
		// ls.addFooter();
		// if(ls.GetInputChar() == '\n')

	}

	public void printVerbose(List list, ListScreen ls) {
		
		ls.verboseViewHeaders();

		for (int i = 0; i < list.size(); i++) {
			System.out.print("| " + list.get(i).getMemberNumber());
			System.out.print("| " + list.get(i).getName());
			System.out.print("| " + list.get(i).getPersonalNumber());
			System.out.print("| " + list.get(i).getBoatsNumber());
			System.out.print("| " + list.get(i).printBoats() + " |");
			System.out.println();
		}
		ls.addFooter();
		ls.showListOptions();
	}
	
	public boolean getFlag(){
		return viewFlag;
	}
	
	public void setFlag(){
		if(viewFlag==true)
			viewFlag = false;
		else viewFlag = true;
	}
}
