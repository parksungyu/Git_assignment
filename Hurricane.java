package Git_assignment;
//2)  태풍 ( 자연현상 )
//속성 : 태풍이름 , 번호 , 현재 위치(위도,경도) , 이동속도, 등등...
//행동 : 이동(위도,경도 변경)

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
		System.out.println(name + number + "호 가 이동합니다.");
		this.latitude += latitude;
		this.longitude += longitude;
	}

	
	public static void main(String[] args) {

	}

}
