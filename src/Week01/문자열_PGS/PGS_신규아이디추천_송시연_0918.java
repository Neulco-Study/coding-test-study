package Week01.문자열_PGS;

public class PGS_신규아이디추천_송시연_0918 {

    public String solution(String new_id) {
        // 1단계: 대문자를 소문자로 변경
        new_id = new_id.toLowerCase();

        // 2단계: 허용된 문자 이외의 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9._-]", "");

        // 3단계: 연속된 마침표를 하나로 변경
        new_id = new_id.replaceAll("[.]{2,}", ".");

        // 4단계: 처음이나 마지막에 위치한 마침표 제거
        new_id = new_id.replaceAll("^[.]|[.]$", "");

        // 5단계: 빈 문자열이면 "a" 대입
        if (new_id.isEmpty()) {
            new_id = "a";
        }

        // 6단계: 길이가 16자 이상이면 앞의 15자만 남김
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("[.]$", "");
        }

        // 7단계: 길이가 3이 될 때까지 마지막 문자 반복
        while (new_id.length() < 3) {
            char lastChar = new_id.charAt(new_id.length() - 1);
            new_id += lastChar;
        }

        return new_id;
    }
}
