// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    long long N, D, K, X;
    cin >> N >> D >> K >> X;

    priority_queue<long long> speeds;

    for (int i = 0; i < N; i++) {
        long long speed;
        cin >> speed;
        speeds.push(speed);
    }

    long long P; cin >> P;

    while (K > 0) {
        long long highestSpeed = speeds.top();
        speeds.pop();
        long long reducedSpeed = highestSpeed * (100 - X) / 100;
        speeds.push(reducedSpeed);
        K--;
    }

    if (speeds.top() >= P) {
        cout << "NO\n";
    } else {
        cout << "YES\n";
    }
}
