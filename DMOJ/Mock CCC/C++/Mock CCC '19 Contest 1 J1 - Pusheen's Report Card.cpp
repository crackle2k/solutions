// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int A, B;
    cin >> A >> B;

    if (A > B) {
        cout << "CS452\n";
    } else if (B > A) {
        cout << "PHIL145\n";
    } else { return 0; }
}
