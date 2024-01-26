# Escribe un programa en python que permita eliminar un elemento de lista dada. 
# L = [9,8,7,6,5,4], queremos eliminar el número 7.




# Lista inicial
L = [9, 8, 7, 6, 5, 4]

# Número que queremos eliminar
numero_a_eliminar = 7

# Verificar si el número está en la lista antes de intentar eliminarlo
if numero_a_eliminar in L:
    L.remove(numero_a_eliminar)
    print(f"Elemento {numero_a_eliminar} eliminado.")
    print("Lista actualizada:", L)
else:
    print(f"El elemento {numero_a_eliminar} no está en la lista.")
    print("Lista original:", L)


# En este ejemplo, se verifica primero si el número a eliminar está presente en la lista antes de intentar eliminarlo.
# Si el número está en la lista, se utiliza el método remove() para eliminar la primera ocurrencia del número.
# La lista actualizada se imprime después de realizar la eliminación. Si el número no está presente en la lista, 
# se imprime un mensaje indicando que el elemento no está en la lista y se muestra la lista original.