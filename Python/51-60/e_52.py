# Escribe una función en Python concatListas(L1,L2,L3) que tome tres listas L1, L2 y L3 como parámetros,
# y devuelva una concatenación de estas tres listas.


def concatListas(L1, L2, L3):
    return L1 + L2 + L3

# Ejemplo de uso:
L1 = [1, 2, 3]
L2 = [4, 5, 6]
L3 = [7, 8, 9]

resultado = concatListas(L1, L2, L3)
print(resultado)  # Devuelve [1, 2, 3, 4, 5, 6, 7, 8, 9]


# Esta función simplemente utiliza el operador + para concatenar las tres listas y devuelve la lista resultante.