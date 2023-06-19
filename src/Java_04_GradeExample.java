
public class Java_04_GradeExample {

	public static void main(String[] args) {
		
		int kor=90;
		int eng=70;
		int math=45;
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("==========================");
		System.out.println("총점 : " + (kor + eng + math));
		System.out.println("평균 : " + (kor + eng + math)/3);
		
		if(((kor + eng + math) /3)>=90)
			System.out.println("성적 : 수");
		else if(((kor + eng + math) /3)>=80)
			System.out.println("성적 :우");
		else if(((kor + eng + math) /3)>=70)
			System.out.println("성적 :미");
		else if(((kor + eng + math) /3)>=60)
			System.out.println("성적 : 양");
		else
			System.out.println("성적 :가");
		
		///////////////from teacher
		
		int kor1, eng1, math1; //int 선언 
		int total;
		double avg;
		char grade = '가';
		
		kor1 = 90;
		eng1 = 80;
		math1 = 20;
		
		total = kor1 + eng1 + math1;
		avg = total / 3.0; // total/3은 안됨  -> total도 int, 3도 int라서 avg는 double이 안나옴 / (double)total/ 3 이나 total / 3.0
		
		if(avg >= 90) {
			grade = '수';
		}else if(avg >=80) {
			grade = '우';
		}else if(avg >=70) {
			grade = '미';
		}else if(avg >=60) {
			grade = '양';
		}else{
			grade = '가';
		}
		
		System.out.println('\n' + "국어 : " + kor1);
		System.out.println("영어 : " + eng1);
		System.out.println("수학 : " + math1);
		System.out.println("=======================");
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.println("성적: " + grade);
		
		

	}

}
