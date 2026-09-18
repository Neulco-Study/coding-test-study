#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

void dfs(int node, vector<vector<int>>& computers, vector<bool>& visited) {
    visited[node] = true;
    
    for(int i=0; i<computers.size(); i++) {
        if(computers[node][i] == 1 && visited[i] == false) {
            dfs(i, computers, visited);
        }
    }
}

int solution(int n, vector<vector<int>> computers) {
    int answer = 0;
    vector<bool> visited(n, false);
    
    for(int i=0; i<n; i++) {
        if(visited[i] == false) {
            answer += 1;
            dfs(i, computers, visited);
        }
    }
    return answer;
}