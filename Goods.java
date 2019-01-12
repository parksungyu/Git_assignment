package Git_assignment;
//1)  상품
//속성 :  상품명, 가격, 수량
//행동 :  판매(수량 감소) ,  입고(수량증가),  예약....
//데이타 은닉(정보 보호)
//=========================================================
//객체지향에서는 데이터를 굉장히 중요히 여긴다.데이터중시(Java는 완전객체지향 언어)
//c언어는 함수안에서 알고리즘을 짜는것을 중요시하는 기능중시(C언어)
//=========================================================
//1. 클래스 작성 지침!
//-1)필드 구현 : 적합한 타입과 적합한 이름으로 필드를 구현하기
//--->기본적으로 모든 필드는 private으로 구현
//-2) 필드의 성격에 따라서 getter/setter를 구현
//--->바끌수도 있다라고 하면 겟셋을 작성
//-3) 생성자를 작성하자
//
//
//
//
//
//



public class Goods //상품
{
	//필드
	private int pcode;// 상품코드
	private String name; // 상품명
	private int price; // 가격
	private int quantity; // 상품의 수량
	//생성자
	//---> 객체가 생성될때 자동으로 호출되서 객체의 멤버 변수를 자동으로 초기화 시키는것
	//---> 생성자의특징
	//1)클래스와 이름이 동일
	//2)일반적인 경우에 public으로 작성한다 --> private 객체생성 불가
	public Goods(){}
	{
		System.out.println(" 호출 됨...");
	}
	//메소드 오버로딩 : 같은 이름의 함수가 여러개 존재할수있다!!
	//단, 매개변수 정보가 달라야함
	public Goods(int pcode)
	{
		System.out.println(" 호출 됨...");
	}
	public Goods(String name, int price, int quantity, int pcode){}
	{
		this.name = name;
		this.pcode = pcode;
		this.price = price;
		this.quantity = quantity;
	}
	// 행동구현
	//상품코드는 바뀌지않으니 getter만 만들면됨
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity>0)
		this.quantity = quantity;
	}
	public int getPcode() {
		return pcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>0)//이것때문에 getter,setter를 만든다 유효성검사 범위지정?
			this.price = price;
	}
	void decre_quantity(int quantity) {
		this.quantity -= quantity;
	}
	void incre_quantity(int quantity) {
		this.quantity += quantity;
	}
	
	
	
	//행동
	//메소드 구현: 정의된 행동들을 구현 !!
	public void sell() {}
	
	

	
	
	public static void main(String[] args) {
		//클래스 타입의 변수 = 객체 (인스턴스)
		Goods g1 = new Goods(pcode:1234,name:"가습기",price:9000,quantity:5);
		//g1.setName("가습기");
		//g1.setQuantity(5);
		//g1.price(9000);
		//생성자를 통해서 초기화시킨다
		//pcode를 초기화시키기위해서는
		
		System.out.println(g1.pcode);
	}

}
