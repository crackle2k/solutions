// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int h, M, t = 1, a = 0; cin >> h >> M;
    while (true) {
        a = (-6 * t * t * t * t) + (h * t * t * t) + (2 * t * t) + t;
        if (a <= 0) { 
            cout << "The balloon first touches ground at hour:\n" << t << '\n';
            break;
        }

        if (t == M) {
            cout << "The balloon does not touch ground in the given time.\n";
            break;
        }

        t++;
    }
}
