# Given a character, check if it represents an odd digit, an even digit or not a digit at all.
#
# Example
#
# For symbol = '5', the output should be
# solution(symbol) = "odd";
# For symbol = '8', the output should be
# solution(symbol) = "even";
# For symbol = 'q', the output should be
# solution(symbol) = "not a digit".
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] char symbol
#
# A symbol to check.
#
# Guaranteed constraints:
# symbol is guaranteed to be a UTF-8 symbol.
#
# [output] string


def solution(symbol):
    if symbol.isnumeric():
        n = int(symbol)
        if n % 2 == 0:
            return "even"
        else:
            return "odd"
    else:
        return "not a digit"
