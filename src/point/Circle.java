package point;

public class Circle extends Shape implements Drawable{
	private int r;
	
	public void draw(){
		System.out.println("원을 그렸습니다.");
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public double calculatorArea() {
		// TODO Auto-generated method stub
		return r*r*3.14;
	}
}
