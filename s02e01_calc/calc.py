#!/usr/bin/env python3

class Calc:
    def __init__(self, batMax):
        self.battery = 0
        self.batteryMax = batMax
    
    def charge(self, value):
        self.battery += value
        if(self.battery > self.batteryMax):
            self.battery = self.batteryMax

    def __str__(self):
        return "battery = " + str(self.battery) + "/" + str(self.batteryMax)

calc = Calc(0)
print("show, init _maxCarga, charge _value, sum _a _b, ")
while True:
    ui = input().split(" ")
    if ui[0] == "end":
        break
    elif ui[0] == "init":
        calc = Calc(int(ui[1]))
    elif ui[0] == "show":
        print(calc)
    elif ui[0] == "charge":
        calc.charge(int(ui[1]))
    else:
        print("comando invalido")