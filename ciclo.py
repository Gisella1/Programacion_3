Vuelo = {
    "Aerolinea": "Avianca",
    "Vuelo": "AV3102",
    "Origen": "CTG",
    "Destino": "MDE",
    "Tipo_Maleta": ["Cabina", "Mano", "Bodega"]
}

print("Aerolinea:", Vuelo["Aerolinea"])
print("Vuelo:", Vuelo["Vuelo"])
print("Origen:", Vuelo["Origen"])
print("Destino:", Vuelo["Destino"])
print("Tipo_Maleta:", Vuelo["Tipo_Maleta"])

for tipo in Vuelo["Tipo_Maleta"]:
    print("-", tipo)