package headfirst.chp6.command.commands;

public class DummyCommand implements Command{
	@Override
	public void execute() {
		System.out.println("No command");
	}
	@Override
	public void undo() {
		System.out.println("No command to undo");
	}
}
