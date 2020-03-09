package Structural_Pattern.Facade_pattern;

public class FacadePatternDemo {
	public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }
}
