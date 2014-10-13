package Controller;

import java.util.Scanner;

import Model.List;
import Model.Member;
import Model.Boat.Type;
import View.AddMemberScreen;
import View.EditScreen;
import View.ListScreen;

public class EditMember {

	private int memberPosition;
	private int boatPosition;

	public void selectMember(List list, EditScreen es) {
		Scanner scan = new Scanner(System.in);
		// MemberList d_list = new MemberList() ;
		// d_list.printCompact(list, new ListScreen());
		es.showSelection();

		int memberNumberSearch = scan.nextInt();

		for (int i = 0; i < list.size(); i++) {
			if (memberNumberSearch == list.get(i).getMemberNumber())
				memberPosition = i;
			else if (i == list.size() - 1)
				es.showError();
		}
		es.showEditOptions();

	}

	public void editMemberName(List list, EditScreen es) {
		Scanner scan = new Scanner(System.in);
		es.newNamePrompt();
		String newName = scan.nextLine();
		newName = scan.nextLine();
		list.get(memberPosition).editName(newName);
		es.confirmPrompt();

	}

	public void editPersonalNumber(List list, EditScreen es) {
		Scanner scan = new Scanner(System.in);
		es.newPINPrompt();
		String newPIN = scan.nextLine();
		newPIN = scan.nextLine();
		list.get(memberPosition).editPersonalNumber(newPIN);
		es.confirmPrompt();
	}

	public void deleteMember(List list, EditScreen es) {
		list.remove(memberPosition);
		es.confirmPrompt();
	}

	public void addBoatToMember(List list, EditScreen es) {
		AddMemberScreen s = new AddMemberScreen();
		Scanner scan = new Scanner(System.in);
		s.boatTypePrompt();
		int boatType = scan.nextInt();
		s.boatLengthPrompt();
		double boatLength = scan.nextDouble();

		switch (boatType) {
		case 1:
			list.get(memberPosition).addBoat(Type.Sailboat, boatLength);
			break;
		case 2:
			list.get(memberPosition).addBoat(Type.Motorsailer, boatLength);
			break;
		case 3:
			list.get(memberPosition).addBoat(Type.Kayak, boatLength);
			break;
		case 4:
			list.get(memberPosition).addBoat(Type.Other, boatLength);
			break;
		}
		es.confirmPrompt();
	}

	public void boatEditMenu(List list, EditScreen es) {
		es.editBoatMenuPrompt();
		MainMenu m = new MainMenu();

		switch (es.GetInputChar()) {
		case '1':
			this.changeBoatType(list, es);
			m.menuOptions(list);
			break;
		case '2':
			this.changeBoatLenght(list, es);
			m.menuOptions(list);
			break;
		case '3':
			this.deleteBoat(list, es);
			m.menuOptions(list);
			break;
		case '4':
			m.menuOptions(list);
			break;
		}
	}

	public void boatList(List list, EditScreen es) {
		for (int i = 0; i < list.get(memberPosition).getBoatsNumber(); i++) {
			System.out.print(i + 1 + ". ");
			System.out
					.println(list.get(memberPosition).getBoat(i).getBoatType()
							+ " "
							+ list.get(memberPosition).getBoat(i)
									.getBoatLength());
		}
	}

	public void selectBoat(List list, EditScreen es) {
		Scanner scan = new Scanner(System.in);
		es.selectBoatToEdit();
		boatPosition = scan.nextInt() - 1;
	}

	public void changeBoatLenght(List list, EditScreen es) {
		Scanner scan = new Scanner(System.in);
		es.editBoatLenghtPrompt();
		double newLenght = scan.nextDouble();
		list.get(memberPosition).getBoat(boatPosition)
				.editBoatLength(newLenght);
	}

	public void changeBoatType(List list, EditScreen es) {
		Scanner scan = new Scanner(System.in);
		es.editBoatTypePrompt();
		int newType = scan.nextInt();
		switch (newType) {
		case 1:
			list.get(memberPosition).getBoat(boatPosition)
					.editBoatType(Type.Sailboat);
			break;
		case 2:
			list.get(memberPosition).getBoat(boatPosition)
					.editBoatType(Type.Motorsailer);
			break;
		case 3:
			list.get(memberPosition).getBoat(boatPosition)
					.editBoatType(Type.Kayak);
			break;
		case 4:
			list.get(memberPosition).getBoat(boatPosition)
					.editBoatType(Type.Other);
			break;
		}
	}

	public void deleteBoat(List list, EditScreen es) {
		list.get(memberPosition).deleteBoat(boatPosition);
		es.confirmPrompt();
	}
}
