package Git_assignment;
//2)  ��ǳ ( �ڿ����� )
//�Ӽ� : ��ǳ�̸� , ��ȣ , ���� ��ġ(����,�浵) , �̵��ӵ�, ���...
//�ൿ : �̵�(����,�浵 ����)

public class Hurricane {

	private String name;
	private int number;
	private int latitude;
	private int longitude;
	private int speed;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	void move() {
		System.out.println(name + number + "ȣ �� �̵��մϴ�.");
		this.latitude += latitude;
		this.longitude += longitude;
	}

	
	public static void main(String[] args) {

	}

}
