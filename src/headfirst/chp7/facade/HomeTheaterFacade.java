package headfirst.chp7.facade;

public class HomeTheaterFacade {
	
	Projector projector;
	Screen screen;
	DVDPlayer dvdPlayer;
	
	public HomeTheaterFacade(Projector p, Screen s, DVDPlayer d) {
		this.projector = p;
		this.screen = s;
		this.dvdPlayer = d;
	}
	
	public void watch(String dvdName){
		System.out.println("Home theater : Get ready to watch DVD");
		screen.down();
		projector.on();
		dvdPlayer.setDVD(dvdName);
		dvdPlayer.play();
		System.out.println(dvdPlayer.getDVD());
	}
	
	public void endWatch(){
		System.out.println("Shutting down home theater");

		if(dvdPlayer.getDVD() == null)
			System.out.println("No DVD has been set");
		else{
			dvdPlayer.stop();
			dvdPlayer.eject();
		}
		
		projector.off();
		screen.up();
	}
}
