from itertools import permutations

def get_strikes_and_balls(guess, num):
    strikes = 0
    balls = 0
    for i in range(3):
        if guess[i] == num[i]:
            strikes += 1
        elif guess[i] in num:
            balls += 1
    return strikes, balls

N = int(input())
ask_nums = [input().split() for _ in range(N)]

possible_nums = list(permutations(range(1, 10), 3))

count = 0

for num in possible_nums:
    valid = True
    for ask_num in ask_nums:
        guess = list(map(int, ask_num[0]))
        expected_strike = int(ask_num[1])
        expected_ball = int(ask_num[2])
        
        strikes, balls = get_strikes_and_balls(guess, num)
        
        if strikes != expected_strike or balls != expected_ball:
            valid = False
            break 
    if valid:
        count += 1

print(count)
