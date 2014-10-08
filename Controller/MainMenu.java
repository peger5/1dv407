package Controller;

public class MainMenu {

	public void menuOptions(Model.List list, View.StartScreen s,
			View.AddMemberScreen adds, View.ListScreen ls, View.SearchScreen ss) {

		s.ShowWelcomeMessage();
		s.ShowStartInstructions();

		switch (s.GetInputChar()) {
		case '1':
			Controller.MemberList mmbl = new Controller.MemberList();
			mmbl.printCompact(list, ls);
			switch(ls.GetInputChar()){
			case '1':
				if(mmbl.getFlag()){
				mmbl.printCompact(list, ls);
				mmbl.setFlag();
				this.menuOptions(list, s, adds, ls,ss);
			}
			else{
				mmbl.printVerbose(list, ls);
				mmbl.setFlag();
				this.menuOptions(list, s, adds, ls,ss);
			}
				break;
			case 'b':
				this.menuOptions(list, s, adds, ls,ss);
				break;
			}
			
			
//			list.print();
//			this.menuOptions(list, s, adds);
			break;
		case '2':
			Controller.AddMember addm = new Controller.AddMember();
			addm.addMember(list, adds);
			this.menuOptions(list, s, adds,ls,ss);
			break;
		case '3':
			Controller.SearchMember smb = new Controller.SearchMember();
			smb.search(list, ss);
			break;
		case 'q':
			System.exit(-1);

		}

	}

}
