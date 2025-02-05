# Pinball en Android Studio (Java)

Este proyecto es un juego de **Pinball** desarrollado en **Android Studio** utilizando **Java**. Implementa física básica y controles táctiles para una experiencia de juego fluida en dispositivos móviles.

## 📌 Características
- 🎮 Juego de Pinball con física realista.
- 🏆 Contador de puntuación dinámico.
- 🎨 Gráficos optimizados para dispositivos móviles.
- 📱 Controles táctiles intuitivos para mover las paletas.
- 🎵 Sonidos y efectos añadidos para mayor inmersión.

## 🚀 Tecnologías utilizadas
- **Android Studio**: Entorno de desarrollo.
- **Java**: Lenguaje de programación principal.
- **XML**: Diseño de la interfaz de usuario.
- **Canvas y SurfaceView**: Para renderizar gráficos en tiempo real.

## 📥 Instalación y ejecución
1. Clona este repositorio:
   ```sh
   git clone https://github.com/tuusuario/pinball-android.git
   ```
2. Abre el proyecto en **Android Studio**.
3. Conéctalo a un emulador o dispositivo físico.
4. Ejecuta la aplicación y disfruta del juego.

## 📂 Estructura del proyecto
```
/
├── app/
│   ├── src/main/java/com/tuusuario/pinball/  # Código fuente
│   ├── src/main/res/layout/                 # Interfaces XML
│   ├── src/main/res/drawable/               # Imágenes y recursos gráficos
└── README.md                                 # Documentación del proyecto
```

## 🎮 Controles del juego
- **Tocar el lado izquierdo de la pantalla**: Mueve la paleta izquierda.
- **Tocar el lado derecho de la pantalla**: Mueve la paleta derecha.
- **La bola rebotará en los bordes y obstáculos**.

## 📌 Ejemplo de código (Movimiento de la paleta)
```java
@Override
public boolean onTouchEvent(MotionEvent event) {
    switch (event.getAction()) {
        case MotionEvent.ACTION_DOWN:
            if (event.getX() < getWidth() / 2) {
                moverPaletaIzquierda();
            } else {
                moverPaletaDerecha();
            }
            break;
    }
    return true;
}
```

## 🤝 Contribución
Si deseas mejorar este proyecto, haz un **fork**, crea una rama y envía un **pull request** con tus mejoras.

## 👤 Autor
Desarrollado por sanchoperez91



