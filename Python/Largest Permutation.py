#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the largestPermutation function below.
def largestPermutation(k, l):
    d ={}
    upper = len(l)
    for j in range(len(l)):
        d[l[j]] = j
    i = 0
    counter = 0
    while counter < k:
        if l[d[upper]] != l[i]:
            l[d[upper]] = l[i]
            d[l[i]] = d[upper]
            l[i] = upper
            counter += 1
        i += 1
        if i == len(l):
            break
        upper -= 1
    return l 
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    l = list(map(int, input().rstrip().split()))

    result = largestPermutation(k, l)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
