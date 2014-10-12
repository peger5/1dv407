import Controller.AddMember;


public class Main {

	public static void main(String[] args) {
		Model.List l = new Model.List();
		View.StartScreen s = new View.StartScreen();
		Controller.MainMenu m = new Controller.MainMenu();
		View.AddMemberScreen addm = new View.AddMemberScreen();
		View.ListScreen ls = new View.ListScreen();
		View.SearchScreen ss = new View.SearchScreen();
		View.EditScreen es = new View.EditScreen();
		
		m.menuOptions(l);
	}

}
