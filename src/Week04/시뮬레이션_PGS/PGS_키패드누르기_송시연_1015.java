package Week04.시뮬레이션_PGS;

import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/67256
public class PGS_키패드누르기_송시연_1015 {
    static Set<Integer> right = Set.of(3, 6, 9);
    static Set<Integer> left = Set.of(1, 4, 7);

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int tmpRight = 12; // #
        int tmpLeft = 10;  // *

        for (int i = 0; i < numbers.length; i++) {
            int tmpNumber = numbers[i];

            if (right.contains(tmpNumber)) {
                answer.append("R");
                tmpRight = tmpNumber;
            }
            else if (left.contains(tmpNumber)) {
                answer.append("L");
                tmpLeft = tmpNumber;
            }
            else {
                int[] posRight = getPos(tmpRight);
                int[] posLeft = getPos(tmpLeft);
                int[] target = getPos(tmpNumber);

                int rightDist = Math.abs(posRight[0] - target[0]) + Math.abs(posRight[1] - target[1]);
                int leftDist = Math.abs(posLeft[0] - target[0]) + Math.abs(posLeft[1] - target[1]);

                if (leftDist < rightDist) {
                    answer.append("L");
                    tmpLeft = tmpNumber;
                } else if (rightDist < leftDist) {
                    answer.append("R");
                    tmpRight = tmpNumber;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        tmpLeft = tmpNumber;
                    } else {
                        answer.append("R");
                        tmpRight = tmpNumber;
                    }
                }
            }
        }

        return answer.toString();
    }

    int[] getPos(int num) {
        if (num == 0) return new int[]{3, 1};
        if (num == 10) return new int[]{3, 0}; // *
        if (num == 12) return new int[]{3, 2}; // #
        return new int[]{(num - 1) / 3, (num - 1) % 3};
    }
}
