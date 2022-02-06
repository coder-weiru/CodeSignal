#
# Given two strings a and b, both consisting only of lowercase English letters, your task is to calculate
# how many strings equal to a can be constructed using only letters from the string b? Each letter can be
# used only once and in one string only.
#
# Example
#
# For a = "abc" and b = "abccba", the output should be solution(a, b) = 2.
#
# We can construct 2 strings a = "abc" using only letters from the string b.
#
# For a = "ab" and b = "abcbcb", the output should be solution(a, b) = 1.
#
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] string a
#
# String to construct, containing only lowercase English letters.
#
# Guaranteed constraints:
# 1 ≤ a.length ≤ 105.
#
# [input] string b
#
# String containing needed letters, containing only lowercase English letters.
#
# Guaranteed constraints:
# 1 ≤ b.length ≤ 105.
#
# [output] integer
#
# The number of strings a that can be constructed from the string b.


def solution(a, b):
    m = dict()
    for i, v in enumerate(b):
        if v not in m.keys():
            m[v] = 1
        else:
            m[v] = m[v] + 1

    c = 0
    n = 1
    while n == 1:
        n = remove(a, m)
        if n == 1:
            c += 1

    return c


def remove(a, m):
    for i, v in enumerate(a):
        if v in m.keys() and m[v] > 0:
            m[v] -= 1
        else:
            return 0
    return 1
