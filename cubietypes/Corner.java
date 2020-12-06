package cubesolver.cubietypes;

public class Corner {
	
	public String updown = "";
	public String leftright = "";
	public String frontback = "";
	
	public Corner(String updownn, String leftrightt, String frontbackk) {
		updown = updownn;
		leftright = leftrightt;
		frontback = frontbackk;
	}
	
	public String tost() {
		return "updown: " + updown + ", leftright: " + leftright + ", frontback: " + frontback;
		
	}
}
