package prob6;

public class Rectangle extends Shape implements Resizable{

	public double width;
	public double height;
	
	public Rectangle(double w,double h) {
		this.width = w;
		this.height = h;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width*this.height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+height) * 2;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		this.width = this.width*s;
		this.height = this.height*s;
	}
	
}
