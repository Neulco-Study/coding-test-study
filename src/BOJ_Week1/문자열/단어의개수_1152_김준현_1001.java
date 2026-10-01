package BOJ_Week1.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10월 1일 목요일
// 풀이시간 5분
// 공백을 잘 고려하자!
public class 단어의개수_1152_김준현_1001 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.println(st.countTokens());
	}
}
// public class 단어의개수_1152_김준현_1001 {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String[] str = br.readLine().trim().split(" ");
//
// 		System.out.println(str.length);
// 	}
// }
