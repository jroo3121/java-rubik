package cubesolver;

import cubesolver.cubietypes.Center;
import cubesolver.cubietypes.Corner;
import cubesolver.cubietypes.Edge;

public class Cube {
	public static Corner topbackleftcorner;
	public static Corner topfrontleftcorner;
	public static Corner topbackrightcorner;
	public static Corner topfrontrightcorner;
	public static Corner bottombackleftcorner;
	public static Corner bottomfrontleftcorner;
	public static Corner bottombackrightcorner;
	public static Corner bottomfrontrightcorner;
	public static Edge topleftedge;
	public static Edge topfrontedge;
	public static Edge topbackedge;
	public static Edge toprightedge;
	public static Edge bottomleftedge;
	public static Edge bottomfrontedge;
	public static Edge bottombackedge;
	public static Edge bottomightedge;
	public static Edge frontleftedge;
	public static Edge frontrightedge;
	public static Edge backleftedge;
	public static Edge backrightedge;
	public static Center bluec;
	public static Center orangec;
	public static Center greenc;
	public static Center redc;
	public static Center whitec;
	public static Center yellowc;

	
	public Cube(String[][] blue, String[][] orange, String[][] green, String[][] red, String[][] white, String[][] yellow) {
		
		bluec = Center.BLUE;
		orangec = Center.ORANGE;
		greenc = Center.GREEN;
		redc = Center.RED;
		whitec = Center.WHITE;
		yellowc = Center.YELLOW;
		
		topbackleftcorner = new Corner(white[m(3)][m(3)], orange[m(1)][m(1)], blue[m(1)][m(3)]);
		topfrontleftcorner = new Corner(white[m(1)][m(3)], orange[m(1)][m(3)], green[m(1)][m(1)]);
		topbackrightcorner = new Corner(white[m(3)][m(1)], red[m(1)][m(3)], blue[m(1)][m(1)]);
		topfrontrightcorner = new Corner(white[m(1)][m(1)], red[m(1)][m(1)], green[m(1)][m(3)]);
		bottombackleftcorner = new Corner(yellow[m(3)][m(1)], orange[m(3)][m(1)], blue[m(3)][m(3)]);
		bottomfrontleftcorner = new Corner(yellow[m(1)][m(1)], orange[m(3)][m(3)], green[m(3)][m(1)]);
		bottombackrightcorner = new Corner(yellow[m(3)][m(3)], red[m(3)][m(3)], blue[m(3)][m(1)]);
		bottomfrontrightcorner = new Corner(yellow[m(1)][m(3)], red[m(3)][m(1)], green[m(3)][m(3)]);
		
		
//System.out.println("topbackleftcorner: " + topbackleftcorner.tost());
//System.out.println("topfrontleftcorner: " + topfrontleftcorner.tost());
//System.out.println("topbackrightcorner: "	+topbackrightcorner.tost());   
//System.out.println("topfrontrightcorner: "	+topfrontrightcorner.tost());
//System.out.println("bottombackleftcorner: "	+	bottombackleftcorner.tost());  
//System.out.println("bottomfrontleftcorner: "	+	bottomfrontleftcorner.tost());
//System.out.println("bottombackrightcorner: "	+	bottombackrightcorner.tost());
//System.out.println("bottomfrontrightcorner: "	+	bottomfrontrightcorner.tost());

	}
	
	public int m(int i) {
		return i - 1;
	}

}
