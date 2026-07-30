class Solution(object):
    def groupAnagrams(self, strs):
        d={}
        for s in strs:
            k="".join(sorted(s))
            if k not in d:
                d[k]=[]
            d[k].append(s)
        return d.values()