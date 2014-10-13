package Controller;

import Model.List;
import View.EditScreen;
import View.ListScreen;

public class MemberList {

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

	public void editMember(List list, EditScreen es) {
		EditMember edit = new EditMember();
		edit.selectMember(list, es);
		switch (es.GetInputChar()) {
		case '1':
			edit.editMemberName(list, es);
			break;
		case '2':
			edit.editPersonalNumber(list, es);
			break;
		case '3':
			edit.addBoatToMember(list, es);
			break;
		case '4':
			edit.boatList(list, es);
			edit.selectBoat(list, es);
			edit.boatEditMenu(list, es);
			break;
		case '5':
			edit.deleteMember(list, es);
			break;
		}

	}

	public void listMenu(List list, ListScreen ls) {

		switch (ls.GetInputChar()) {
		case 'c':
			this.printCompact(list, ls);
			// if(ls.pressEnterToContinue())
			listMenu(list, ls);
			break;
		case 'v':
			this.printVerbose(list, ls);
			// if(ls.pressEnterToContinue())
			listMenu(list, ls);
			break;
		case 'e':
			EditScreen es = new EditScreen();
			this.editMember(list, es);
			break;

		case 'b':
			MainMenu m = new MainMenu();
			m.menuOptions(list);
			break;
		}
	}

}