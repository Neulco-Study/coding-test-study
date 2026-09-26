package BOJ_Week4.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 0926 토요일
// 풀이시간
// hashmap
public class 나는야포켓몬마스터_김준현_0926 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<Integer, String> numberMap = new HashMap<>();
		HashMap<String, Integer> nameMap = new HashMap<>();

		for (int i = 1; i <= N; i++) {
			String name = br.readLine();
			numberMap.put(i , name);
			nameMap.put(name, i);
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= M; i++) {
			String question = br.readLine();

			// 숫자가 들어온 경우
			if(Character.isDigit(question.charAt(0))) {
				int num = Integer.parseInt(question); // String -> int 변환
				sb.append(numberMap.get(num)).append("\n");
			}
			// 포켓몬 이름이 들어온 경우
			else {
				sb.append(nameMap.get(question)).append("\n");
			}
		}

		System.out.println(sb);
	}
}

// 입력값
/*
26 5
Bulbasaur
Ivysaur
Venusaur
Charmander
Charmeleon
Charizard
Squirtle
Wartortle
Blastoise
Caterpie
Metapod
Butterfree
Weedle
Kakuna
Beedrill
Pidgey
Pidgeotto
Pidgeot
Rattata
Raticate
Spearow
Fearow
Ekans
Arbok
Pikachu
Raichu
25
Raichu
3
Pidgey
Kakuna
 */

//출력값
/*
Pikachu
26
Venusaur
16
14
 */