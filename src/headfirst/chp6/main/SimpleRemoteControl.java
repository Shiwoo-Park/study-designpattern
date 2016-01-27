// Invoker

package headfirst.chp6.main;

import headfirst.chp6.commands.Command;

public class SimpleRemoteControl {
	Command slot;
	public void setCommand(Command cmd){
		this.slot = cmd;
	}
	
	public void buttonPressed(){
		slot.execute();
	}
}
