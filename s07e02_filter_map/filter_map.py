
class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def __str__(self):
        return self.nome + ":" + str(self.idade)

#ArrayList<Pessoa> turma = new ArrayList<Pessoa>();
turma = [Pessoa("Davi", 18), Pessoa("Ana", 3), \
         Pessoa("Julia", 6), Pessoa("Weydla", 18)] #pessoas

#criancas = []
#for pessoa in turma:
#    if pessoa.idade < 18:
#        criancas.append(pessoa)

criancas = filter(lambda x: x.idade >= 18, turma)

# criancas = [x for x in turma if x.idade < 18]

#criancas = turma.filter(x -> x.idade < 18)

print(" ".join(map(str, turma)))

# idades = []
# for pessoa in turma:
#    idades.append(pessoa.idade)

# idades = map(lambda x: x.idade, turma)
# idades = [x.idade for x in turma]

print(" ".join(map(lambda x: str(x.idade), turma)))

texto = "voce eh o amor da minha vida"
words = texto.split(" ")
words.append("meu")
words.append("bem")
texto = " ".join(words)
print(texto)