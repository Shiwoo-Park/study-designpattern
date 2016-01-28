package headfirst.chp7.facade;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Projector projector = new Projector();
		Screen screen = new Screen();
		DVDPlayer dvdPlayer = new DVDPlayer();
		HomeTheaterFacade facade = new HomeTheaterFacade(projector, screen, dvdPlayer);

		// very easy to control interfaces
		facade.watch("The Lord of Rings 3");
		System.out.println("\n  Watching...\n");
		facade.endWatch();
	}
}
