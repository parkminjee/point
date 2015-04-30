package point;

public class Rect extends Shape implements Drawable{
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw(){
		System.out.println("사각형을 그렸습니다.");
	}

	@Override
	public double calculatorArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
}
