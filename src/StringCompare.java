
public class StringCompare {

	public static void main(String[] args) {
		// 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("pyton")); // 대소문자의 구분으로 다르다 false
        System.out.println(s2.equalsIgnoreCase("Python")); // 대소문자의 구분 없이 문자열 내용이 같은지 여부 체크

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용이 같은지 비교)
        System.out.println(s1 == s2); // true (참조갸 같은지 비교)

        s1 = new String("1234"); // 각각의 서로 다른 메모지에 비밀번호를 적은뒤 손님에게 나누어주는 것 (참조)
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
        // Java에서 내용을 비교하고 싶을 때는 equals을 사용한다

	}

}
