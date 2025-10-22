# HelloFormXML_nombreApellido

## Descripción
Aplicación Android simple que saluda al usuario. El usuario escribe su nombre en un campo de texto, pulsa el botón "Saludar" y la aplicación muestra un mensaje de bienvenida.

## Funcionalidad
- Campo de texto para introducir el nombre
- Botón "Saludar" para confirmar
- Mensaje de saludo personalizado con el nombre introducido
- Validación: si el campo está vacío, muestra "Introduce tu nombre"

## Cómo probarlo
1. Abre el proyecto en Android Studio
2. Ejecuta la aplicación en un emulador o dispositivo físico
3. Escribe tu nombre en el campo de texto
4. Pulsa el botón "Saludar"
5. Verás el mensaje "👋 Hola, [tu nombre]"

## Tecnologías
- Android Studio
- Kotlin
- XML para layouts
- ComponentActivity

## Estructura del proyecto
- `activity_main.xml`: Layout con LinearLayout, EditText, Button y TextView
- `MainActivity.kt`: Lógica de la aplicación con findViewById y setOnClickListener