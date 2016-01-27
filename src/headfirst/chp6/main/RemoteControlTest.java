// Client

package headfirst.chp6.main;

import headfirst.chp6.commands.Command;
import headfirst.chp6.commands.FanHighCommand;
import headfirst.chp6.commands.FanMediumCommand;
import headfirst.chp6.commands.FanOffCommand;
import headfirst.chp6.commands.LightOffCommand;
import headfirst.chp6.commands.LightOnCommand;
import headfirst.chp6.commands.MacroCommand;
import headfirst.chp6.models.Fan;
import headfirst.chp6.models.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(4);

		Light light = new Light();
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);

		Fan fan = new Fan();
		Command fanHigh = new FanHighCommand(fan);
		Command fanMedium = new FanMediumCommand(fan);
		Command fanOff = new FanOffCommand(fan);

		Command[] macroArr = {fanHigh, lightOn};
		Command[] macroArr2 = {fanOff, lightOff};
		MacroCommand macro = new MacroCommand(macroArr);
		MacroCommand macro2 = new MacroCommand(macroArr2);
		
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, fanHigh, fanOff);
		remote.setCommand(2, fanMedium, fanOff);
		remote.setCommand(3, macro, macro2);

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
		System.out.println("===========");

		// Macro Command
		remote.onButtonPressed(3);
		remote.offButtonPressed(3);
		remote.onButtonPressed(3);
		remote.undoPressed();
		
	}
}
