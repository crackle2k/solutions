
num1, num2, num3, num4 = int(input()), int(input()), int(input()), int(input())

if (num1 == num2 == num3 == num4):
    print("Fish At Constant Depth")
elif (num1 < num2 < num3 < num4):
    print("Fish Rising")
elif (num1 > num2 > num3 > num4):
    print("Fish Diving")
else:
    print("No Fish")
