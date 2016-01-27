// Client

package headfirst.chp6.main;

import headfirst.chp6.commands.LightOnCommand;
import headfirst.chp6.models.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);

		remote.setCommand(lightOn);
		remote.buttonPressed();
	}
}
