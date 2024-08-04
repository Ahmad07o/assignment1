public class Prob5{
	public static void main(String []args){
		int lengthRectangle=36;
		int breathRectangle=36;
		int radiusOfCircle=36;
		int areaOfRectangle=lengthRectangle*breathRectangle;
		int perimeterOfRectangle=2*(lengthRectangle+breathRectangle);
		double circumference=2*Math.PI*radiusOfCircle;
		double areaOfCircle=Math.PI*radiusOfCircle*radiusOfCircle;
		System.out.println("Area of circle is:"+areaOfCircle);
		System.out.println("Area of rectangle is:"+areaOfRectangle);
		System.out.println("Circumfernce of circle is:"+circumference);
		System.out.println("perimtere of circle is:"+perimeterOfRectangle);
	}
}