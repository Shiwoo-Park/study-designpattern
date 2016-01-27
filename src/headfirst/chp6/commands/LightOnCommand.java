// Concrete command

package headfirst.chp6.commands;

import headfirst.chp6.models.Light;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}
}
