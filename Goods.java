package Git_assignment;
//1)  상품
//속성 :  상품명, 가격, 수량
//행동 :  판매(수량 감소) ,  입고(수량증가),  예약....



public class Goods {

	private String name;
	private int price;
	private int quantity;
	
	
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
		this.price = price;
	}
	void decre_quantity(int quantity) {
		this.quantity -= quantity;
	}
	void incre_quantity(int quantity) {
		this.quantity += quantity;
	}
	void sale() {
		System.out.println(name +"상품을 주문합니다");
		if(this.quantity>0) { 
			this.quantity--;
		}
		else if (this.quantity==0) {
			System.out.println(name + "상품이 매진되었습니다. 죄송합니다.");
		}
		}
	
	void resevation(String name) {
		System.out.println(name + "을 예약합니다.");
		if(this.name == name) {
			if(quantity >0) {
			System.out.println(name + "을(를)"+ price + "에 예약완료");
		}
	}
		else if(this.name != name) {
			if(quantity == 0) {
				System.out.println("예약이 불가합니다.");
			}
		}
	}
	public static void main(String[] args) {

		
	}

}
