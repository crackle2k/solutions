// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N;
    int oddCount = 0;

    for (int i = 0; i < N; i++) {
        int num;
        cin >> num;

        if (num % 2 != 0) {
            oddCount++;
        }
    }
    
    if (N % 2 == 0 && oddCount > N / 2) {
        cout << "Todd\n";
    } else {
        cout << "Steven\n";
    }

}
