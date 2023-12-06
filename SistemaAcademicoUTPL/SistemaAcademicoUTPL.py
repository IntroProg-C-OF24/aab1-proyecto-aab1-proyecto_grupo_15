import random

totalApro = 0
totalRep = 0
condicion = 's'

while condicion == 's':
    nombre = input("Ingresar el nombre del estudiante: ")
    ced = int(input("Ingresar numero de cedula del estudiante: "))
    nota_acd = random.randint(1, 10)
    nota_ape = random.randint(1, 10)
    nota_aa = random.randint(1, 10)
    total = (nota_acd + nota_ape + nota_aa) / 3
    print("--------//REPORTE//--------")
    print("--NOTA DEL BIMESTRE--")
    print("Nota ACD: ", nota_acd)
    print("Nota APE: ", nota_ape)
    print("Nota AA: ", nota_aa)
    print("Nota Total: ", total)
    if total >= 7:
        print("Nombre del estudiante: ", nombre, " cedula: ", ced, "Aprovado")
        totalApro += 1
    else:
        print("Nombre del estudiante: ", nombre, " cedula: ", ced, "Reprovado")
        totalRep += 1
    print("______________________________________")
    condicion = input("Desea ingresar mas estudiantes?").lower()

porcentajeApro = (totalApro * 100) / (totalApro + totalRep)
porcentajeRep = (totalRep * 100) / (totalApro + totalRep)
print("______________________________________________")
print("El porcentaje de estudiantes aprovados es: ", porcentajeApro,"%")
print("El porcentaje de estudiantes reprovados es: ", porcentajeRep,"%")