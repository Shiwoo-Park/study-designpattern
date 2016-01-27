package headfirst.chp6.commands;

import headfirst.chp6.models.Fan;

public class FanOffCommand extends FanCommand{
	
	public FanOffCommand(Fan fan) {
		super(fan);
	}

	@Override
	public void execute() {
		prevMode = fan.getSpeed();
		fan.off();
	}
}
