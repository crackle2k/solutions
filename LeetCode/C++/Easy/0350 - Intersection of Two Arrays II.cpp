class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        vector<int> result;
        for (int i = 0; i < nums1.size(); i++) {
            auto found = find(nums2.begin(), nums2.end(), nums1[i]);
            
            if (found != nums2.end()) {
                result.push_back(nums1[i]);
                nums2.erase(found);
            }
        }

        return result;
    }
};
