package Week01.그리디_PGS;

public class PGS_큰수만들기_송시연_0918 {
    public String solution(String number, int k) {
        StringBuilder result = new StringBuilder();

        for (char current : number.toCharArray()) {
            while (k > 0 && result.length() > 0 && result.charAt(result.length() - 1) < current) {
                result.deleteCharAt(result.length() - 1);
                k--;
            }

            result.append(current);
        }

        if(k > 0) {
            result.setLength(result.length() - k);
        }

        return result.toString();
    }
}
