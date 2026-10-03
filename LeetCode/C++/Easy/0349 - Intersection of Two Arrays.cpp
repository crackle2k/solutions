class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> result;
        for (int i = 0; i < nums1.size(); i++) {
            bool found = find(nums2.begin(), nums2.end(), nums1[i]) != nums2.end();
            bool alreadyAdded = find(result.begin(), result.end(), nums1[i]) != result.end();
            
            if (found && !alreadyAdded) {
                result.push_back(nums1[i]);
            }
        }

        return result;
    }
};
