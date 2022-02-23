# Define an alphabet reflection as follows: a turns into z, b turns into y, c turns into x, ..., n turns into m, m
# turns into n, ..., z turns into a.
#
# Define a string reflection as the result of applying the alphabet reflection to each of its characters.
#
# Reflect the given string.
#
# Example
#
# For inputString = "name", the output should be
# solution(inputString) = "mznv".
#
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] string inputString
#
# A string of lowercase characters.
#
# Guaranteed constraints:
# 3 ≤ inputString.length ≤ 1000.
#
# [output] string


def solution(inputString):
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    s = ""
    for c in inputString:
        i = alphabet.find(c, 0, 26)
        s += alphabet[25-i]
    return s
