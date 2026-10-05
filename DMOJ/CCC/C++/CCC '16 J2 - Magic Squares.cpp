// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	vector<vector<int>> grid(4, vector<int>(4, 0));
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            cin >> grid[i][j];
        }
    }

    bool magic = true;
    int destined = grid[0][0] + grid[0][1] + grid[0][2] + grid[0][3];

    for (int i = 0; i < 4; i++) {
        if (grid[i][0] + grid[i][1] + grid[i][2] + grid[i][3] != destined) {
            magic = false;
        }
    }

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (grid[0][j] + grid[1][j] + grid[2][j] + grid[3][j] != destined) {
                magic = false;
            }
        }
        
    }

    if (magic) { cout << "magic\n"; }
    else { cout << "not magic\n"; }
}
