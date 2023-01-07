package GitBranchApp1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //組長
		System.out.println("1st Version");
		//組長(新增的)
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