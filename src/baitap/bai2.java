package baitap;

public class bai2 {
	public static void main(String[] args) {
		long a = 15;
		long b = 10;
		long c = a + b;
		
		long d = Math.max(a,b);
		
		long e = Math.min(a, b);
		
		double f = Math.pow(a,b);
		
		char ab = 'C';
		
		float ac = 4.5675432456f;
		
		int ad = 1000;
		
		int cong = 1 + 1;
		
		int tru = 2 - 1;
		
		int nhan = 2 * 1;
		
		int chia = 2 / 1;
		
		
		if(a>b) {
			System.out.println("lớn hơn");
		}else {
			System.out.println("bé hơn");
		}
		if(a==b) {
			System.out.println("bằng nhau");
		}else {
			System.out.println("không bằng");
		}
		if(a>=b) {
			System.out.println("lớn hơn hoặc bằng");
		}
		
		if(a<=b) {
			System.out.println("bé hơn hoặc bằng");
		}
		
		if(a<50 && b<50) {
			System.out.println("tất cả bé hơn 50");
		}
		if(a<50 || b>50) {
			System.out.println("tất cả bé hơn 50");
		}
		int j = 2;
		switch(j) {
		case 1:
			System.out.println("đây là số 1");
			break;
		case 2:
			System.out.println("đây là số 2");
			break;
		case 3:
			System.out.println("đây là số 3");
			break;
		case 4:
			System.out.println("đây là số 4");
			break;
		case 5:
			System.out.println("đây là số 5");
			break;
		case 6:
			System.out.println("đây là số 6");
			break;
		default:
			System.out.println("Không biết");
		
		}
		
//		System.out.println("lon hon" + (a>b));
//		System.out.println("bang" + (a==b));
//		System.out.println("lon hon bang" + (a>=b));
//		System.out.println("be hon bang" + (a<=b));
//		
//		
//		
//		System.out.println("cong " + cong );
//		System.out.println("tru " + tru);
//		System.out.println("nhan " + nhan);
//		System.out.println("chia " + chia);
	}

}
