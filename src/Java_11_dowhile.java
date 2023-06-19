
public class Java_11_dowhile {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum = sum + num;
			num++;
		} while(num <= 10);
		
		System.out.println(sum);
		
		
		/////////////////////////////
		
//		for(;;) {
//			System.out.println("무한루프");
//		}
		
		for(int i=0; i < 5 ; i++) {
			System.out.println("무한루프"); //5번 출력됨.
		}
		
		///////////////////////////////////
		
		sum = 0;
		
		for(int i=0; i <= 20 ; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
