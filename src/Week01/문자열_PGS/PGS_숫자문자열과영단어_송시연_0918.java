package Week01.문자열_PGS;

import java.util.HashMap;
import java.util.Map;

public class PGS_숫자문자열과영단어_송시연_0918 {

    public int solution(String s) {
        String[] english = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < english.length; i++) {
            map.put(english[i], i);
        }

        StringBuilder answer = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.append(c);
            } else {
                word.append(c);

                String currentWord = word.toString();

                if (map.containsKey(currentWord)) {
                    answer.append(map.get(currentWord));
                    word.setLength(0);
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }
}
