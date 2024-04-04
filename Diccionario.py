#Diccionario vacio
perro = {}
print (perro)

#Añadir al diccionario 
perro ['Nonbre'] = "ares"
perro ['Color'] = "blanco"
perro ['Raza'] = "lobo"
perro ['Patas'] = 4
perro ['Edad'] = 1
print (perro)

#Estudiante 
estudiante = {
    "nombre": "juana",
    "apellido": "herrera",
    "edad": 25,
    "sexo": "femenino",
    "estado civil": "soltera",
    "habilidades": ["deseñadora","cantante"],
    "pais": "mexico",
    "ciudad": "cdmx",
    "direccion": "calle 5 de noviembre #215",
}
print (estudiante)

#longitud
longitud_estudiante = len (estudiante)
print(f"La longitud del diccionario del estudiante es: {longitud_estudiante}")

#valor
print ('habilidades',estudiante['habilidades'])
print (type(estudiante['habilidades']))

#modificar
estudiante["habilidades"].append("HTML")
estudiante["habilidades"].append("CSS")
print(f"Las nuevas habilidades son: {estudiante['habilidades']}")

# Obtener las claves del diccionario como una lista
claves_estudiante = list(estudiante.keys())
print(f"Las claves del diccionario son: {claves_estudiante}")

# Obtener los valores del diccionario como una lista
valores_estudiante = list(estudiante.values())
print(f"Los valores del diccionario son: {valores_estudiante}")

# Cambiar el diccionario a una lista de tuplas utilizando el método items()
tuplas_estudiante = list(estudiante.items())
print(f"La lista de tuplas es: {tuplas_estudiante}")

# Eliminar uno 
del estudiante["habilidades"]
print(f"El diccionario del estudiante después de eliminar habilidades es: {estudiante}")

# Borrar uno 
del estudiante
print("El diccionario del estudiante ha sido eliminado")