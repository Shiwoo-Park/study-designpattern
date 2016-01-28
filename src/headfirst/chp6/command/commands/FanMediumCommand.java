package headfirst.chp6.command.commands;

import headfirst.chp6.command.models.Fan;

public class FanMediumCommand extends FanCommand{
	
	public FanMediumCommand(Fan fan) {
		super(fan);
	}

	@Override
	public void execute() {
		prevMode = fan.getSpeed();
		fan.medium();
	}
}
