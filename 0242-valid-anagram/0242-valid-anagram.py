class Solution(object):
    def isAnagram(self, s, t):
        l1=list(s)
        l2=list(t)
        l1.sort()
        l2.sort()
        if l1==l2:
            return True
        return False
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        