#!/usr/bin/env python3

class Calc:
    #construtor
    def __init__(self, batMax):
        self.battery = 0
        self.batteryMax = batMax
    
    def gastarBateria(self):
        if(self.battery == 0):
            print("fail: bateria insuficiente")
            return False
        
        self.battery -= 1
        return True

    def soma(self, a, b):
        if(self.gastarBateria()):
            print(a + b)
    

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

    def getEnergia(self):
        return self.energia
    def setEnergia(self, value):
        if(value < 0):
            self.energia = 0
        elif(value > self.energiaMax):
            self.energia = self.energiaMax
        else:
            self.enegia = value

    def comer(self):
        self.setEnergia(self.getEnergia() - 1)