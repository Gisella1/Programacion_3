import tkinter as tk

def mostrar_datos():
    nombre = cnombre.get()
    apellido = capellido.get()
    edad = cedad.get()
    sexo = opcion.get()
    ciudad = cciudad.get(cciudad.curselection())
    
    
    tk.Label(marco,  text="Nombre: "+ nombre).pack()
    tk.Label(marco, text="Apellido: "+ apellido).pack()
    tk.Label(marco, text="Edad: "+ edad).pack()
    tk.Label(marco, text="Sexo: "+ sexo).pack()
    tk.Label(marco, text="Ciudad: "+ ciudad).pack()
    
    
    
    
ventana = tk.Tk()

ventana.title("Mi primera ventana")

ventana.geometry("800x600")

lnombre = tk.Label(ventana,text ="Nombre:")
lnombre.grid(row=0, column=0)

cnombre = tk.Entry(ventana, width= 30)
cnombre.grid(row=0,column=1)

lapellido = tk.Label(ventana, text="Apellido:")
lapellido.grid(row=1,column=0)

capellido = tk.Entry(ventana, width= 30)
capellido.grid(row=1,column=1)

ledad = tk.Label(ventana, text="Edad:")
ledad.grid(row=2,column=0)

cedad = tk.Entry(ventana, width=30)
cedad.grid(row=2,column=1)

opcion = tk.StringVar()

lsexo = tk.Label(ventana, text="Sexo:")
lsexo.grid(row=3,column=0) 

sexoM = tk.Radiobutton(ventana, text="Masculino", state="normal", variable =opcion, value="masculino")
sexoM.grid(row=3,column=1)

sexoM = tk.Radiobutton(ventana, text="Femenino", state="normal", variable =opcion, value="femenino")
sexoM.grid(row=3,column=2)

#cuidad 

lciudad = tk.Label(ventana, text="Ciudad:")
lciudad.grid(row=4,column=0)

cciudad = tk.Listbox(ventana, width=15, height=5)
elementos = ["madrid","medellin","cartagena"]
for elemento in elementos:
    cciudad.insert(tk.END, elemento)
cciudad.grid(row=4,column=1)

boton=tk.Button(ventana,text='registrar', command=mostrar_datos)
boton.grid(row=5,column=1)

marco = tk.Frame(ventana, width=200, height=100, bd=2, relief="raised")
marco.grid(row=6, column=2)


ventana.mainloop()
