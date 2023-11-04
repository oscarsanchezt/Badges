import base64

texto_original = "Code."

texto_codificado = base64.b64encode(texto_original.encode()).decode()

print("Texto codificado en base64:", texto_codificado)

texto_decodificado = base64.b64decode(texto_codificado).decode()

print("Texto decodificado:", texto_decodificado)
#Fin