package jumpCase;

public class JumpCase {

	private int jumpCase(int num) {
		return hasJumpCase(num);
	}

	private int hasJumpCase(int n) {
		if (n <= 3)
			return n;

		return hasJumpCase(n-1) + hasJumpCase(n-2);
		
	}

	public static void main(String[] args) {
		JumpCase jumpCase = new JumpCase();
		int testCase = 4;
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(jumpCase.jumpCase(testCase));
		System.out.println(jumpCase.jumpCase(6 ));
	}

}
