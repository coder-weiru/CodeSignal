# Consider two following representations of a non-negative integer:
#
# A simple decimal integer, constructed of a non-empty sequence of digits from 0 to 9;
# An integer with at least one digit in a base from 2 to 16 (inclusive), enclosed between # characters, and preceded
# by the base, which can only be a number between 2 and 16 in the first representation. For digits from 10 to 15
# characters a, b, ..., f and A, B, ..., F are used.
# Additionally, both representations may contain underscore (_) characters; they are used only as separators for
# improving legibility of numbers and can be ignored while processing a number.
#
# Your task is to determine whether the given string is a valid integer representation.
#
# Note: this is how integer numbers are represented in the programming language Ada.
#
# Example
#
# For line = "123_456_789", the output should be
# solution(line) = true;
# For line = "16#123abc#", the output should be
# solution(line) = true;
# For line = "10#123abc#", the output should be
# solution(line) = false;
# For line = "10#10#123ABC#", the output should be
# solution(line) = false;
# For line = "10#0#", the output should be
# solution(line) = true;
# For line = "10##", the output should be
# solution(line) = false.
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] string line
#
# A non-empty string.
#
# Guaranteed constraints:
# 2 ≤ line.length ≤ 30.
#
# [output] boolean
#
# true if line is a valid integer representation, false otherwise.


def solution(line):
    value_str = line.replace("_", "")
    if "#" in value_str:
        return parse_base(value_str) is not None
    else:
        return parse_other(value_str) is not None


def parse_other(line):
    try:
        return int(line)
    except:
        return None


def parse_base(line):
    if line.count("#") != 2:
        return None
    else:
        base = line[:line.index("#")]
        base_val = valid_base(base)
        value_str = line[line.index("#") + 1:len(line) - 1]
        value = 0
        try:
            return int(value_str, base_val)
        except:
            return None


def valid_base(base):
    try:
        val = int(base)
        if val < 2 or val > 16:
            return None
        else:
            return val
    except:
        return None


