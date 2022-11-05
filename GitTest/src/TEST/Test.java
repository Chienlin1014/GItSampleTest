package TEST;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test
		Math math =new Math();
		int sum=math.add(5, 6);
		System.out.println(sum);
	}

}
class Math{
	int add(int x, int y) {
		return x+y;
	}
}