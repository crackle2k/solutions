// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N;
    int x = 0, y = 0;

    for (int i = 0; i < N; i++) {
        string dir; cin >> dir;
        int val; cin >> val;

        if (dir == "North") { y += val; }
        else if (dir == "South") { y -= val;}
        else if (dir == "East") { x += val; }
        else { x -= val; }
        
    }

    cout << x << ' ' << y << '\n';
}
