
public class Java_07_switch {

	public static void main(String[] args) {
		int n = 3;
		
		switch(n) { //기본적으로 정수가 와야함
		case 1:
			System.out.println("simple Java");
			break;
		case 2:
			System.out.println("Funny");
			break;
		case 3:
			System.out.println("Fantastic");
			break;
		default: //break가 없으면 디폴트값도 나옴. //1,2,3,케이스가 없으면 default 값
			System.out.println("The best programming is Java");
		}
		
		System.out.println("Do you like Java?");
		System.out.println("----------");
		
		int month = 3;
		
		switch(month) {
		case 12:case 1:case 2:case 3:
			System.out.println("겨울입니다");
			break;
		case 4: case 5:	case 6:
			System.out.println("봄입니다");
			break;
		case 7:	case 8:
			System.out.println("여름입니다");
			break;
		case 9:	case 10: case 11:
			System.out.println("가을입니다");
			break;
		default:
			System.out.println("잘못 입력입니다");
		}
		System.out.println("프로그램 종료");

	}

}
