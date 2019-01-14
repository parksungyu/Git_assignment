package Git_assignment;
// ---->this 는 객체를 나타내는 참조
// ---->메소드를 호출한 객체
// ----> this는 메소드 안에서 객체를 참조하기위한 기능
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


//중앙버전관리 시스템은 무엇이있을까svn-->git
//ui와 콘솔 둘다 가능
