package GitBranchApp1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //�ժ�
		System.out.println("1st Version");
		//�ժ�(�s�W��)
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(10, 20));
		System.out.println("nnnnnnn");
	}

}

class Math{
	int add(int a ,int b) {
		return a+b;
	}
}