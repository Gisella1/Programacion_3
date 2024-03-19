def menu():
    print("1. Personas")
    print("2. Vehículos")
    print("3. Universidades")
    print("4. Notas")
    print("5. Salir")

while True: 
    menu()
    opcion = int(input("Selecciona una opción: "))
    if opcion == 1:
       print("Hola, seleccionaste la opción Personas.")
    elif opcion == 2:
       print("Hola, seleccionaste la opción Vehículos.")
    elif opcion == 3:
       print("Hola, seleccionaste la opción Universidades.")
    elif opcion == 4:
         print("Hola, seleccionaste la opción Notas.")
    elif opcion == 5:
         print("opcion salir.")
         break
    else:
      print("Opción inválida. Por favor selecciona una opción válida del 1 al 5.")


