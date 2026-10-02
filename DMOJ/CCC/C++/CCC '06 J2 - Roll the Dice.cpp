// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int m, n; cin >> m >> n;
    int possible = 0;
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (i + j == 10) { possible++; }
        }
    }
    
    if (possible == 1) {
        cout << "There is " << possible << " way to get the sum 10." << '\n';
    } else {
        cout << "There are " << possible << " ways to get the sum 10." << '\n';
    }
}
