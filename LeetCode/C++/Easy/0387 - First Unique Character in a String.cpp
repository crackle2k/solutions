class Solution {
public:
    int firstUniqChar(string s) {
        unordered_map<char, int> dictionary;
        for (char letter : s) {
            dictionary[letter]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (dictionary[s[i]] == 1) {
                return i;
            }
        }

        return -1;
    }
};
