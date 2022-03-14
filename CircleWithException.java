import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleWithException {
	
	  private double radius;
	    private double area;
	    private double diameter;
	    private static final DecimalFormat df = new DecimalFormat("0.00");

	    public CircleWithException(double Radius) throws IllegalArgumentException, Exception
	    {
	        if (Radius<0) throw new IllegalArgumentException("Radius must be positive.");
	        this.radius = Radius;
	    }
	    public void setRadius(double Radius)throws IllegalArgumentException, Exception{
	        if (Radius<0) throw new IllegalArgumentException("Radius must be positive.");
	        this.radius = Radius;
	    }

	    public double getRadius(){
	        return this.radius;
	    }

	    public double getArea() throws Exception{
	        this.area = Math.PI * radius * radius;
	        if(area > 1000) throw new Exception("Area of circle is bigger than 1000");
	        return area;
	    }

	    public double getDiameter(){
	        this.diameter = 2*radius;
	        return diameter;
	    }

	    public static void main(String[] args){
	        try{
	            Scanner input = new Scanner(System.in);
	            
	            System.out.println("Enter radius of circle: ");
	            
	            CircleWithException aCircle = new CircleWithException(input.nextDouble());
	            
	            System.out.println("Area of circle: " + df.format(aCircle.getArea()));
	            
	            System.out.println("Diameter of circle: " + df.format(aCircle.getDiameter()));
	            
	            input.close();

	        } catch(IllegalArgumentException e){
	            System.out.println(e);
	        } catch (Exception e){
	            System.out.println(e);
	        }
	    }

}
