#
# Proper nouns always begin with a capital letter, followed by small letters.
#
# Correct a given proper noun so that it fits this statement.
#
# Example
#
# For noun = "pARiS", the output should be
# solution(noun) = "Paris";
# For noun = "John", the output should be
# solution(noun) = "John".
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] string noun
#
# A string representing a proper noun with a mix of capital and small English letters.
#
# Guaranteed constraints:
# 1 ≤ noun.length ≤ 10.
#
# [output] string
#
# Corrected (if needed) noun.


def solution(noun):
    s = ""
    for ele in range(0, len(noun)):
        if ele == 0:
            s += noun[ele].upper()
        else:
            s += noun[ele].lower()
    return s

