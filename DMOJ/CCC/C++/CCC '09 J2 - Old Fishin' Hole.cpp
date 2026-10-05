// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int troutPoints, pikePoints, pickeralPoints, total; cin >> troutPoints >> pikePoints >> pickeralPoints >> total;
    int possible = 0;
    for (int i = 0; i <= total; i++) {
        for (int j = 0; j <= total; j++) {
            for (int k = 0; k <= total; k++) {
                if ((i * troutPoints + j * pikePoints + k * pickeralPoints) <= total && (i * troutPoints + j * pikePoints + k * pickeralPoints) > 0) {
                    possible += 1;
                    cout << i << " Brown Trout, " << j << " Northern Pike, " << k << " Yellow Pickerel\n";
                }
            }
        }
    }

    cout << "Number of ways to catch fish: " << possible << '\n';
}
