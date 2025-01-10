#!/usr/bin/python3

def tower_of_hanoi(n:int, fromPeg:str, toPeg:str, auxPeg:str):
    if n==1:
        print(f"Move disk from {fromPeg} to {toPeg}")
        return
    tower_of_hanoi(n-1, fromPeg, auxPeg, toPeg)
    print(f"Move disk from {fromPeg} to {toPeg}")
    tower_of_hanoi(n-1, auxPeg, toPeg, fromPeg)

print("Executing for 1 disk")
tower_of_hanoi(1,"A","B","C")
print("Executing for 2 disks")
tower_of_hanoi(2,"A","B","C")
print("Executing for 3 disks")
tower_of_hanoi(3,"A","B","C")