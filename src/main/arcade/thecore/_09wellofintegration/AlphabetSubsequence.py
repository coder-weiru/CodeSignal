
# Check whether the given string is a subsequence of the plaintext alphabet.
#
# Example
#
# For s = "effg", the output should be
# solution(s) = false;
# For s = "cdce", the output should be
# solution(s) = false;
# For s = "ace", the output should be
# solution(s) = true;
# For s = "bxz", the output should be
# solution(s) = true.
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] string s
#
# Guaranteed constraints:
# 2 ≤ s.length ≤ 15.
#
# [output] boolean
#
# true if the given string is a subsequence of the alphabet, false otherwise.


def solution(s):
    a = "abcdefghijklmnopqrstuvwxyz"
    b = ""
    for c in a:
        if c in s and c not in b:
            b += c
    return s == b
