class Solution(object):
    def productExceptSelf(self, nums):
        z=0
        ix=-1
        p=1
        for i in range(len(nums)):
            if nums[i]==0:
                z+=1
                ix=i
            else: p*=nums[i]
        res=[0]*len(nums)
        if z==0:
            for i in range(len(nums)):
                res[i]=p//nums[i]
        if z==1:
            res[ix]=p
        return res




                

            
