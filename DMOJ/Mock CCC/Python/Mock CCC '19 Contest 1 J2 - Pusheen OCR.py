
ocr_name = input()
name = "pusheen"
errors = 0

for i in range(7):
    if ocr_name[i] != name[i]:
        errors += 1

print(errors)
