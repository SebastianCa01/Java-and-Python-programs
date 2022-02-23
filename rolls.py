from random import randint

def dice_rolls():
    while True:
        yield (randint(1,6), randint(1,6), randint(1,6))

def play():
    for r in enumerate(dice_rolls(),1):
        print('{}: {},{},{}'.format(r[0], r[1][0], r[1][1], r[1][2]))
        if r[1][0] == r[1][1] == r[1][2]:
            print('Wow! Triples!')
        input()

def main():
    input('Press ENTER to roll the dice. ')
    play()

main()