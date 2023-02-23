
public class EscapeSequence {

	public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n 줄바꿈을 할때 사용
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭
        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // \\ : 역슬래시를 사용하고 싶을때는 두번을 입력하면 \로 인식
        System.out.println("C:\\Program Files\\Java");

        // \" : 큰따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' : 작은따옴표
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요" );
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요" );

        // char = ' 작은따옴표의 문자를 넣고 싶을 때는 \를 넣어주어 '\''
        char c = 'A';
        c = '\'';
        System.out.println(c);
	}

}
