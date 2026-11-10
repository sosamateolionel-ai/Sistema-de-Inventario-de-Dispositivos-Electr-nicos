# Sistema de Inventario de Dispositivos Electrónicos

## Descripción
Este proyecto desarrolla un sistema de inventario para una tienda de dispositivos electrónicos utilizando Java y Programación Orientada a Objetos.

Permite representar diferentes tipos de dispositivos, como smartphones y laptops, almacenando sus características generales y mostrando información técnica específica de cada uno.

## Funcionamiento del programa

El programa crea dos dispositivos:

- **Smartphone:** Samsung Galaxy S24, con un precio base de $950.000, cámara de 50 megapíxeles y 256 GB de almacenamiento.
- **Laptop:** Lenovo ThinkPad E14, con un precio base de $1.200.000, procesador Intel Core i7 y 16 GB de memoria RAM.

Ambos dispositivos se almacenan en un arreglo de tipo `Dispositivo[]`.

Mediante un ciclo `for`, el programa recorre el inventario y ejecuta el método `mostrarInformacion()` para cada elemento, mostrando sus datos generales y características particulares.

## Clases principales

| Clase | Responsabilidad |
|---|---|
| `Dispositivo` | Clase base que contiene los atributos generales: marca, modelo y precio base. |
| `Smartphone` | Hereda de `Dispositivo` y agrega información sobre la cámara y el almacenamiento. |
| `Laptop` | Hereda de `Dispositivo` y agrega información sobre el procesador y la memoria RAM. |
| `Main` | Crea los dispositivos, los almacena en un arreglo y muestra sus características. |

## Conceptos de programación aplicados

- **Herencia:** `Smartphone` y `Laptop` heredan los atributos y métodos de `Dispositivo`.
- **Encapsulamiento:** se utilizan atributos `protected` en la clase base y atributos `private` en las clases derivadas.
- **Polimorfismo:** se utiliza un arreglo de tipo `Dispositivo[]` para almacenar objetos de distintas clases.
- **Sobrescritura de métodos:** las clases `Smartphone` y `Laptop` redefinen `mostrarInformacion()` mediante `@Override`.
- **Uso de `super`:** permite invocar el constructor y el método `mostrarInformacion()` de la clase padre.

## Tecnologías utilizadas

- Lenguaje: Java.
- Entorno de desarrollo: IntelliJ IDEA.
- Paradigma: Programación Orientada a Objetos.

## Ejecución

<img width="295" height="331" alt="image" src="https://github.com/user-attachments/assets/8e16354d-dd84-4559-918a-19b766dfed3f" />

## Resultado esperado

La consola muestra el inventario de la tienda con dos fichas técnicas:

- Samsung Galaxy S24: cámara de 50 MP, almacenamiento de 256 GB y precio base de $950.000.
- Lenovo ThinkPad E14: procesador Intel Core i7, memoria RAM de 16 GB y precio base de $1.200.000.

## Objetivo del ejercicio

Practicar los conceptos de herencia, polimorfismo y sobrescritura de métodos, utilizando una clase base para representar características comunes y clases derivadas para incorporar información específica de cada dispositivo.

## Estructura del proyecto

```text
InventarioDispositivos/
├── Dispositivo.java
├── Smartphone.java
├── Laptop.java
├── Main.java
└── README.md
```

**Nombre sugerido para el repositorio:** `inventario-dispositivos-electronicos`
