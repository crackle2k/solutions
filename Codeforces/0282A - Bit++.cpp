// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int inputs; cin >> inputs;
    int value = 0;
    for (int i = 0; i < inputs; i++) {
        string line; cin >> line;
        if (line == "X++" || line == "++X") { value++; }
        else if (line == "X--" || line == "--X") { value--; }
    }
    cout << value << '\n';
}
