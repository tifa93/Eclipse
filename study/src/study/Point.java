package study;

public class Point {
	int x;
	int y;
	public Point(){
		
	}
	public Point(int new_x, int new_y) {
		this.x = new_x;
		this.y = new_y;
	}
	public void setX(int x) {
		//x=x;
		this.x=x;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
