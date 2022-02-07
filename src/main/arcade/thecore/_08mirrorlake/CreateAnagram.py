#
# You are given two strings s and t of the same length, consisting of uppercase English letters.
# Your task is to find the minimum number of "replacement operations" needed to get some anagram of the
# string t from the string s. A replacement operation is performed by picking exactly one character from
# the string s and replacing it by some other character.
#
# Example
#
# For s = "AABAA" and t = "BBAAA", the output should be
# solution(s, t) = 1;
# For s = "OVGHK" and t = "RPGUC", the output should be
# solution(s, t) = 4.
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] string s
#
# Guaranteed constraints:
# 5 ≤ s.length ≤ 35.
#
# [input] string t
#
# Guaranteed constraints:
# t.length = s.length.
#
# [output] integer
#
# The minimum number of replacement operations needed to get an anagram of the string t from the string s.


def solution(s, t):
    m = dict()
    for i, v in enumerate(s):
        if v in m.keys():
            m[v] += 1
        else:
            m[v] = 1
    n = dict()
    for i, v in enumerate(t):
        if v in n.keys():
            n[v] += 1
        else:
            n[v] = 1
    for k in m.keys():
        if k in n.keys():
            if m[k] == n[k]:
                m[k] = 0
                n[k] = 0
            else:
                mk = m[k]
                nk = n[k]
                m[k] = mk - nk if mk > nk else 0
                n[k] = nk - mk if nk > mk else 0
    print(m)
    c = 0
    for k in m.keys():
        if m[k] != 0:
            c += m[k]
    return c
