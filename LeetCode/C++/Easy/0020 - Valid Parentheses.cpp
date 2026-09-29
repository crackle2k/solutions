class Solution {
public:
    bool isValid(string s) {

        stack<char> st;
        
        for (char c : s) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')') {
                if (st.empty()) {
                    return false;
                }
                if (st.top() == '(') { st.pop(); } else { return false; }
            } else if (c == '}') {
                if (st.empty()) {
                    return false;
                }
                if (st.top() == '{') { st.pop(); } else { return false; }
            } else if (c == ']') {
                if (st.empty()) {
                    return false;
                }
                if (st.top() == '[') { st.pop(); } else { return false; }
            }
        }

        if (st.empty()) { return true; } else { return false; }

    }
};
