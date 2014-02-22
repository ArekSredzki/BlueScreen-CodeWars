import java.lang.Math;
import java.lang.Float;
import java.lang.Double;
public class Player {
	
	/* Fields */
	
	//X-Position of Player
	private int centreX;
	
	//Y-Position of Player
	private int centreY;
	
	
	//Object size from centre
	//Used to check collisions
	private int radius;
	
	//Velocity Vector in the X-Direction
	private float deltaX;
	
	//Velocity Vector in the Y-Direction
	private float deltaY;
	
	//Angle of Player
	//Passed by Gyroscope
	private float angle;
	
	
	/* Constructors */
	
	public Player(int X, int Y, int R, float dX, float dY){
		
		//Instantiates Fields to Parameter values
		centreX = X;
		centreY = Y;
		radius = R;
		deltaX = dX;
		deltaY = dY;
		
	}
	
	//update Player velocity vectors
	public void update(float dX, float dY){
		
		//assigns parameter velocity to fields
		setDeltaX(dX);
		setDeltaY(dY);
		
		//assigns
		angle = calculateAngle();
		
	}
	
	
	/* Helper Methods */ 
	
	//calculates Player angle from velocity vectors
	//arctan of velocities
	private float calculateAngle(){
		//local double variables representing velocities
		double dX;
		double dY;
		
		//local double representing angle
		double theta;
		
		//local Float objects assigned Field values
		Float deltaX = Float.valueOf(getDeltaX());
		Float deltaY = Float.valueOf(getDeltaY());
		
		//local Double objects
		Double Theta;
		
		//converts float fields to doubles and assigns them to local double variables
		dX = deltaX.doubleValue();
		dY = deltaY.doubleValue();
		
		//applies arctan to extract direction from conversion to polar coordinate
		theta = Math.atan2(dX, dY);
		
		//assigns double value to Double Object
		Theta = Double.valueOf(theta);
		
		//type casts double to float and returns value
		return Theta.floatValue();
	}

	
	/* Accessor Methods */
	
	public int getCentreX() {
		return centreX;
	}

	public int getCentreY() {
		return centreY;
	}

	public int getRadius() {
		return radius;
	}

	public float getDeltaX() {
		return deltaX;
	}

	public float getDeltaY() {
		return deltaY;
	}

	public float getAngle() {
		return angle;
	}

	
	/* Mutator Methods */
	
	public void setCentreX(int centreX) {
		this.centreX = centreX;
	}
	
	public void setCentreY(int centreY) {
		this.centreY = centreY;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setDeltaX(float deltaX) {
		this.deltaX = deltaX;
	}

	public void setDeltaY(float deltaY) {
		this.deltaY = deltaY;
	}
	public void setAngle(float angle) {
		this.angle = angle;
	}
}
