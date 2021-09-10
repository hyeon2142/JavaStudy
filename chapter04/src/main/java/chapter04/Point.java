package chapter04;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x	= x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		return super.equals(obj);
	}
}
