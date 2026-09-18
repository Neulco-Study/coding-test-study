package Week01.문자열_PGS;

public class PGS_이진변환반복하기_송시연_0918 {

    public int[] solution(String s) {
        int totalZero = 0;
        int changeCount = 0;

        while (true) {
            if (s.equals("1")) {
                return new int[]{changeCount, totalZero};
            }

            int initLength = s.length();

            s = s.replaceAll("0", "");

            int length = s.length();

            totalZero += initLength - length;

            s = Integer.toBinaryString(length);

            changeCount += 1;
        }
    }
}
