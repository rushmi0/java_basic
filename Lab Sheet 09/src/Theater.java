//2013111089 ÇÑªÃ¾Å ¾§ÉìÇÔÅÑÂ
public class Theater extends Movie{
	
	private int theaterNo;
	
	public Theater(String id, String name,Director director,int theaterNo) {
		 super( id, name, director);
		 this.theaterNo = theaterNo;
	}	
	public String gettheaterName(){
		if(this.theaterNo >= 1 && this.theaterNo <= 1)
			return "Basic Theater";
		if(this.theaterNo >= 12 && this.theaterNo <= 14)
			return "Sweet Theater";
		if(this.theaterNo >= 15)
			return "Premium Theater";
		return null;
	}
	public String toString() {
		//[getTheaterName()]: [toString() from superclass]
		return "["+this.gettheaterName()+"]: "+toString()+super.toString();
	}
	

}
