# Escribe en python un programa que permita calcular el tiempo de ejecución de un script. Tomamos como ejemplo el programa del ejercicio 24.


import time

# Inicio del tiempo de ejecución
inicio_tiempo = time.time()

# Script original
numero = 7
print(f"Tabla de multiplicar del {numero}:")
for i in range(1, 11):
    resultado = numero * i
    print(f"{numero} x {i} = {resultado}")

# Fin del tiempo de ejecución
fin_tiempo = time.time()

# Calcular la duración
duracion = fin_tiempo - inicio_tiempo
print(f"\nEl script tomó {duracion:.6f} segundos en ejecutarse.")



# En este ejemplo, se utiliza time.time() para obtener el tiempo actual antes y después de ejecutar el script.
# La diferencia entre estos tiempos te dará la duración de la ejecución del script. 
# La duración se imprime al final del script.
# Ten en cuenta que la precisión de la medición de tiempo puede depender del sistema operativo y otros factores.
