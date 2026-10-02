// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int problems; cin >> problems;
    int total = 0;
    for (int i = 0; i < problems; i++) {
        int a, b, c; cin >> a >> b >> c;
        if (a + b + c >= 2) {
            total++;
        }
    }

    cout << total << '\n';
}
