// Client

package headfirst.chp6.main;

import headfirst.chp6.commands.FanHighCommand;
import headfirst.chp6.commands.FanMediumCommand;
import headfirst.chp6.commands.FanOffCommand;
import headfirst.chp6.commands.LightOffCommand;
import headfirst.chp6.commands.LightOnCommand;
import headfirst.chp6.models.Fan;
import headfirst.chp6.models.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(3);

		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);

		Fan fan = new Fan();
		FanHighCommand fanHigh = new FanHighCommand(fan);
		FanMediumCommand fanMedium = new FanMediumCommand(fan);
		FanOffCommand fanOff = new FanOffCommand(fan);

		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, fanHigh, fanOff);
		remote.setCommand(2, fanMedium, fanOff);

		remote.onButtonPressed(0);
		remote.offButtonPressed(0);
		remote.undoPressed();
		System.out.println("===========");
		remote.onButtonPressed(1);
		remote.offButtonPressed(1);
		remote.undoPressed();
		remote.undoPressed(); // not working
		System.out.println("===========");
		remote.onButtonPressed(2);
		remote.offButtonPressed(2);
		remote.onButtonPressed(1);
		remote.undoPressed();
		
	}
}
