
public class Gugu_07 {

	public static void main(String[] args) {
		
		int intNum = 0;
		
		intNum += 1; //1
		System.out.println(intNum); // 1
		
		System.out.println(intNum); // 1
		intNum += 1; // 13번째 줄 표시에 영향을 미친다.
		
		System.out.println(intNum); // 2
		
		intNum = 0;
		// ++가 변수 뒤에 있으며 명령문 내에 포함이 되는 경우
		// 명령문이 모두 실행 된 후 변수 값을 1 증가 시킨다
		// 따라서 현재 실행되는 명령문에는 영향을 끼치지 않는다.
		System.out.println(intNum++); // 0
		
		// 20번 명령문이 끝나면서 intNum을 1증가 시켜서 1이 출력된다.
		System.out.println(intNum); // 1
		
		// ++ 가 단독으로 실행될때는 어느곳에 위치해도 효과가 똑같다.
		intNum++;
		++intNum;
		
		// ++가 변수 앞에 위치할때는 명령문이 실행되기전에 변수 값을 1 증가시킨다.
		// 따라서 현재 실행되는 명령문에 영향을 끼친다.
		System.out.println(++intNum); 
		
		
	}

}
