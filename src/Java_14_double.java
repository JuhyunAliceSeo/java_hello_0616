
public class Java_14_double {

	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++){
			for (int j = 1; j< 10; j++)
				System.out.println(i + " X " + j + " = " + (i * j));
		}
		
	//구구단 출력
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				System.out.print(" ");
			}
			System.out.println();
		}
	//짝수단만 출력하시오.

		for(int i=1; i<=9; i++) {
			if((i % 2) == 0)
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				System.out.print(" ");
			}
			System.out.println();
		}
	//홀수단
		for(int i=1; i<=9; i+=2) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
	//결과값이 홀수인것만 출력
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(( i * j ) %2 == 1)
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	//or
		for(int i=1; i<=9; i++) {
			
			for(int j=1; j<=9; j++) {
				
				int result = i * j;
				if( result %2 == 1)
					System.out.println(i + "*" + j + "=" + result);
			}
			System.out.println();
		}
		
		int i=3;
		for(int j=1; j<=9; j++) {
			System.out.println(i + "*" + j + "=" + i*j);
			System.out.print(" ");
		}
		System.out.println();
		
	

	}

}
