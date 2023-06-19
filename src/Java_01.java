
public class Java_01 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);//&&=and
		System.out.println("result =" + result);
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2 + '\n');// \n : 줄바꿈
		
		result = ((num1 += 10) < 0) || ((num2 += 10) > 0);//결과값이 한개라도 true면 뒤에는 계산 하지 않음.
		System.out.println("result =" + result);
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
		
		System.out.print("*************");
		System.out.print("++++++++++++++++");//print=개행이 안됨. / println=개행

	}

}
