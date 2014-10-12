package Controller;

import View.AddMemberScreen;
import View.EditScreen;
import View.ListScreen;
import View.SearchScreen;
import View.StartScreen;

public class MainMenu {
	
	private View.StartScreen s = new View.StartScreen();
	private View.AddMemberScreen adds = new View.AddMemberScreen();
	private View.ListScreen ls = new View.ListScreen();
	private View.SearchScreen ss = new View.SearchScreen();
	private View.EditScreen es = new View.EditScreen();
			
	
	public void menuOptions(Model.List list) {

		s.ShowWelcomeMessage();
		s.ShowStartInstructions();

		switch (s.GetInputChar()) {
		case '1':
			Controller.MemberList mmbl = new Controller.MemberList();
		
			mmbl.printCompact(list, ls);
				
			switch(ls.GetInputChar()){
			case 'c':
				mmbl.printCompact(list, ls);
//				if(ls.pressEnterToContinue())
				//	this.menuOptions(list, s, adds, ls,ss,es);
				mmbl.listMenu(list, ls);
				break;
			case 'v':
				mmbl.printVerbose(list, ls);
//				if(ls.pressEnterToContinue())
				mmbl.listMenu(list, ls);	
				break;
			case 'e':
				mmbl.editMember(list, es);
				this.menuOptions(list);
				break;
			case 'b':
				this.menuOptions(list);
			
				break;
			}
			
			
//			list.print();
//			this.menuOptions(list, s, adds);
			break;
		case '2':
			Controller.AddMember addm = new Controller.AddMember();
			addm.addMember(list, adds);
			this.menuOptions(list);
			break;
		case '3':
			Controller.SearchMember smb = new Controller.SearchMember();
			smb.search(list, ss);
			//ss.pressEnterPrompt();
			if(ss.pressEnterToContinue()){
			this.menuOptions(list);
			}
			break;
		case 'q':
			System.exit(-1);

		}

	}

}
