//static 메소드
//--->정적 메소드
//--->객체의 행동이 아니라 클래스의 행동 !!
// EX)마린의 행동!!
// 공격, 이동, 정찰, 스팀팩, 업글, 홀드 ,스톱
//
//
//
//
//
//
//
//
//
//
//
//
package Git_assignment;



class Marine2
{
	private int hp;
	private static int range;	//사거리
	private static int attup;
	private static int defup;
	//static 블럭 (생성자)
	static
	{
		range = 10;
		attup = 0;
		defup = 0;
	}
	//인스턴스 생성자
	public Marine2()
	{
		hp = 40;
	}
	//인스턴스 메소드: 개별적인 객체의 행동
	public void attack() {
		
	}
	//정적 매소드 클래스 전부 적용
	public static void RangeUpgrade() {
		range++;
	}
	
	
	
}

public class OOP3 {


	public static void main(String[] args) {
		Marine2 m1 = new Marine2();
		Marine2 m2 = new Marine2();
		Marine2 m3 = new Marine2();
		
		//클래스 이름으로 호출가능 정적메소드
		Marine2.RangeUpgrade();
		
		
}
}
