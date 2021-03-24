package problems.general;

public class BitWiseOperatorsTest {

	public static void main(String[] args) {
		int a = 21;
		int b = -6;

		System.out.println(a << 1);
//		System.out.println(b >> 1);
//		
//		System.out.println(a << 1);
//		System.out.println(b << 1);

		decimalToBinary(a);
		System.out.println();
		decimalToBinary(Integer.highestOneBit(a));
		System.out.println();
		System.out.println(Integer.highestOneBit(a) << 1);
		decimalToBinary(a << 1);

		for (int i = 0; i < 20; i++) {
			int ls = Integer.highestOneBit(i) << 1; // next power of 2 from i
			int rs = i >> 1; // means i/2
			System.out.println("left shift of highestOneBit " + i + " :: " + ls);
			System.out.println("right shift " + i + ":: " + rs);
		}

	}

	public static void decimalToBinary(int num) {

		if (num > 1)
			decimalToBinary(num / 2);

		System.out.print(num % 2);
	}

}
