package headfirst.chp7.facade;

public class DVDPlayer {
	String dvd;

	public void setDVD(String name){
		this.dvd = name;
		System.out.println("Set DVD "+this.dvd);
	}

	public void play(){
		if(this.dvd != null)
			System.out.println("Play "+this.dvd);
		else
			System.out.println("No DVD to play");
	}

	public void stop(){
		if(this.dvd != null)
			System.out.println("Stop playing "+this.dvd);
		else
			System.out.println("No DVD to stop playing");
	}

	public String eject(){
		if(this.dvd != null){
			String currentDVD = this.dvd;
			this.dvd = null;
			return currentDVD;
		}
		return "NO DVD";
	}
	
	public String getDVD(){
		return this.dvd;
	}
}
