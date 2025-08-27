import random
from capturados import agregar_capturado, mostrar_capturados
from registro import leer_registros_combates
from pokemon_clases import Pokemon, PokemonAgua, PokemonElectrico, PokemonFuego, PokemonHierba
from entrenamiento import entrenamiento_intensivo, subirAtaque, subirDefensa, subirVida
from combate import simular_combate_por_turnos

# Enemigos predefinidos
enemigos_predefinidos = [
    Pokemon("Charizard", "Fuego", 70, 30, 100, 15, 2, False),
    Pokemon("Blastoise", "Agua", 60, 40, 79, 15, 2, False),
    Pokemon("Venusaur", "Hierba", 65, 35, 80, 15, 2, False),
    Pokemon("Raichu", "Eléctrico", 75, 25, 78, 15, 2, False)
    
]

def crear_pokemon_enemigo():
    print("\n--- Crear Pokémon enemigo ---")
    try:
        nombre = input("Nombre del Pokémon enemigo: ")
        descripcion = input("Descripción: ")
        ataque = int(input("Ataque: "))
        defensa = int(input("Defensa: "))
        vida = int(input("Vida: "))
        nivel = int(input("Nivel (1-100): "))
        evolucion = int(input("Evolución (1-3): "))
        return Pokemon(nombre, descripcion, ataque, defensa, vida, nivel, evolucion)
    except ValueError:
        print("Entrada inválida. Intenta nuevamente.")
        return crear_pokemon_enemigo()

def submenu_combate(pokemon_usuario):
    print("\n---------- Combate ----------")
    print("1. Enemigos Aleatorios")
    print("2. Crear Enemigo")
    try:
        eleccion = int(input("Selecciona una opción (1-2): "))
        if eleccion == 1:
            enemigo = random.choice(enemigos_predefinidos)
            simular_combate_por_turnos(pokemon_usuario, enemigo)
        elif eleccion == 2:
            enemigo = crear_pokemon_enemigo()
            simular_combate_por_turnos(pokemon_usuario, enemigo)
        else:
            print("Opción no válida.")
    except ValueError:
        print("Entrada inválida. Por favor, selecciona una opción válida.")

def pruebas_manejo_errores():
    print("\n--- Pruebas de Manejo de Errores ---")
    try:
        print("Vamos a simular un error controlado.")
        numero = int(input("Introduce un número entero (o algo incorrecto para probar errores): "))
        print(f"Número ingresado correctamente: {numero}")
    except ValueError:
        print("Error: Lo que ingresaste no es un número entero. Por favor, intenta de nuevo.")
    except Exception as e:
        print(f"Ocurrió un error inesperado: {e}")
    finally:
        print("Prueba de manejo de errores finalizada.")

def interfaz_usuario():
    print("¡Bienvenido a tu Pokédex!")
    print("Selecciona tu Pokémon inicial:")
    print("1. Agua\n2. Fuego\n3. Eléctrico\n4. Hierba")
    opcion = int(input("Selecciona (1-4): "))

    if opcion == 1:
        pokemon_usuario = PokemonAgua(atrapado=True)
    elif opcion == 2:
        pokemon_usuario = PokemonFuego(atrapado=True)
    elif opcion == 3:
        pokemon_usuario = PokemonElectrico(atrapado=True)
    elif opcion == 4:
        pokemon_usuario = PokemonHierba(atrapado=True)
    else:
        print("Opción inválida.")
        return
    

    while True:
        print("\nOpciones:")
        print("1. Mostrar detalles del Pokémon actual")
        print("2. Hacer hablar al Pokémon")
        print("3. Entrenar Pokémon")
        print("4. Realizar combate")
        print("5. Crear un Pokémon enemigo")
        print("6. Ver Pokémon capturados")
        print("7. Pruebas de Manejo de Errores")
        print("8. Leer registros de batallas")
        print("9. Salir")
        try:
            eleccion = int(input("¿Qué deseas hacer? "))

            if eleccion == 1:
                print("\n--- Detalles del Pokémon actual ---")
                pokemon_usuario.detallesPokemon()
            elif eleccion == 2:
                print("\n--- Hablando Pokémon ---")
                pokemon_usuario.hablar()
            elif eleccion == 3:
                print("\n--- Entrenamiento Pokémon ---")
                print("1. Entrenar Intensivo")
                print("2. Entrenar Ataque")
                print("3. Entrenar Defensa")
                print("4. Entrenar Vida")
                subopcion = int(input("¿Qué tipo de entrenamiento deseas realizar? "))
                if subopcion == 1:
                    entrenamiento_intensivo(pokemon_usuario)
                elif subopcion == 2:
                    subirAtaque(pokemon_usuario)
                elif subopcion == 3:
                    subirDefensa(pokemon_usuario)
                elif subopcion == 4:
                    subirVida(pokemon_usuario)
                else:
                    print("Opción no válida.")
                pokemon_usuario.ganar_experiencia(5)  # Gana experiencia al entrenar.
            elif eleccion == 4:
                print("\n--- Realizar Combate ---")
                submenu_combate(pokemon_usuario)
            elif eleccion == 5:
                print("\n--- Crear Pokémon enemigo ---")
                crear_pokemon_enemigo()
            elif eleccion == 6:
                print("\n--- Ver Pokémon capturados ---")
                mostrar_capturados()
            elif eleccion == 7:
                pruebas_manejo_errores()
            elif eleccion == 8:
                print("\n--- Leer registros de batallas ---")
                leer_registros_combates()
            elif eleccion == 9:
                print("¡Gracias por jugar! Hasta la próxima.")
                break
            else:
                print("Opción no válida. Por favor, selecciona una opción del menú.")
        except ValueError:
            print("Entrada inválida. Por favor, selecciona una opción válida.")

interfaz_usuario()
