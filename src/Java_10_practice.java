
public class Java_10_practice {

	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		
		kor = 90;
		eng = 70;
		math = 45;
		
		int total = (kor + eng + math);
		double avg = total / 3.0;
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("=========================");
		System.out.println("총점 : " + total );
		System.out.println("평균 : " + avg );
		
		if(avg >= 90) {
			System.out.println("성적 : 수");
		}else if(avg >= 80) {
			System.out.println("성적 : 우");
		}else if(avg >= 80) {
			System.out.println("성적 : 미");
		}else if(avg >= 80) {
			System.out.println("성적 : 양");
		}else
			System.out.println("성적 : 가");
		
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		
		int max = num1;
		
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		System.out.println(max);
		
		int month = 3;
		switch(month) {
		case 12 : case 1 :  case 2 : case 3 : 
		System.out.println("겨울입니다");
		break;
		case 4 : case 5 : case 6 :
		System.out.println("봄입니다");
		break;
		case 7 : case 8 :
		System.out.println("여름입니다");
		break;
		case 9 : case 10 : case 11 :
		System.out.println("가을입니다");
		break;
		default :
		System.out.println("다시 입력하세요");
		}
		
		int num = 1;
		int sum = 0;
		
		while(num <= 100) {
			sum=sum+num;
			num++;
		}
		System.out.println(sum);
		
		int n=1;
		while(n<=5) {
			System.out.println("hello world");
			n++;
		}
		
		int month1=6;
		int day1 = 31;
		int day2 = 30;
		int day3 = 28;
		
		switch(month1){
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println(month1 + "월은" + day1 + "일입니다.");
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println(month1 + "월은" + day2 + "일입니다.");
			break;
		case 2 :
			System.out.println(month1 + "월은" + day3 + "일입니다.");
			}
		
		int nu1=-6;
		int nu2=10;
		int nu3=1;
		int max1;
		
		max1 = (nu1>nu2)? nu1 : nu2;
		max1 = (max1>nu3)? max1 : nu3;
		System.out.println(max1);
		

	}

}
