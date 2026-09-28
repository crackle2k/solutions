// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	string start, body;
    cin >> start >> body;

    if ((start != "437" && start != "416" && start != "647") || start.length() != 3 || body.length() != 7) {
        cout << "invalid" << "\n";
    } else if (start == "437" || start == "647") {
        cout << "valueless" << "\n";
    } else if (start == "416") {
        cout << "valuable" << "\n";
    }
}
