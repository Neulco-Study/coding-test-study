package Week07.스택_큐_PGS;

public class 올바른괄호_김준현_1115 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			String s = "()()";
			boolean check = sol.solution(s);

			System.out.println(check);
		}

		public boolean solution(String s) {
			boolean answer = true;

			if (s.charAt(0) == ')')
				return false;
			int cnt = 0;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					cnt++;
					continue;
				} else {
					cnt--;
				}

				if (cnt < 0)
					return false;
			}

			if (cnt != 0)
				return false;

			return answer;
		}
	}

}
