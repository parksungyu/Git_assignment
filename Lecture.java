package Git_assignment;
//3)  ���� ( ��Ȳ )
//�Ӽ� : ��������,  ����, ������
//�ൿ : ����, ����, ��

public class Lecture {

	private String name;
	private String professor;
	private String[] student;
	private int stu_sco[];
	private int score;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getProfessor() {
		return professor;
	}


	public void setProfessor(String professor) {
		this.professor = professor;
	}


	public String[] getStudent() {
		return student;
	}


	public void setStudent(String[] student) {
		this.student = student;
	}


	public int[] getStu_sco() {
		return stu_sco;
	}


	public void setStu_sco(int[] stu_sco) {
		this.stu_sco = stu_sco;
	}


	public void main(String[] args) {	
		int n = 1;
		for(n=1;n<=15;n++){
				System.out.println(n + "ȸ �� ������ �����մϴ�. �⼮�� �θ��ڽ��ϴ�.");
				for(int a = 0; a<=30; a++)
				System.out.println(getStudent());
		}
		if(n == 15) {
			System.out.println("��� ������ ����Ǿ����ϴ�. ������ ����մϴ�.");
				System.out.println(getStudent());
				char grade;
				String stdentscore ="";
				switch (getStu_sco()/10) {
					case 1:
					case 2:
					case 3:
					case 4:
						grade = 'c';
						System.out.println(grade);
					case 5:
					case 6:
					case 7:
						grade = 'b';
						System.out.println(grade);
					case 8:
					case 9:
					case 10:
						grade = 'a';
						System.out.println(grade);
				}
				
		}
	}

}
