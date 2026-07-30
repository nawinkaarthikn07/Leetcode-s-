class Solution(object):
    def topKFrequent(self, nums, k):
        l1=[]
        l=[]
        nums1=list(set(nums))
        for j in nums1:
            n=nums.count(j)
            l.append(n)
        for i in range(k):
             l1.append(nums1[l.index(max(l))])
             nums1.remove(nums1[l.index(max(l))])
             l.remove(max(l))
        return l1
        