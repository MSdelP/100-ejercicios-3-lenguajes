# Escribe en python una función f(y,x,j) tomando como parámetros 3 enteros y,x,j y devuelve el resultado de la siguiente función:
# f(y,x,j) =  y*(j**3) + 2*y*(j**2) + x


def f(y, x, j):
    resultado = y * (j ** 3) + 2 * y * (j ** 2) + x
    return resultado

# Ejemplo de uso
y = 3
x = 5
j = 2
resultado_funcion = f(y, x, j)

print(f"El resultado de la función para y={y}, x={x}, j={j} es: {resultado_funcion}")


# En este ejemplo, la función f(y, x, j) toma tres parámetros y, x y j, y calcula el resultado utilizando la expresión y * (j ** 3) + 2 * y * (j ** 2) + x.
# Luego, el resultado se imprime para el ejemplo dado. Puedes cambiar los valores de y, x y j según tus necesidades.