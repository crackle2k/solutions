// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	vector<int> nums(4);
    for (int i = 0; i < 4; i++) { cin >> nums[i]; }
    sort(nums.begin(), nums.end());
	cout << nums[0] * nums[2] << '\n';
}
