// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
    string coldestName;
    int coldestTemp = 201;
    string currentCity;
    int currentTemp;
	while (cin >> currentCity) {
        cin >> currentTemp;
        if (currentTemp < coldestTemp) {
            coldestTemp = currentTemp;
            coldestName = currentCity;
        }
    }

    cout << coldestName << "\n";
}
