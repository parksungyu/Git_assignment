package Git_assignment;
// ---->this �� ��ü�� ��Ÿ���� ����
// ---->�޼ҵ带 ȣ���� ��ü
// ----> this�� �޼ҵ� �ȿ��� ��ü�� �����ϱ����� ���
//

class point
{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

    public point(int x, int y)
    {
    	this.x = x;
    	this.y = y;
    }
    public void show()
    {
    	System.out.println(x+":"+y);
    	
    }

}



public class OOP4 {

	public static void main(String[] args) {
		point pt1 = new point(x:123,y:123);
		pt1.show();
		point pt2 = new point(x:123,y:123);
		pt2.show();
	}

}


//�߾ӹ������� �ý����� ������������svn-->git
//ui�� �ܼ� �Ѵ� ����
