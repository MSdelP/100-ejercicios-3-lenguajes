# Escribe las instrucciones en python que permitan ordenar una cadena de caracteres en orden alfabético ascendente. 
# Para probar, vamos a tomar la cadena c = "finlandia".

# Cadena de caracteres
c = "finlandia"

# Ordenar la cadena en orden alfabético ascendente
c_ordenada = ''.join(sorted(c))

# Mostrar la cadena ordenada
print("Cadena ordenada:", c_ordenada)


# En este código, utilizamos la función sorted() para obtener una lista de caracteres ordenados,
# luego usamos join() para convertir esa lista de caracteres nuevamente en una cadena. La salida esperada sería "aadfiilnn".

