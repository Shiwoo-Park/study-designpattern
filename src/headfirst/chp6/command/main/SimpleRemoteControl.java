// Invoker

package headfirst.chp6.command.main;

import java.util.ArrayList;
import java.util.List;

import headfirst.chp6.command.commands.Command;
import headfirst.chp6.command.commands.DummyCommand;

public class SimpleRemoteControl {
	List<Command> onCommands;
	List<Command> offCommands;
	Command undoCommand;
	
	public SimpleRemoteControl(int size) {
		onCommands = new ArrayList<Command>();
		offCommands = new ArrayList<Command>();
		
		Command dummyCommand = new DummyCommand();
		for(int i=0; i<size; i++){
			onCommands.add(dummyCommand);
			offCommands.add(dummyCommand);
		}
		
		undoCommand = new DummyCommand();
	}
	
	public void setCommand(int slotID, Command onCmd, Command offCmd){
		this.onCommands.set(slotID, onCmd);
		this.offCommands.set(slotID, offCmd);
	}
	
	public void onButtonPressed(int slotID){
		onCommands.get(slotID).execute();
		undoCommand = onCommands.get(slotID);
	}

	public void offButtonPressed(int slotID){
		offCommands.get(slotID).execute();
		undoCommand = offCommands.get(slotID);
	}

	public void undoPressed(){
		undoCommand.undo();
	}
}
