// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	vector<string> directions;
    string currentDir;

    while (cin >> currentDir) {
        string streetName; cin >> streetName;
        directions.push_back(streetName);
        directions.push_back(currentDir);
    }

    for (int i = (int)directions.size() - 1; i >= 3; i -= 2) {
        if (directions[i] == "R") {
            cout << "Turn LEFT onto " << directions[i - 3] << " street." << "\n";
        } else {
            cout << "Turn RIGHT onto " << directions[i - 3] << " street. " << "\n";
        }
    }

    if (directions[1] == "R") {
            cout << "Turn LEFT into your HOME." << "\n";
    } else {
            cout << "Turn RIGHT into your HOME." << "\n";
    }
}
