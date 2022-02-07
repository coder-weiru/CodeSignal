# Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.
#
# Example
#
# For
#
# matrix = [[1, 2, 1],
#           [2, 2, 2],
#           [2, 2, 2],
#           [1, 2, 3],
#           [2, 2, 1]]
# the output should be
# solution(matrix) = 6.
#
# Here are all 6 different 2 × 2 squares:
#
# 1 2
# 2 2
# 2 1
# 2 2
# 2 2
# 2 2
# 2 2
# 1 2
# 2 2
# 2 3
# 2 3
# 2 1
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] array.array.integer matrix
#
# Guaranteed constraints:
# 1 ≤ matrix.length ≤ 100,
# 1 ≤ matrix[i].length ≤ 100,
# 0 ≤ matrix[i][j] ≤ 9.
#
# [output] integer
#
# The number of different 2 × 2 squares in matrix.


def solution(matrix):
    sub = set([])
    for row in range(1, len(matrix)):
        for col in range(1, len(matrix[row])):
            sub.add(str(matrix[row - 1][col - 1]) + str(matrix[row - 1][col]) + str(matrix[row][col - 1]) + str(
                matrix[row][col]))
    return len(sub)
