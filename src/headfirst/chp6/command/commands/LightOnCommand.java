// Concrete command

package headfirst.chp6.command.commands;

import headfirst.chp6.command.models.Light;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}
	
	@Override
	public void undo() {
		light.off();
	}
}
