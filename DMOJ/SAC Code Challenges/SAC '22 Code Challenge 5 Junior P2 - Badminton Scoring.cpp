// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N;
    int total = 0;
    for (int i = 0; i < N; i++) {
        int a, b; cin >> a >> b;
        if (a > b) {
            total++;
        }
    }

    cout << total << '\n';
}
