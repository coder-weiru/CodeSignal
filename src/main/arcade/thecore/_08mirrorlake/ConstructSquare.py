# Given a string consisting of lowercase English letters, find the largest square number which can be obtained
# by reordering the string's characters and replacing them with any digits you need (leading zeros are not allowed)
# where same characters always map to the same digits and different characters always map to different digits.
#
# If there is no solution, return -1.
#
# Example
#
# For s = "ab", the output should be
# solution(s) = 81.
# The largest 2-digit square number with different digits is 81.
# For s = "zzz", the output should be
# solution(s) = -1.
# There are no 3-digit square numbers with identical digits.
# For s = "aba", the output should be
# solution(s) = 900.
# It can be obtained after reordering the initial string into "baa" and replacing "a" with 0 and "b" with 9.
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] string s
#
# Guaranteed constraints:
# 1 ≤ s.length < 10.
#
# [output] integer
from typing import List


def solution(s):
    ls = parse(s)
    n = -1
    for i in range(1, 100000):
        sq = i ** 2
        if len(str(sq)) == len(s):
            ln = parse(str(sq))
            if ls == ln and sq > n:
                n = sq
        elif len(str(sq)) > len(s):
            return n
    return n


def parse(s):
    m = dict()
    for c in s:
        if c in m.keys():
            m[c] += 1
        else:
            m[c] = 1
    l: List[int] = list(m.values())
    l.sort()
    return l
