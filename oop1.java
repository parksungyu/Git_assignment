//===============================================================================================
//final : ���ȭ ----> ���� ���� ����!!
//===================================================================
//Ŭ������ ����� ����
//1. �ʵ��ۼ�
//1-1. ������ Ÿ�԰� �̸����� private���� �ۼ��� 
//1-2. final ��� ã�� (���) : setter,�����ڸ���� ������ �ֱ� ������
//2.getter/setter
//







//�׸����� ���׶�̸� Ŭ������
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
