# 📚 팀늘코 코딩테스트 스터디 — 주차별 문제 풀이

[스터디 개요](#-스터디-개요) · [운영 가이드](STUDY_GUIDE.md) · [제출 규칙](#-제출-규칙) · [주차별 과제](#-주차별-코딩테스트-과제) · [참고 자료](#-참고-자료)

## 📌 스터디 개요
기간: 주 5회(평일) + 주말

인원: 2명

플랫폼: 백준, 프로그래머스, LeetCode 등

---
## 🎯 스터디 방식
### 일일 문제 풀이

평일 매일 1문제씩 풀이

매주 일요일 23:59까지 다음 주 문제 5개 선정 및 공지

난이도: 실버3 ~ 골드4 수준

당일 23:59까지 풀이 완료 및 제출

---
## 📝 제출 규칙
### GitHub 제출 방식

```
Repository 구조:
├── Week01/
│   ├── BOJ_두수의합_홍길동_1201.java
│   ├── PGS_문자열압축_홍길동_1202.java
│   ├── LTC_TwoSum_홍길동_1203.java
│   ├── BOJ_미로탐색_홍길동_1204.java
│   ├── PGS_타겟넘버_홍길동_1205.java
│   ├── BOJ_최단경로_홍길동_1206.java
│   └── LTC_ValidParentheses_홍길동_1207.java
├── Week02/
│   └── ...
```
**폴더 및 파일명 규칙:**

- 폴더: Week01, Week02, ...
- 파일명: 출처_문제이름_이름_MMDD.확장자
  - 출처: BOJ(백준), PGS(프로그래머스), LTC(LeetCode) 등 (3자리 약어)
  - 문제이름: 공백 없이 설정 
  - 이름: 본인 이름 
  - MMDD: 문제 푼 날짜 (예: 1201 = 12월 1일)
  - Java 클래스명: 확장자를 제외한 파일명과 동일하게 설정

**출처 약어:**

- BOJ: 백준 (Baekjoon Online Judge)
- PGS: 프로그래머스 (Programmers)
- LTC: 리트코드 (LeetCode)
- CFS: 코드포스 (Codeforces)
- SEA: 삼성 SW Expert Academy
  
---
## ✅ 참여 규칙
### 💡 문제 선정 기준

**문제 유형**

자료구조: 스택, 큐, 해시, 힙

유형: 완전탐색, 백트래킹, 정렬, 이분탐색, DFS, BFS, DP, 그리디, 그래프, 트리, 투포인터, 누적합, 최단 경로(다익스트라, 벨만-포드, 플로이드-워셜), 수학(GCD, 소수 판별), 위상 정렬

기업 기출: 카카오, 삼성, 네이버 등

---
## 🗓️ 주차별 코딩테스트 과제

| 주차 | 학습 유형 | 문제 수 | 바로가기 |
| --- | --- | ---: | --- |
| 1주차 | 그래프 | 8 + 추가 6 | [문제 보기](#week-01) |
| 2주차 | 해시 | 6 | [문제 보기](#week-02) |
| 3주차 | DP | 8 | [문제 보기](#week-03) |
| 4주차 | 시뮬레이션 | 9 | [문제 보기](#week-04) |
| 5주차 | 이분 탐색 | 6 | [문제 보기](#week-05) |
| 6주차 | 그리디 | 7 | [문제 보기](#week-06) |
| 7주차 | 스택/큐 | 7 | [문제 보기](#week-07) |
| 8주차 | 투 포인터 | 7 | [문제 보기](#week-08) |
| 9주차 | 문자열 | 7 | [문제 보기](#week-09) |
| 10주차 | 종합 복습 | 6 | [문제 보기](#week-10) |
| 11주차 | 크루스칼 | 2 | [문제 보기](#week-11) |
| 12주차 | 종합 문제 | 3 | [문제 보기](#week-12) |

<a id="week-01"></a>
### 1주차 — 그래프

#### 기본 문제

1. [네트워크 (43162)](https://school.programmers.co.kr/learn/courses/30/lessons/43162)
2. [타겟 넘버 (43165)](https://school.programmers.co.kr/learn/courses/30/lessons/43165)
3. [게임 맵 최단거리 (1844)](https://school.programmers.co.kr/learn/courses/30/lessons/1844)
4. [가장 먼 노드 (49189)](https://school.programmers.co.kr/learn/courses/30/lessons/49189)
5. [배달 (12978)](https://school.programmers.co.kr/learn/courses/30/lessons/12978)
6. [순위 (49191)](https://school.programmers.co.kr/learn/courses/30/lessons/49191)
7. [섬 연결하기 (42861)](https://school.programmers.co.kr/learn/courses/30/lessons/42861)
8. [합승 택시 요금 (72413)](https://school.programmers.co.kr/learn/courses/30/lessons/72413)

#### 추가 문제

1. [방문 길이 (49994)](https://school.programmers.co.kr/learn/courses/30/lessons/49994)
2. [도넛과 막대 그래프 (258711)](https://school.programmers.co.kr/learn/courses/30/lessons/258711)
3. [게임 맵 최단거리 (1844)](https://school.programmers.co.kr/learn/courses/30/lessons/1844)
4. [방의 개수 (49190)](https://school.programmers.co.kr/learn/courses/30/lessons/49190)
5. [가장 먼 노드 (49189)](https://school.programmers.co.kr/learn/courses/30/lessons/49189)
6. [보석 쇼핑 (67258)](https://school.programmers.co.kr/learn/courses/30/lessons/67258)

<a id="week-02"></a>
### 2주차 — 해시

1. [오픈채팅방 (42888)](https://school.programmers.co.kr/learn/courses/30/lessons/42888)
2. [주차 요금 계산 (92341)](https://school.programmers.co.kr/learn/courses/30/lessons/92341)
3. [롤케이크 자르기 (132265)](https://school.programmers.co.kr/learn/courses/30/lessons/132265)
4. [신고 결과 받기 (92334)](https://school.programmers.co.kr/learn/courses/30/lessons/92334)
5. [보석 쇼핑 (67258)](https://school.programmers.co.kr/learn/courses/30/lessons/67258)
6. [순위 검색 (72412)](https://school.programmers.co.kr/learn/courses/30/lessons/72412)

<a id="week-03"></a>
### 3주차 — DP

1. [땅따먹기 (12913)](https://school.programmers.co.kr/learn/courses/30/lessons/12913)
2. [정수 삼각형 (43105)](https://school.programmers.co.kr/learn/courses/30/lessons/43105)
3. [N으로 표현 (42895)](https://school.programmers.co.kr/learn/courses/30/lessons/42895)
4. [스티커 모으기(2) (12971)](https://school.programmers.co.kr/learn/courses/30/lessons/12971)
5. [거스름돈 (12907)](https://school.programmers.co.kr/learn/courses/30/lessons/12907)
6. [사칙연산 (1843)](https://school.programmers.co.kr/learn/courses/30/lessons/1843)
7. [도둑질 (42897)](https://school.programmers.co.kr/learn/courses/30/lessons/42897)
8. [올바른 괄호의 갯수 (12929)](https://school.programmers.co.kr/learn/courses/30/lessons/12929)

<a id="week-04"></a>
### 4주차 — 시뮬레이션

1. [키패드 누르기 (67256)](https://school.programmers.co.kr/learn/courses/30/lessons/67256)
2. [[1차] 다트 게임 (17682)](https://school.programmers.co.kr/learn/courses/30/lessons/17682)
3. [공원 산책 (172928)](https://school.programmers.co.kr/learn/courses/30/lessons/172928)
4. [롤케이크 자르기 (132265)](https://school.programmers.co.kr/learn/courses/30/lessons/132265)
5. [행렬 테두리 회전하기 (77485)](https://school.programmers.co.kr/learn/courses/30/lessons/77485)
6. [주차 요금 계산 (92341)](https://school.programmers.co.kr/learn/courses/30/lessons/92341)
7. [기둥과 보 설치 (60061)](https://school.programmers.co.kr/learn/courses/30/lessons/60061)
8. [자물쇠와 열쇠 (60059)](https://school.programmers.co.kr/learn/courses/30/lessons/60059)
9. [[1차] 셔틀버스 (17678)](https://school.programmers.co.kr/learn/courses/30/lessons/17678)

<a id="week-05"></a>
### 5주차 — 이분 탐색

1. [입국심사 (43238)](https://school.programmers.co.kr/learn/courses/30/lessons/43238)
2. [순위 검색 (72412)](https://school.programmers.co.kr/learn/courses/30/lessons/72412)
3. [징검다리 (43236)](https://school.programmers.co.kr/learn/courses/30/lessons/43236)
4. [가사 검색 (60060)](https://school.programmers.co.kr/learn/courses/30/lessons/60060)
5. [징검다리 건너기 (64062)](https://school.programmers.co.kr/learn/courses/30/lessons/64062)
6. [금과 은 운반하기 (86053)](https://school.programmers.co.kr/learn/courses/30/lessons/86053)

<a id="week-06"></a>
### 6주차 — 그리디

1. [예산 (12982)](https://school.programmers.co.kr/learn/courses/30/lessons/12982)
2. [점프와 순간 이동 (12980)](https://school.programmers.co.kr/learn/courses/30/lessons/12980)
3. [무지의 먹방 라이브 (42891)](https://school.programmers.co.kr/learn/courses/30/lessons/42891)
4. [귤 고르기 (138476)](https://school.programmers.co.kr/learn/courses/30/lessons/138476)
5. [요격 시스템 (181188)](https://school.programmers.co.kr/learn/courses/30/lessons/181188)
6. [광물 캐기 (172927)](https://school.programmers.co.kr/learn/courses/30/lessons/172927)
7. [기둥과 보 설치 (60061)](https://school.programmers.co.kr/learn/courses/30/lessons/60061)

<a id="week-07"></a>
### 7주차 — 스택/큐

1. [같은 숫자는 싫어 (12906)](https://school.programmers.co.kr/learn/courses/30/lessons/12906)
2. [올바른 괄호 (12909)](https://school.programmers.co.kr/learn/courses/30/lessons/12909)
3. [기능개발 (42586)](https://school.programmers.co.kr/learn/courses/30/lessons/42586)
4. [프로세스 (42587)](https://school.programmers.co.kr/learn/courses/30/lessons/42587)
5. [다리를 지나는 트럭 (42583)](https://school.programmers.co.kr/learn/courses/30/lessons/42583)
6. [주식가격 (42584)](https://school.programmers.co.kr/learn/courses/30/lessons/42584)
7. [뒤에 있는 큰 수 찾기 (154539)](https://school.programmers.co.kr/learn/courses/30/lessons/154539)

<a id="week-08"></a>
### 8주차 — 투 포인터

1. [연속된 수의 합 (120923)](https://school.programmers.co.kr/learn/courses/30/lessons/120923)
2. [구명보트 (42885)](https://school.programmers.co.kr/learn/courses/30/lessons/42885)
3. [연속된 부분 수열의 합 (178870)](https://school.programmers.co.kr/learn/courses/30/lessons/178870)
4. [두 큐 합 같게 만들기 (118667)](https://school.programmers.co.kr/learn/courses/30/lessons/118667)
5. [보석 쇼핑 (67258)](https://school.programmers.co.kr/learn/courses/30/lessons/67258)
6. [광고 삽입 (72414)](https://school.programmers.co.kr/learn/courses/30/lessons/72414)
7. [쿠키 구입 (49995)](https://school.programmers.co.kr/learn/courses/30/lessons/49995)

<a id="week-09"></a>
### 9주차 — 문자열

1. [숫자 문자열과 영단어 (81301)](https://school.programmers.co.kr/learn/courses/30/lessons/81301)
2. [신규 아이디 추천 (72410)](https://school.programmers.co.kr/learn/courses/30/lessons/72410)
3. [이진 변환 반복하기 (70129)](https://school.programmers.co.kr/learn/courses/30/lessons/70129)
4. [[3차] 파일명 정렬 (17686)](https://school.programmers.co.kr/learn/courses/30/lessons/17686)
5. [문자열 압축 (60057)](https://school.programmers.co.kr/learn/courses/30/lessons/60057)
6. [튜플 (64065)](https://school.programmers.co.kr/learn/courses/30/lessons/64065)
7. [가사 검색 (60060)](https://school.programmers.co.kr/learn/courses/30/lessons/60060)

<a id="week-10"></a>
### 10주차 — 종합 복습

1. [개인정보 수집 유효기간 (150370)](https://school.programmers.co.kr/learn/courses/30/lessons/150370)
2. [주차 요금 계산 (92341)](https://school.programmers.co.kr/learn/courses/30/lessons/92341)
3. [오픈채팅방 (42888)](https://school.programmers.co.kr/learn/courses/30/lessons/42888)
4. [테이블 해시 함수 (147354)](https://school.programmers.co.kr/learn/courses/30/lessons/147354)
5. [연속된 부분 수열의 합 (178870)](https://school.programmers.co.kr/learn/courses/30/lessons/178870)
6. [보석 쇼핑 (67258)](https://school.programmers.co.kr/learn/courses/30/lessons/67258)

<a id="week-11"></a>
### 11주차 — 크루스칼

- 기초: [섬 연결하기 (42861)](https://school.programmers.co.kr/learn/courses/30/lessons/42861)
- 응용: [지형 이동 (62050)](https://school.programmers.co.kr/learn/courses/30/lessons/62050)

<a id="week-12"></a>
### 12주차 — 종합 문제

1. [주차 요금 계산 (92341)](https://school.programmers.co.kr/learn/courses/30/lessons/92341)
2. [신고 결과 받기 (92334)](https://school.programmers.co.kr/learn/courses/30/lessons/92334)
3. [연속된 부분 수열의 합 (178870)](https://school.programmers.co.kr/learn/courses/30/lessons/178870)

---
## 📚 참고 자료
### 문제 참고

- 팀늘코 과제: [주차별 프로그래머스 과제](#-주차별-코딩테스트-과제)
- 프로그래머스: [코딩테스트 연습](https://school.programmers.co.kr/learn/challenges?order=recent)
- Neetcode: [NeetCode 150](https://neetcode.io/practice/practice/neetcode150)
- Leetcode: [LeetCode 문제모음](https://leetcode.com/problemset/)
