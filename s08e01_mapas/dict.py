

mapa = {}

mapa["davi"] = 18
mapa["eva"] = 15
mapa["luana"] = 25
mapa["jessica"] = "paris"

print(mapa["luana"])
print(mapa["jessica"])

del mapa["davi"]
del mapa["eva"]

print("luana" in mapa)

for chave in mapa:
    print("K: " + chave + " V: " + str(mapa[chave]))

