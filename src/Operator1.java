
public class Operator1 {

	public static void main(String[] args) {
		// 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2 소수점이 떨어진다.
        System.out.println(2 / 4); // 0 소수점이 떨어진다.
        System.out.println(4 % 2); // 4를 2로 나눈 나머지 0
        System.out.println(5 % 2); // 5를 2로 나눈 나머지 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증강 연산 ++, --   ++val <-> val++ 구분이 필요하다.
        int val;
        val = 10;
        System.out.println(val); // 10;
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 문장이 수행된 후 그 변수에 +1이 된다.
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3

	}

}
