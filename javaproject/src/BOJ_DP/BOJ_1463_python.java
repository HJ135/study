number = int(input())
arr = [0] * (number+1)

for i in range(1, number+1) :
    if i == 1 : continue
    elif i % 6 == 0 : x = min(arr[i//3], arr[i//2], arr[i-1])
    elif i % 3 == 0 : x = min(arr[i//3], arr[i-1])
    elif i % 2 == 0 : x = min(arr[i//2], arr[i-1])
    else : x = arr[i-1]
    arr[i] = x+1

print(arr[number])
