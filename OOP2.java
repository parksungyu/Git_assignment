//=======================================================================================================
//static
//----> ���� (����)
//----> ���� �ʵ�(����)
//------> �ϳ��� Ŭ������ ���� ������� �������� ��ü���� �����ϴ� ����
//=======================================================================================================
//Ŭ������ ����� ����
//1. �ʵ��ۼ�
//1-1. ������ Ÿ�԰� �̸����� private���� �ۼ��� 
//1-2. final ��� ã�� (���) : setter,�����ڸ���� ������ �ֱ� ������
//1-3. static ��� ã�� (�����ʵ�)�ν��Ͻ� �ʵ尡 �������� ���ԵǴ� �Ӽ�


//2.getter/setter


//3.������









package Git_assignment;



	class Marine{
		private static final int MAX_hp = 40;     //�ִ�ü��
		private int CUR_hp;     //����ü��
		private static final int att = 7; 		//���ݷ� 
		private static final int def = 7; 		//����
		private static final int price = 50; 		//����
		private static int attup; 		//���ݷ� ���۴ܰ�
		private static int defup; 		//���� ���۴ܰ�
		private int kills;
		
		public static int getMaxHp() {
			return MAX_hp;
		}
		public int getCUR_hp() {
			return CUR_hp;
		}
		public static int getAtt() {
			return att;
		}
		public static int getDef() {
			return def;
		}
		public static int getPrice() {
			return price;
		}
		public static int getAttup() {
			return attup;
		}
		public static int getDefup() {
			return defup;
		}
		public int getKills() {
			return kills;
		}
		public void setCUR_hp(int cUR_hp) {
			CUR_hp = cUR_hp;
		}
		public static void setAttup(int attup) {
			Marine.attup = attup;
		}
		public static void setDefup(int defup) {
			Marine.defup = defup;
		}
		public void setKills(int kills) {
			this.kills = kills;
		}
		//���� ������ : static ����� �ʱ�ȭ
		static 
		{
			attup = 0;
			defup = 0;
			System.out.println("static {} ȣ�� ~~~");
			
		}
		// �ν��Ͻ� ������ == ��ü�� 1�� ȣ��Ǽ� ��ü�ʱ�ȭ
		//���Ͼ��� �޼ҵ� (������)
		public Marine() 
		{
			CUR_hp = 40;
			kills = 0;
			System.out.println("Marine ������ ȣ��");
		}
		
		
		
	
}
	public class OOP2 {
			public static void main(String[] args) {
				Marine2 m1 = new Marine();
				Marine2 m2 = new Marine();
				Marine2 m3 = new Marine();
			}
		
		
	}
