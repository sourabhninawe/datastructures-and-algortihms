#!/usr/bin/python3

class BinaryNString:
    def __init__(self, n):
        self.A = [0] * n

    def generate(self, n):
        if n <= 0:
            print(self.A)
            return
        self.A[n-1] = 0
        self.generate(n-1)
        self.A[n-1] = 1
        self.generate(n-1)

if __name__ == "__main__":
    print("All cases for n=1")
    b1 = BinaryNString(1)
    b1.generate(1)
    
    print("All cases for n=2")
    b2 = BinaryNString(2)
    b2.generate(2)
    
    print("All cases for n=3")
    b3 = BinaryNString(3)
    b3.generate(3)