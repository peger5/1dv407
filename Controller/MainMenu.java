package Controller;

public class MainMenu {

	public void menuOptions(Model.List list, View.StartScreen s,
			View.AddMemberScreen adds) {

		s.ShowWelcomeMessage();
		s.ShowStartInstructions();

		switch (s.GetInputChar()) {
		case '1':
			list.print();
			this.menuOptions(list, s, adds);
			break;
		case '2':
			Controller.AddMember addm = new Controller.AddMember();
			addm.addMember(list, adds);
			this.menuOptions(list, s, adds);
			break;
		case '3':
			System.out.println("search");
			break;
		case 'q':
			System.exit(-1);

		}

	}

}
