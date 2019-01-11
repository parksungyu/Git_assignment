package Git_assignment;
//5)  »ç¶÷
//¼Ó¼º :  ³ªÀÌ, ¸ö¹«°Ô, Ç÷¾Ð, Ã¼¿Â, Ç÷´ç, ¸Æ¹Ú
//Çàµ¿ :  »ýÀÏ, ¿îµ¿, ¹ä¸Ô±â


public class Person {

	private int age;
	private int blood_press;
	private int blood_sugar;
	private int pulse;
	private double weight;
	private double body_temp;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBlood_press() {
		return blood_press;
	}
	public void setBlood_press(int blood_press) {
		this.blood_press = blood_press;
	}
	public int getBlood_sugar() {
		return blood_sugar;
	}
	public void setBlood_sugar(int blood_sugar) {
		this.blood_sugar = blood_sugar;
	}
	public int getPulse() {
		return pulse;
	}
	public void setPulse(int pulse) {
		this.pulse = pulse;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBody_temp() {
		return body_temp;
	}
	public void setBody_temp(double body_temp) {
		this.body_temp = body_temp;
	}
	
	void birth(int age) {
		this.age++;
	}
	void exercise(int exer_amount) {
		this.blood_press ++;
		this.blood_sugar --;
		this.weight --;
		this.pulse ++;
		this.body_temp ++;
	}
	void eat(int calorie) {
		this.weight ++;
		this.blood_press ++;
		this.blood_sugar ++;
		this.pulse ++;
		this.body_temp ++;
	}
	
		
	
	}


