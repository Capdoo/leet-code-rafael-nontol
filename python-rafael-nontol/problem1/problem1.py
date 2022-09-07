


class Solution(object):
    def twoSum(self, nums, target):
        long = len(nums)
        for i in range(long):
            a = nums[i]

            for j in range(long):
                b = nums[j]
                c = a + b
                if(c == target and i != j):
                    return [i,j]