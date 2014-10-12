package View;

public class EditScreen extends Console {

	public void showEditOptions() {
		System.out.println("1. Edit name");
		System.out.println("2. Edit personal number");
		System.out.println("3. Add boat");
		System.out.println("4. Edit/Delete boat");
		System.out.println("5. Delete member");
	}

	public void showSelection() {
		System.out.print("Type in member number to edit: ");
	}

	public void showError() {
		System.out.println("Member number not found!");
	}

	public void newNamePrompt() {
		System.out.print("Enter new name: ");
	}

	public void newPINPrompt() {
		System.out.print("Enter new personal number: ");
	}

	public void editBoatMenuPrompt() {
		System.out.println("1. Change type of the boat");
		System.out.println("2. Change lenght of the boat");
		System.out.println("3. Delete boat");
		System.out.println("4. Go back to main menu");
	}

	public void selectBoatToEdit() {
		System.out.print("Choose a boat to edit: ");
	}

	public void editBoatTypePrompt() {
		System.out.println("Choose new type: ");
		System.out
				.print("1.Sailboat\n 2.Motorsailer\n 3.Kayak\n 4.Other\n ");
	}

	public void editBoatLenghtPrompt() {
		System.out.print("Enter new lenght: ");
	}

}