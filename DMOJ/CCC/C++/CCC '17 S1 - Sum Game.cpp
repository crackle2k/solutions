// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N;
    
    vector<int> swiftScores(N);
    vector<int> sepScores(N);

    for (int i = 0; i < N; i++) {
        cin >> swiftScores[i];
    }

    for (int i = 0; i < N; i++) {
        cin >> sepScores[i];
    }

    int swiftScore = 0;
    int sepScore = 0;
    int answer = 0;

    for (int i = 0; i < N; i++) {
        swiftScore += swiftScores[i];
        sepScore += sepScores[i];

        if (swiftScore == sepScore) {
            answer = i + 1;
        }
    }

    cout << answer << '\n';
}
