# 🎮 Proyecto: Sistema de Clases para Videojuego

## Descripción 📝

Este proyecto tiene como objetivo el desarrollo de la lógica de personajes para un videojuego de rol. Se ha diseñado una jerarquía de clases e interfaces para representar diferentes tipos de personajes, cada uno con habilidades únicas y comportamientos definidos. Los personajes se dividen en dos categorías: los que combaten físicamente y los que poseen habilidades mágicas o sobrenaturales.

## Tecnologías Usadas 💻

- **Java**: Lenguaje de programación para la implementación de las clases e interfaces.
- **Git & GitHub**: Para el control de versiones y colaboración en pareja.

## Estructura del Proyecto 🏗️

### 1. **Clase abstracta `Personaje`**
   - **Atributos comunes**:
     - 'nombre', 'nivel', 'salud'
   - **Métodos**:
     - 'atacar()` → Método abstracto.
     - Métodos 'toString()', 'equals()', 'hashCode()' personalizados.

### 2. **Subclases intermedias**
   - **Personajes de combate físico**: Clase abstracta que agrupa comportamientos comunes a personajes que luchan cuerpo a cuerpo.
   - **Personajes con habilidades mágicas**: Clase abstracta que agrupa personajes con habilidades mágicas o sobrenaturales.
   - Métodos no abstractos adicionales para cada tipo de subclase (por ejemplo, 'cargarAtaque()' o 'regenerarMana()').

### 3. **Clases concretas**
   Se implementan al menos tres clases concretas que heredan de las subclases intermedias:

   - **Metalero** 🤘 (Combate Mágico, Defendible):
     - Atributos: 'fuerza', 'salud', 'nivel', 'mana', 'guitarra', 'nombre'
     - Métodos: 'cargarAtaque()', 'defender()', 'lanzarHechizo()'
   
   - **Antonia** 👵 (Mágica/Curable):
     - Atributos: 'fuerza', 'salud', 'nivel', 'mana', 'rosario', 'nombre'
     - Métodos: 'lanzarHechizo()', 'regenerarMana()'

   - **Policia** 👮‍♂️ (Combate físico):
     - Atributos: 'fuerza', 'salud', 'nivel', 'balas', 'nombre'
     - Métodos: 'atacar()', 'disparar()'

   - **Mutante** 👹 (Enemigo):
     - Atributos: 'fuerza', 'salud', 'nivel', 'nombre'
     - Métodos: 'atacar()', 'morder()', 'alarido()'

### 4. **Interfaces**
   Cada personaje implementa al menos una interfaz. Algunas interfaces definidas son:

   - **Curable** 💉 → 'curar()'
   - **Defendible** 🛡️ → 'defender()'
   - **Pistolero** 🔫 → 'disparar()'
   - **Ladrador** 🐕 → 'alarido()'
   - **Mordedor** 🐾 → 'morder()'

### 5. **Clase `Juego`**
   - **Atributo**: Lista de personajes ('ArrayList<Personaje>').
   - **Método**: 'mostrarAcciones()' que recorre la lista de personajes, invoca el método 'atacar()' y usa 'instanceof' para ejecutar habilidades adicionales basadas en las interfaces implementadas por cada personaje.

### 6. **Clase 'Main'**
   - Crea instancias de los personajes ('Metalero', 'Antonia', 'Policia', 'Mutante') y los añade al juego.
   - Llama al método 'mostrarAcciones()' para ejecutar las acciones de los personajes.

### 7. **Clase 'Batalla'**
   - Simula un combate entre personajes. Este paso es valorado positivamente si se incluye en el proyecto.

## Autores
Este proyecto ha sido desarrollado por Sara Alonso Perdomo y Juan Antonio "Toño" Tejera González.  

Github Sara: [![Web](https://img.shields.io/badge/GitHub-juniuun-14a1f0?style=for-the-badge&logo=github&logoColor=white&labelColor=101010)](https://github.com/juniuun/)

Github de Toño: [![Web](https://img.shields.io/badge/GitHub-tonodevep-14a1f0?style=for-the-badge&logo=github&logoColor=white&labelColor=101010)](https://github.com/tonodevep/)

