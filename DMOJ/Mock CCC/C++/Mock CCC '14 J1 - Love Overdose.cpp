// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int A, B, R; cin >> A >> B >> R;
    if (A > R) {
        cout << "Bob overdoses on day 1." << "\n";
    } else if (B > R || (A / 2.0 + B) > R) {
        cout << "Bob overdoses on day 2." << "\n";
    } else {
        cout << "Bob never overdoses." << "\n";
    }
}
