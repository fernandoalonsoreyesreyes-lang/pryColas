# EjemploCola1 — Colas en Java

## 📋 Descripción

Proyecto en **Java** para ejemplificar el uso de **Colas (Queues)**.

El programa crea una cola de **10 elementos** que almacena nombres de personas
y permite realizar las operaciones básicas de una cola: **insertar (enqueue)**,
**extraer (dequeue)** y **mostrar** los elementos.

Este proyecto corresponde a la unidad de **Pilas y Colas** de la materia
de Estructura y Organización de Datos.



## 🎯 Objetivo

Aplicar la estructura de datos **Cola (FIFO - First In, First Out)**,
donde el primer elemento que entra es el primero que sale.


## ⚙️ Funcionalidades

El programa muestra un menú con las siguientes opciones:

1. **Poner elemento en la Cola** — Inserta un nombre al final de la cola.
2. **Quitar elemento de la Cola** — Extrae y muestra el primer nombre que entró.
3. **Mostrar elementos de la Cola** — Muestra todos los nombres que hay en la cola.
4. **Salir** — Termina el programa.

## 🛠️ Tecnologías utilizadas

- **Lenguaje:** Java
- **JDK:** 17 o superior
- **IDE:** NetBeans
- **Paradigma:** Programación Orientada a Objetos (POO)

## 📁 Estructura del proyecto

```text
EjemploCola1/
├── pom.xml
├── ColaNombres.java
└── EjemploCola1.java
```
## ▶️ Cómo ejecutar el proyecto
- **Opción 1:** Desde la terminal con Maven
- **1. Clonar el repositorio**
git clone https://github.com/fernandoalonsoreyesreyes-lang/EjemploCola1.git

- **2. Entrar a la carpeta**
cd EjemploCola1

- **3. Compilar**
mvn compile

- **4. Ejecutar**
mvn exec:java -Dexec.mainClass="EjemploCola1"

- **Opción 2:** Desde un IDE
- **Clona** el repositorio.
- **Ábrelo** como proyecto Maven.
- **Ejecuta** la clase EjemploCola1.java.

## 📚 Referencia
- Cairó, O. y Guardati, S. Estructuras de Datos. 3ra. edición. McGraw-Hill, 2006.
- **Capítulo 3:** Pilas y Colas.

## 👥 Autores
- **Nombre:** Fernando Alonso Reyes Reyes y Uriel Castillo Ramos
- **GitHub:** fernandoalonsoreyesreyes-lang
- **Materia:** Estructura y Organizacion de Datos
- **Proyecto:** EjemploCola1
