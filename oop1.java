//===============================================================================================
//final : 상수화 ----> 값의 변경 금지!!
//===================================================================
//클래스를 만드는 순서
//1. 필드작성
//1-1. 적절한 타입과 이름으로 private으로 작성후 
//1-2. final 멤버 찾기 (상수) : setter,생성자모양의 영향을 주기 때문에
//2.getter/setter
//







//그림판의 동그라미를 클래스로
	package Git_assignment;
public class oop1 {
	class Circle
{
	private final double PI = 3.14;
	
	private int left;
	private int top;
	private int right;
	private int bottom;
	
	public double getPI() {
		return PI;
	}
	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getBottom() {
		return bottom;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	public Circle ( int left, int top, int right, int bottom) {
		this.left = left;
	}
	//public void Draw() {}
}








	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
