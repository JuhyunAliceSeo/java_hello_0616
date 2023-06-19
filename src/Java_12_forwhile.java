
public class Java_12_forwhile {

	public static void main(String[] args) {
			/////////////////////////////
		
			//for(;;) {
			//System.out.println("무한루프");
			//}

			for(int i=0; i < 5 ; i++) {
					System.out.println("무한루프"); //5번 출력됨.
			}

			///////////////////////////////////

			int sum;

			sum = 0;

			for(int i=0; i <= 20 ; i++) {
				sum = sum + i;
			}
			System.out.println(sum);

			////////////////////////

			sum = 0;
			int i;
			for(i = 1; i <= 100 ; i++);
			sum = sum + i;

			System.out.println(sum);

			//////////////////짝수의 합구하기
			sum = 0;
			i = 1;
			for( i = 1 ; i <= 100 ; i++) { if(i % 2 == 0) {
				sum = sum + i ; };
			}

			System.out.println(sum);
			
			///////////////////홀수의 합구하기
			sum = 0;
			i=1;
			for( i=1 ; i <= 100 ; i++) {if (i % 2 == 1) {
				sum = sum + i;};
			}
			System.out.println(sum);
			
			////////////////3단
			sum = 3;
			i=1;
			for( i=1 ; i < 10 ; i++) {
				sum = 3 * i;
				System.out.println("3 * " + i + " = " + sum);
				}
		///////////////////////////////
			sum = 7;
			i=1;
			for( i=1 ; i < 10 ; i++) {
				sum = 7 * i;
				System.out.println("7 * " + i + " = " + sum);
				}
		////////////
			sum = 9;
			i=1;
			for( i=1 ; i < 10 ; i++) {
				sum = 9 * i;
				System.out.println("9 * " + i + " = " + sum);
				}
			
		///////// 1부터 1000까지 수중에 11의 배수이자 7의 배수인 첫번쨰 숫자
			for(i = 1; i <= 1000; i++); {
				if((i % 7 == 0) && (i % 11 == 0))
				System.out.println(i);
				
		///////////////////////
			int n = 1;
			boolean search = false;
			
//			for(i = 1 ; i < 100 ; i++) {
//				if((( n % 5 ) == 0) && (( n % 7 ) == 0)) {
//					search = true;
//					break;
//				}
//			}
//			
			while(n < 100) {
				if((( n % 5 ) == 0) && (( n % 7 ) == 0)) {
					search = true;
					break;
				}
				n++;
			}
			if(search)
				System.out.println("찾는 정수 : " + n);
			else
				System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
			
				
			}
				
	}		
}