//=======================================================================================================
//static
//----> 정적 (전역)
//----> 공유 필드(변수)
//------> 하나의 클래스로 부터 만들어진 여러걔의 객체들이 공유하는 변수
//=======================================================================================================
//클래스를 만드는 순서
//1. 필드작성
//1-1. 적절한 타입과 이름으로 private으로 작성후 
//1-2. final 멤버 찾기 (상수) : setter,생성자모양의 영향을 주기 때문에
//1-3. static 멤버 찾기 (정적필드)인스턴스 필드가 공동으로 갖게되는 속성


//2.getter/setter


//3.생성자









package Git_assignment;



	class Marine{
		private static final int MAX_hp = 40;     //최대체력
		private int CUR_hp;     //현재체력
		private static final int att = 7; 		//공격력 
		private static final int def = 7; 		//방어력
		private static final int price = 50; 		//가격
		private static int attup; 		//공격력 업글단계
		private static int defup; 		//방어력 업글단계
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
		//정적 생성자 : static 멤버를 초기화
		static 
		{
			attup = 0;
			defup = 0;
			System.out.println("static {} 호출 ~~~");
			
		}
		// 인스턴스 생성자 == 객체당 1번 호출되서 객체초기화
		//리턴없는 메소드 (생성자)
		public Marine() 
		{
			CUR_hp = 40;
			kills = 0;
			System.out.println("Marine 생성자 호출");
		}
		
		
		
	
}
	public class OOP2 {
			public static void main(String[] args) {
				Marine m1 = new Marine();
				Marine m2 = new Marine();
				Marine m3 = new Marine();
			}
		
		
	}
