package headfirst.chp6.command.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MacroCommand implements Command{
	List<Command> commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = new ArrayList<Command>(Arrays.asList(commands));
	}
	
	@Override
	public void execute() {
		for (Command cmd : commands){
			cmd.execute();
		}
	}

	@Override
	public void undo() {
		int cmdLen = commands.size();
		for(int i=cmdLen; i>0; i--){
			Command cmd = commands.get(i-1);
			cmd.undo();
		}
	}
}
