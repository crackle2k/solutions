class Solution {
public:
    vector<string> commonChars(vector<string>& words) {

        vector<string> result;
        for (char character : words[0]) {
            result.push_back({character});
        }

        for (string word : words) {
            for (int i = 0; i < result.size(); i++) {

                size_t pos = word.find(result[i]);
                if (pos == string::npos) {
                    result.erase(result.begin() + i);
                    i--;
                } else {
                    word.erase(pos, 1);
                }
            }
        }

        return result;
    }
};
