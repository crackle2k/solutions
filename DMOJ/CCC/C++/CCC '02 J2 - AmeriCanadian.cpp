// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	
    string input;
    while (cin >> input) {
        if (input == "quit!") {
            break;
        }

        if (input.length() > 4) {
            char before = input[input.length() - 3];
            if (input[input.length() - 2] == 'o' && input[input.length() - 1] == 'r' && before != 'a' && before != 'e' && before != 'i' && before != 'u' && before != 'o' && before != 'y') {
                input.insert(input.length() - 1, "u");
            }
        }
        
        cout << input << "\n";
    }
}
