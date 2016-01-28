package headfirst.chp6.command.commands;

import headfirst.chp6.command.models.Fan;

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
