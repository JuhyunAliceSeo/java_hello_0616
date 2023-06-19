
public class Java_05_practice {
	//최댓값

	public static void main(String[] args) {
		int num1 = -6;
		int num2 = 20;
		int num3 = 10;
		
		int max = num1;
		
		if(max < num2) {
		   max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		
		System.out.println(max);

		
//		int num1, num2, num3;
//		num1 = 10;
//		num2 = 10;
//		num3 = 1;
//		int max;
//		
//		if((num1 >= num2) && (num1 >= num3)) {
//			max = num1;
//		} else if ((num2 >= num1) && (num2 >= num3)) {
//			max = num2;
//		} else if((num3 >= num1) && (num3 >= num2)) {
//			max = num3;
//		} else {
//			max = 0;
//		}
//		
//		System.out.println("최대값: " + max);


	}

}
