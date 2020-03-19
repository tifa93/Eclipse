package study;

public class Ch06Ex06 {
	static int abs(int x) {
		int y;
		if(x < 0) {
			y = -x;
		} else {
			y = x;
		}
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		int a = -5;
		result = abs(a);

		System.out.println(a + "의 절대값은" + result + "이다.");

		int b = 10;
		result = abs(b);
		System.out.println(b + "의 절대값은" + result + "이다.");
		
	}

}
