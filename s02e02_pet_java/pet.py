#!/usr/bin/env python3

class Pet:
    #construtor
    def __init__(self, name, energy, hungry, clean):
        self.name = name
        self.energy = energy
        self.hungry = hungry
        self.clean = clean
        self.energyMax = energy
        self.hungryMax = hungry
        self.cleanMax = clean

    def __str__(self):
        return "[" + self.name + "] E: " + str(self.energy) + "/" + str(self.energyMax) + " " + \
               "S: " + str(self.hungry) + "/" + str(self.hungryMax) + " " + \
               "L: " + str(self.clean) + "/" + str(self.cleanMax) + " "

pet = Pet("", 0, 0, 0)
print("end, init _nome _E _S _L, show")
while True:
    ui = input().split(" ")
    if ui[0] == "end":
        break
    elif ui[0] == "init":
        pet = Pet(ui[1], int(ui[2]), int(ui[3]), int(ui[4]))
    elif ui[0] == "show":
        print(pet)
    else:
        print("fail: comando invalido")


               