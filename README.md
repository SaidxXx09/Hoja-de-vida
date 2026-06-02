# Hoja de Vida

Ejercicio de formulario de escritorio desarrollado en Java con Swing. Permite llenar un formulario con datos personales y laborales, y guardarlos en un archivo de texto.

---

## ¿Qué hace?

- Formulario con campos de información personal: nombre, apellido, edad, cédula, género, estado civil y provincia.
- Selección de cargos a postular: Programador/a, Despachador/a, Recepcionista, Secretario/a.
- Campos para experiencia laboral y referencias.
- Validación de campos: muestra un mensaje de error si algún campo está vacío o no se seleccionó un cargo.
- Al hacer clic en **Enviar**, genera un archivo `hoja_de_vida.txt` con toda la información ingresada.

---

## Tecnologías

| Herramienta | Uso |
|---|---|
| Java | Lenguaje principal |
| Swing (Java GUI) | Interfaz gráfica del formulario |
| IntelliJ IDEA GUI Designer | Diseño visual del formulario |

---

## Cómo ejecutar

### Desde IntelliJ IDEA *(recomendado)*

1. Abre IntelliJ IDEA y selecciona `Open` → elige la carpeta `Hoja-de-vida-master`.
2. Abre el archivo `Frm_HojaDeVida.java` ubicado en `src/View/`.
3. Haz clic en el botón ▶ verde junto al método `main` al final del archivo, o presiona `Shift + F10`.

### Desde la terminal

```bash
# Compilar
javac -d out src/View/Frm_HojaDeVida.java

# Ejecutar
java -cp out View.Frm_HojaDeVida
```

> Al presionar el botón **Enviar** en el formulario, se generará el archivo `hoja_de_vida.txt` en la raíz del proyecto.

---

## Archivo generado

El archivo `hoja_de_vida.txt` tiene el siguiente formato:

```
=== HOJA DE VIDA ===
-- INFORMACION PERSONAL --
Nombre: ...
Apellido: ...
Edad: ...
Cedula: ...
Genero: ...
Estado civil: ...
Provincia: ...
-- INFORMACION LABORAL --
Cargo para postular: ...
Experiencia laboral: ...
Referencias: ...
```

---

## Autor

| Nombre |
|---|
| Said Quinto |
