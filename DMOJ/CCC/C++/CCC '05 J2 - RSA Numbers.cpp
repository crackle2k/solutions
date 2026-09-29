// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int start, end; cin >> start >> end;
    vector<int> rsaNumbers;

    for (int i = start; i <= end; i++) {
        int divisors = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                divisors++;
            } 
        }

        if (divisors == 4) {
            rsaNumbers.push_back(i);
        }
    }

    cout << "The number of RSA numbers between " << start << " and " << end << " is " << rsaNumbers.size() << "\n";
}
