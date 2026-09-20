package Week01.문자열_PGS;

public class PGS_신규아이디추천_김준현_0918 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			String s = "...!@BaT#*..y.abcdefghijklm";
			String result = sol.solution(s);
			System.out.println(result);
		}

		public String solution(String new_id) {
			String answer = "";

			// 1,2,3단계
			answer = new_id.toLowerCase();
			answer = answer.replaceAll("[^a-z0-9_.-]", "");
			answer = answer.replaceAll("\\.+", ".");

			// 4단계
			if (answer.startsWith(".")) {
				answer = answer.substring(1);
			}
			if (answer.endsWith(".")) {
				answer = answer.substring(0, answer.length() - 1);
			}
			// 5단계
			if (answer.isEmpty()) {
				answer = "a";
			}

			// 6단계
			if (answer.length() >= 16) {
				answer = answer.substring(0, 15);
				if (answer.endsWith(".")) {
					answer = answer.substring(0, answer.length() - 1);
				}
			}

			// 7단계
			if (answer.length() <= 2) {
				//String last = String.valueOf(answer.charAt(answer.length() - 1));
				while (true) {
					if (answer.length() == 3) {
						break;
					}
					answer += answer.charAt(answer.length() - 1);
				}
			}

			return answer;
		}
	}
}

