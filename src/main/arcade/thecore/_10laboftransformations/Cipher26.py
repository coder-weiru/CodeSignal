# You've intercepted an encrypted message, and you are really curious about its contents. You were able to find out
# that the message initially contained only lowercase English letters, and was encrypted with the following cipher:
#
# Let all letters from 'a' to 'z' correspond to the numbers from 0 to 25, respectively.
# The number corresponding to the ith letter of the encrypted message is then equal to the sum of numbers corresponding
# to the first i letters of the initial unencrypted message modulo 26.
# Now that you know how the message was encrypted, implement the algorithm to decipher it.
#
# Example
#
# For message = "taiaiaertkixquxjnfxxdh", the output should be
# solution(message) = "thisisencryptedmessage".
#
# The initial message "thisisencryptedmessage" was encrypted as follows:
#
# letter 0: t -> 19 -> t;
# letter 1: th -> (19 + 7) % 26 -> 0 -> a;
# letter 2: thi -> (19 + 7 + 8) % 26 -> 8 -> i;
# etc.
# Input/Output
#
# [execution time limit] 4 seconds (py3)
#
# [input] string message
#
# An encrypted string containing only lowercase English letters.
#
# Guaranteed constraints:
# 1 ≤ message.length ≤ 200.
#
# [output] string
#
# A decrypted message.


def solution(message):
    s = ""
    for i in range(len(message) - 1, 0, -1):
        s = findCharAt(message, i) + s
    s = message[0] + s
    return s


def findCharAt(message, index):
    a = message[index]
    b = message[index - 1]
    idxA = indexOf(a)
    idxB = indexOf(b)
    x = 0
    if idxA > idxB:
        x = idxA - idxB
    elif idxA < idxB:
        x = 26 - (idxB - idxA)
    else:
        x = 0
    return charAt(x)


def charAt(index):
    alpha = "abcdefghijklmnopqrstuvwxyz"
    return alpha[index]


def indexOf(c):
    alpha = "abcdefghijklmnopqrstuvwxyz"
    return alpha.find(c)
