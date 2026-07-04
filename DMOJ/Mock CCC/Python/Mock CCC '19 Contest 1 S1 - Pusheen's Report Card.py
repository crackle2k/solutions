
N = int(input())

class_marks = [int(input()) for _ in range(N)]
total = 0
for mark in class_marks:
    total += mark
average = (total / N)
print(average)
