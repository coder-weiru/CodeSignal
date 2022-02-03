#
# You are implementing your own HTML editor. To make it more comfortable for developers you would like to add an auto-completion feature to it.
#
# Given the starting HTML tag, find the appropriate end tag which your editor should propose.
#
# If you are not familiar with HTML, consult with this note.
#
# Example
#
# For startTag = "<button type='button' disabled>", the output should be
# solution(startTag) = "</button>";
# For startTag = "<i>", the output should be
# solution(startTag) = "</i>".
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] string startTag
#
# Guaranteed constraints:
# 3 ≤ startTag.length ≤ 75.
#
# [output] string


def solution(startTag):
    a = startTag.find("<")
    b = startTag.find(" ")
    if b == -1:
        b = startTag.find(">")
    t = ""
    if a > -1 and b > -1:
        t = startTag[a + 1:b]
    return "</{}>".format(t)
