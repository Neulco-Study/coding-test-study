package BOJ_Week4.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// 해시
// 0925 금요일
// hashset 풀이
// 풀이시간 15분
/*
HashSet → "이 값이 존재하는가?"가 중요할 때 사용한다.
		   값의 중복 제거, 존재 여부 확인, 추가/삭제가 핵심인 문제.
HashMap → "이 Key에 대응하는 값이 무엇인가?"가 중요할 때 사용한다.
           Key → Value 관계, 개수 세기, 상태 저장이 핵심인 문제.

중복 제거 / 존재 여부만 필요하면 HashSet, 값마다 개수·상태 같은 추가 정보 저장 필요하면 HashMap.

예를 들어 이번 회사에 있는 사람 문제도:
현재 회사에 Baha가 있는가?만 관리한다면 → HashSet
Baha의 현재 상태가 enter인지 leave인지까지 저장한다면 → HashMap.
*/

public class 회사에있는사람_김준현_0925 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String status = st.nextToken();

			if(status.equals("enter")) {
				set.add(name);
			} else{
				set.remove(name);
			}
		}

		List<String> answer = new ArrayList<>(set);

		answer.sort(Collections.reverseOrder());

		for(String name:answer){
			System.out.println(name);
		}
	}
}

// // hashmap 풀이
// public class 회사에있는사람_김준현_0925 {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		int n = Integer.parseInt(br.readLine());
// 		StringTokenizer st;
// 		HashMap<String, String> map = new HashMap<>();
//
// 		for (int i = 0; i < n; i++) {
// 			st = new StringTokenizer(br.readLine());
// 			String name = st.nextToken();
// 			String status = st.nextToken();
// 			map.put(name, status);
// 		}
//
// 		List<String> answer = new ArrayList<>();
//
// 		for (Map.Entry<String, String> entry : map.entrySet()) {
// 			if (entry.getValue().equals("enter")) {
// 				answer.add(entry.getKey());
// 			}
// 		}
//
// 		answer.sort(Collections.reverseOrder());
//
// 		for(String name:answer){
// 			System.out.println(name);
// 		}
// 	}
// }
