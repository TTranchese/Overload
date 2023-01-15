package it.develhope.overload;

public class Shape {
	public String shapeName;
	public int numberOfEdges;

	public Shape() {
		System.out.println("new shape created");
		this.shapeName = "Undefined shape";
	}

	public Shape(double radius) {
		System.out.println("new shape created");
		this.shapeName = "circle";
	}

	public Shape(int edges, double edgeLength) {
		System.out.println("new shape created");
		this.shapeName = "square";
		this.numberOfEdges = edges;
	}

	public Shape(int edges, double e1, double e2) {
		System.out.println("new shape created");
		this.shapeName = "rectangle";
		this.numberOfEdges = edges;
	}

	public Shape(double e1, double e2, double e3) {
		System.out.println("new shape created");
		this.shapeName = "triangle";
		this.numberOfEdges = 3;
	}
	 public String getShapeDetails(){
		return "Shape: "+shapeName+ " Number of edges: "+numberOfEdges;
	 }
}
