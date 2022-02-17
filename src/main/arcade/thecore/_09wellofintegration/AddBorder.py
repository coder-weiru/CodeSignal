
# Given a rectangular matrix of characters, add a border of asterisks(*) to it.
#
# Example
#
# For
#
# picture = ["abc",
#            "ded"]
# the output should be
#
# solution(picture) = ["*****",
#                       "*abc*",
#                       "*ded*",
#                       "*****"]
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] array.string picture
#
# A non-empty array of non-empty equal-length strings.
#
# Guaranteed constraints:
# 1 ≤ picture.length ≤ 100,
# 1 ≤ picture[i].length ≤ 100.
#
# [output] array.string
#
# The same matrix of characters, framed with a border of asterisks of width 1.


def solution(picture):
    c = len(picture[0]) + 2
    lst = [a(c)]
    for s in picture:
        lst.append(b(s))
    lst.append(a(c))
    return lst


def a(length):
    s = ""
    for i in range(0, length):
        s += "*"
    return s


def b(s):
    return "*" + s + "*"
