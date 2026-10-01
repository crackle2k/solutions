class Solution {
public:
    bool isPowerOfTwo(int n) {
        if (n < 1) { return false; }
        while (n >= 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n == 1) {
                return true;
            } else { return false; }
        }

        return false;
    }
};
