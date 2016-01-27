package headfirst.chp6.commands;

import headfirst.chp6.models.Fan;

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
