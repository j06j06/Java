
public class Exam_02 {
	public static void main(String[]ar){
		//형변환의 조건
		//1. 공통점이 있어야한다. (예) 숫자
		//2. 크기 비교가 가능해야 한다. (예) 범위
		//정수형 <-> 정수형
		//실수형 <-> 실수형
		//정수형 <-> 실수형
		
		//자동형 변환 : 물컵 -> 물통, 에러 없이 형태가 변환된다...
		byte a=10;
		short b=a;
		
		//강제 형변환 : 물통 -> 물컴, 그냥은 안들어간다... 강제로 변환
		a=(byte)b; //short ->byte
		//b를 byte로 변환하여 a에 집어넣는다.
	}
}
