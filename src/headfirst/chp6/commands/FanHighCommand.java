package headfirst.chp6.commands;

import headfirst.chp6.models.Fan;

public class FanHighCommand extends FanCommand{
	public FanHighCommand(Fan fan) {
		super(fan);
	}

	@Override
	public void execute() {
		prevMode = fan.getSpeed();
		fan.high();
	}
}
