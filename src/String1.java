
public class String1 {

	public static void main(String[] args) {
		String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변환
        System.out.println(s.toLowerCase()); // 소문자로 변환

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true / 포함되지 않는다면 false
        System.out.println(s.contains("c#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // "Java"라는 글자의 위치 정보 7, 프로그래밍에서 문자열의 시작은 0부터 센다
        System.out.println(s.indexOf("c#")); // 포함되지 않는 것이기 때문에 -1로 나온다
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보 12
        System.out.println(s.lastIndexOf("and")); //  마지막에 일치하는 위치 정보 23
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true , 아니면 false
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true, 아니면 false
	}

}
