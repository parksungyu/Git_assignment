//static �޼ҵ�
//--->���� �޼ҵ�
//--->��ü�� �ൿ�� �ƴ϶� Ŭ������ �ൿ !!
// EX)������ �ൿ!!
// ����, �̵�, ����, ������, ����, Ȧ�� ,����
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
	private static int range;	//��Ÿ�
	private static int attup;
	private static int defup;
	//static �� (������)
	static
	{
		range = 10;
		attup = 0;
		defup = 0;
	}
	//�ν��Ͻ� ������
	public Marine2()
	{
		hp = 40;
	}
	//�ν��Ͻ� �޼ҵ�: �������� ��ü�� �ൿ
	public void attack() {
		
	}
	//���� �żҵ� Ŭ���� ���� ����
	public static void RangeUpgrade() {
		range++;
	}
	
	
	
}

public class OOP3 {


	public static void main(String[] args) {
		Marine2 m1 = new Marine2();
		Marine2 m2 = new Marine2();
		Marine2 m3 = new Marine2();
		
		//Ŭ���� �̸����� ȣ�Ⱑ�� �����޼ҵ�
		Marine2.RangeUpgrade();
		
		
}
}
