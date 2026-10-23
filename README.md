# Food Truck Express - Sistema de ventas

Aplicacion de consola en Java para registrar y consultar las ventas de un food truck. El programa organiza los ingresos de tres productos en cuatro turnos, valida los datos digitados y muestra las ventas individuales de mayor y menor valor, ademas de listar las que superen los $500.000.

## Objetivo

Gestionar en memoria los ingresos registrados para los productos:

- Hamburguesa
- Perro caliente
- Papas fritas

en los turnos:

- Almuerzo
- Tarde
- Noche
- Madrugada

La informacion se almacena en una matriz de 3 filas por 4 columnas. Cada fila representa un producto y cada columna un turno.

| Producto / turno | Almuerzo | Tarde | Noche | Madrugada |
|---|---:|---:|---:|---:|
| Hamburguesa | venta | venta | venta | venta |
| Perro caliente | venta | venta | venta | venta |
| Papas fritas | venta | venta | venta | venta |

## Requisitos

- Java Development Kit (JDK) instalado.
- Compilador y ejecutor Java disponibles en la terminal (`javac` y `java`).


## Funcionamiento actual

1. Define los nombres de productos y turnos en arreglos.
2. Crea una matriz `double[3][4]`. Java inicializa sus posiciones en cero antes de registrar las ventas.
3. Recorre cada producto y cada turno para solicitar el ingreso correspondiente.
4. Valida cada dato antes de guardarlo:
   - Si la entrada no es numerica, muestra un mensaje de error y vuelve a leer.
   - Si el valor es negativo, muestra un mensaje de error y vuelve a leer.
   - Acepta cero y valores positivos.
5. Recorre la matriz para mostrar la venta individual mayor y la menor, junto con el producto y el turno donde aparecen.
6. Recorre la matriz para mostrar todas las ventas individuales superiores a $500.000. Si ninguna supera esa cantidad, informa que no se encontraron ventas por encima de ese valor.

Los datos solo permanecen en memoria durante la ejecucion; al cerrar el programa no se guardan en un archivo.

## Tecnologias

- Java
- `Scanner` para la entrada por consola
- Arreglos y matriz bidimensional para organizar los datos
- Ciclos, condiciones y metodos para validar, calcular y presentar informacion