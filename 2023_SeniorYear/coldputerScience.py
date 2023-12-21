amount = int(input())
tracker = 0

for i in range(amount):
  userInput = int(input())
  if userInput < 0:
    tracker += 1

print(tracker) 