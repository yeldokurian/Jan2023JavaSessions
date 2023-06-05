package JavaBasics;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
//		int i = 10;
//		int j = i + 1;
//		
//		System.out.println(i);//10
//		System.out.println(j);//11
//		int k = 2;
//		int l = ++k;
//		
//		System.out.println(k);//3
//		System.out.println(l);//3
//		
//		int amount = 1;
//		int finalAmount = amount+1;
//		
//		System.out.println(amount);//1
//		System.out.println(finalAmount);//2
//		
//		int x = 1;
//		int y = x++;
//		System.out.println(x);//2
//		System.out.println(y);//1
////		pre-decrement
//		
//		int w = -99;
//		int z = w--;
//		
//		System.out.println(w);//-100
//		System.out.println(z);//-99
//		
//		int aa = 2;
//		int bb = --aa;
//		
//		System.out.println(aa);//1
//		System.out.println(bb);//1
//
//		int s1 = -1000;
//		int s2 = --s1;
//		System.out.println(s1);//-1001
//		System.out.println(s2);//-1001
//		
//		int s3 = 40;
//		System.out.println(s3--);//40
//		System.out.println(s3);//39
//		
//		int p3 = 50;
//		System.out.println(--p3);//49
//		System.out.println(p3);//49
//		System.out.println(p3+1);//50
//		
//		
//		int na = 1;
//		int test = na++ + na++ + na++ + na++;
//		System.out.println(test);//1+2+3+4
//		
//		int c = 11;
//		System.out.println(c++ + c++);//11+12 = 23
//		System.out.println("c");//13
		
		
//		int a = 11, b = 22, c;
//
//		c = a + b + a++ + b++ + ++a + ++b;
//
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);
//		System.out.println("c="+c);//11+22+11+22+13+24
		
//		int f = 0;
//		f = f++ - --f + ++f - f--;
//		System.out.println(f);//
	
//		int q = 1, r = 2, s = 3;
//		int t = q-- - r-- - s--;
//		System.out.println("q=" +q);
//		System.out.println("r="+r);
//		System.out.println("s="+s);
//		System.out.println("t="+t);//1-2-3
		
//		int d = 1, e = 2;
//		System.out.println(--e - ++d + ++e - --d);//
		
//		System.out.println(10 % 3);//1
		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println(ch + ": is a vowel");
			//break;
		case 'e':
			System.out.println(ch + ": is a vowel");
			//break;
		case 'i':
			System.out.println(ch + ": is a vowel");
			//break;
		case 'o':
			System.out.println(ch + ": is a vowel");
			break;
		case 'u':
			System.out.println(ch + ": is a vowel");
			//break;
			default:
				System.out.println(ch + ": is consonant");
				break;
				
		}
		
	}
		
}