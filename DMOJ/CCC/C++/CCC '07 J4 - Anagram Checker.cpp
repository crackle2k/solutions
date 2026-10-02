// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	string first; string second;
    getline(cin, first);
    getline(cin, second);
    unordered_map<char, int> firstCounter;
    unordered_map<char, int> secondCounter;

    for (char letter : first) {
        if (isspace(letter)) { continue; }
        firstCounter[letter]++;
    }

    for (char letter : second) {
        if (isspace(letter)) { continue; }
        secondCounter[letter]++;
    }

    if (firstCounter == secondCounter) {
        cout << "Is an anagram.";
    } else {
        cout << "Is not an anagram.";
    }
}
