package Git_assignment;
//1)  ��ǰ
//�Ӽ� :  ��ǰ��, ����, ����
//�ൿ :  �Ǹ�(���� ����) ,  �԰�(��������),  ����....



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
		System.out.println(name +"��ǰ�� �ֹ��մϴ�");
		if(this.quantity>0) { 
			this.quantity--;
		}
		else if (this.quantity==0) {
			System.out.println(name + "��ǰ�� �����Ǿ����ϴ�. �˼��մϴ�.");
		}
		}
	
	void resevation(String name) {
		System.out.println(name + "�� �����մϴ�.");
		if(this.name == name) {
			if(quantity >0) {
			System.out.println(name + "��(��)"+ price + "�� ����Ϸ�");
		}
	}
		else if(this.name != name) {
			if(quantity == 0) {
				System.out.println("������ �Ұ��մϴ�.");
			}
		}
	}
	public static void main(String[] args) {

		
	}

}
