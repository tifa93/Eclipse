package study;

public class Ch05Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int dan = 2 ; dan <= 9 ; dan++) {
			System.out.println(dan + "단");
			for (int i = 1 ; i <= 9 ; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
			}
		}
	}

}
