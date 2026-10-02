// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
    int highest = 0;
    int winner = 0;
	for (int i = 1; i <= 5; i++) {
        int a, b, c, d; cin >> a >> b >> c >> d;
        int total = a + b + c + d;
        if (total > highest) {
            highest = total;
            winner = i;
        }
    }

    cout << winner << ' ' << highest << '\n';
}
