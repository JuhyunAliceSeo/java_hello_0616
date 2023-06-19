
public class Java_02_sce {

	public static void main(String[] args) {
		short num1 = 5;
		System.out.println(+num1);
		System.out.println(-num1);
		
		short num2 = 7;
		short num3 = (short)(+num2); //행변환하지 않으면 오류 발생
		short num4 = (short)(-num2); //행변환하지 않으면 오류 발생
		System.out.println(num3);
		System.out.println(num4);
		
		int num = 7;
		System.out.println(++num); //num의 값 하나 증가 후 출력
		System.out.println(++num);
		System.out.println(num++);
		System.out.println(num);
		
		System.out.print((num--)+ " "); //num의 값 하나 감소 후 출력
		System.out.print((num--)+ " ");
		System.out.print(num);
		
		

	}

}
