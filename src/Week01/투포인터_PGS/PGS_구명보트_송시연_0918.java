package Week01.투포인터_PGS;

import java.util.*;

public class PGS_구명보트_송시연_0918 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int answer = 0;

        while (left <= right) {
            if(people[left] + people[right] <= limit) {
                left += 1;
            }

            right -= 1;
            answer += 1;
        }

        return answer;
    }
}
