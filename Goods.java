package Git_assignment;
//1)  ��ǰ
//�Ӽ� :  ��ǰ��, ����, ����
//�ൿ :  �Ǹ�(���� ����) ,  �԰�(��������),  ����....
//����Ÿ ����(���� ��ȣ)
//=========================================================
//��ü���⿡���� �����͸� ������ �߿��� �����.�������߽�(Java�� ������ü���� ���)
//c���� �Լ��ȿ��� �˰����� ¥�°��� �߿���ϴ� ����߽�(C���)
//=========================================================
//1. Ŭ���� �ۼ� ��ħ!
//-1)�ʵ� ���� : ������ Ÿ�԰� ������ �̸����� �ʵ带 �����ϱ�
//--->�⺻������ ��� �ʵ�� private���� ����
//-2) �ʵ��� ���ݿ� ���� getter/setter�� ����
//--->�ٲ����� �ִٶ�� �ϸ� �ټ��� �ۼ�
//-3) �����ڸ� �ۼ�����
//
//
//
//
//
//



public class Goods //��ǰ
{
	//�ʵ�
	private int pcode;// ��ǰ�ڵ�
	private String name; // ��ǰ��
	private int price; // ����
	private int quantity; // ��ǰ�� ����
	//������
	//---> ��ü�� �����ɶ� �ڵ����� ȣ��Ǽ� ��ü�� ��� ������ �ڵ����� �ʱ�ȭ ��Ű�°�
	//---> ��������Ư¡
	//1)Ŭ������ �̸��� ����
	//2)�Ϲ����� ��쿡 public���� �ۼ��Ѵ� --> private ��ü���� �Ұ�
	public Goods(){}
	{
		System.out.println(" ȣ�� ��...");
	}
	//�޼ҵ� �����ε� : ���� �̸��� �Լ��� ������ �����Ҽ��ִ�!!
	//��, �Ű����� ������ �޶����
	public Goods(int pcode)
	{
		System.out.println(" ȣ�� ��...");
	}
	public Goods(String name, int price, int quantity, int pcode){}
	{
		this.name = name;
		this.pcode = pcode;
		this.price = price;
		this.quantity = quantity;
	}
	// �ൿ����
	//��ǰ�ڵ�� �ٲ��������� getter�� ������
	
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
		if(price>0)//�̰Ͷ����� getter,setter�� ����� ��ȿ���˻� ��������?
			this.price = price;
	}
	void decre_quantity(int quantity) {
		this.quantity -= quantity;
	}
	void incre_quantity(int quantity) {
		this.quantity += quantity;
	}
	
	
	
	//�ൿ
	//�޼ҵ� ����: ���ǵ� �ൿ���� ���� !!
	public void sell() {}
	
	

	
	
	public static void main(String[] args) {
		//Ŭ���� Ÿ���� ���� = ��ü (�ν��Ͻ�)
		Goods g1 = new Goods(pcode:1234,name:"������",price:9000,quantity:5);
		//g1.setName("������");
		//g1.setQuantity(5);
		//g1.price(9000);
		//�����ڸ� ���ؼ� �ʱ�ȭ��Ų��
		//pcode�� �ʱ�ȭ��Ű�����ؼ���
		
		System.out.println(g1.pcode);
	}

}
