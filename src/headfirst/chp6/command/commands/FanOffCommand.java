package headfirst.chp6.command.commands;

import headfirst.chp6.command.models.Fan;

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
