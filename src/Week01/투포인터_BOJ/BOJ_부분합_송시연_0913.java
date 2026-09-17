package Week01.투포인터_BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백준 1806 - 부분합
 * https://www.acmicpc.net/problem/1806
 *
 * 문제 요약
 * 길이가 N인 자연수 수열에서 연속된 수들의 부분합이 S 이상이 되는
 * 가장 짧은 구간의 길이를 구한다.
 *
 * 입력
 * 첫째 줄: N S
 * 둘째 줄: 수열을 이루는 N개의 자연수
 *
 * 출력
 * 조건을 만족하는 최소 길이를 출력한다.
 * 만족하는 구간이 없으면 0을 출력한다.
 */
public class BOJ_부분합_송시연_0913 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] numbers = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(numbers, target));
    }

    private static int solve(int[] numbers, int target) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int minLength = numbers.length + 1;

        while (true) {
            if (sum >= target) {
                minLength = Math.min(minLength, j - i);
                sum -= numbers[i++];
            } else if (j == numbers.length) {
                break;
            } else {
                sum += numbers[j++];
            }
        }

        return minLength == numbers.length + 1 ? 0 : minLength;
    }
}
