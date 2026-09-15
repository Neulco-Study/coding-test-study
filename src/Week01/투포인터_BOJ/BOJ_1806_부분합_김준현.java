package Week01.투포인터_BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 9월 14일 월요일 풀이시간 30분
// 투포인터
public class BOJ_1806_부분합_김준현 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());

		int[] arr = new int[N + 1];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int answer = Integer.MAX_VALUE; // 답을 하나도 발견하지 않았다는 의미로 큰 값을 넣어놈
		int left = 0;
		int sum = 0;

		for (int right = 0; right < N; right++) {
			sum += arr[right];

			while (sum >= S) {
				answer = Math.min(answer, right - left + 1);
				sum -= arr[left];
				left++;
			}
		}
		System.out.println(answer == Integer.MAX_VALUE ? 0 : answer);
	}
}

// for는 오른쪽 범위를 늘린다
// while은 조건을 만족하는 동안 왼쪽 범위를 줄인다.

/* 흐름
// 오른쪽 확장
// → 조건 확인
// → 가능하면 왼쪽 축소
// → 다시 오른쪽 확장
// → 가능하면 왼쪽 축소
// ...
 */