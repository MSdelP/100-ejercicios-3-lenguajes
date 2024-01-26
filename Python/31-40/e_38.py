# Escribe en python una función llamada compruebaPresencia (x,L), que toma como parámetros una lista L y un elemento x. 
# La función devuelve True si el elemento x existe en la lista L y False y el elemento x no existe en la lista L.

def compruebaPresencia(x, L):
    return x in L

# Ejemplo de uso
elemento = 5
lista = [1, 3, 5, 7, 9]

resultado = compruebaPresencia(elemento, lista)

print(f"¿El elemento {elemento} está en la lista? {resultado}")


# La función compruebaPresencia en Python se define para verificar si un elemento x está presente en una lista L. 
# La función utiliza el operador in, que devuelve True si el elemento está en la lista y False si no lo está.
# Aquí hay una explicación más detallada:

# x: Este es el elemento que se va a verificar si está presente en la lista.
# L: Esta es la lista en la que se busca el elemento.
# La función utiliza la expresión x in L como su retorno. Si x está en L, la expresión devuelve True; de lo contrario, devuelve False.