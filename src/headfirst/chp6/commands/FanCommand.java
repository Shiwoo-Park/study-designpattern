package headfirst.chp6.commands;

import headfirst.chp6.models.Fan;

public abstract class FanCommand implements Command{
	Fan fan;
	int prevMode;

	public FanCommand(Fan fan) {
		this.fan = fan;
	}

	public abstract void execute();

	@Override
	public void undo() {
		switch (prevMode) {
		case Fan.HIGH:
			fan.high();
			break;

		case Fan.MEDIUM:
			fan.medium();
			break;

		case Fan.LOW:
			fan.low();
			break;

		case Fan.OFF:
			fan.off();
			break;

		default:
			break;
		}
	}

}
