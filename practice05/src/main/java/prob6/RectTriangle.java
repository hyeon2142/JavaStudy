package prob6;

public class RectTriangle extends Shape{

	public double width;
	public double height;
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width*height)/2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width+height+Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
	}
	
	public RectTriangle(double w,double h) {
		this.width = w;
		this.height = h;
	}
	
	

}
