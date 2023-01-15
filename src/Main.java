import it.develhope.overload.Shape;

public class Main {
	public static void main(String[] args) {
		Shape shape1 =  new Shape();
		Shape shape2 =  new Shape(3.12);
		Shape shape3 =  new Shape(4, 3.1);
		Shape shape4 =  new Shape(4,  3.12,3.9);
		Shape shape5 =  new Shape(1.2, 1.4, 1.9);

		String shape1String = shape1.getShapeDetails();
		String shape2String = shape2.getShapeDetails();
		String shape3String = shape3.getShapeDetails();
		String shape4String = shape4.getShapeDetails();
		String shape5String = shape5.getShapeDetails();

		System.out.println(shape1String);
		System.out.println(shape2String);
		System.out.println(shape3String);
		System.out.println(shape4String);
		System.out.println(shape5String);
	}
}