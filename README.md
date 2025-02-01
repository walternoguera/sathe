# SatheCMS

# Sistema de Gestión para Refugio de Animales

Este proyecto es una aplicación de escritorio desarrollada en **Java Swing**, diseñada para la gestión de un refugio de animales. La interfaz principal está basada en **CardLayout**, permitiendo navegar entre distintas secciones del sistema de manera fluida.

## Características Principales

- **Interfaz con Menú Lateral**: Permite cambiar entre las distintas secciones de la aplicación.
- **Gestor de Paneles (`CardLayout`)**: Optimiza la carga de vistas dentro de la interfaz.
- **Diferentes Módulos de Gestión**:
  - **Principal**: Vista de resumen con conteo de animales y voluntarios.
  - **Inventario**: Registro de animales disponibles en el refugio.
  - **Adopciones**: Gestión de solicitudes y adopciones aprobadas.
  - **Citas Veterinarias**: Seguimiento de citas para atención médica de los animales.
  - **Voluntarios**: Registro de personas que colaboran con el refugio.
  - **Eventos**: Planificación de actividades para el refugio.
  - **Donaciones**: Seguimiento de recursos económicos y materiales recibidos.

## Tecnologías Utilizadas

- **Java SE 8+**
- **Swing (GUI)**
- **CardLayout** para navegación de vistas

## Estructura del Proyecto

```
proyecto/
│── src/
│   ├── controlador/          # Controladores de la aplicación
│   │   ├── Dashboard.java    # Ventana principal con CardLayout
│   ├── views/                # Interfaces gráficas de las distintas secciones
│   │   ├── Principal.java
│   │   ├── Inventario.java
│   │   ├── Adopcion.java
│   │   ├── CitaVeterinaria.java
│   │   ├── Voluntarios.java
│   │   ├── Eventos.java
│   │   ├── Donaciones.java
│── README.md                 # Descripción del proyecto
```

## Diseño y Paleta de Colores

La paleta de colores utilizada en el sistema incluye los siguientes tonos:

- **Púrpura vibrante**: `#534DC0`
- **Azul marino profundo**: `#27293C`
- **Gris azulado oscuro**: `#21242E`
- **Gris plateado**: `#BABBBE`
- **Blanco humo**: `#F6F6F6`
- **Naranja vivo**: `#F19301`
## Captura de pantalla de la App

![imagen](https://github.com/walternoguera/sathe/assets/29197564/84b352d9-99f5-4609-b9a5-8676d52b4eaf)

![cap5](https://github.com/walternoguera/sathe/assets/29197564/004f166a-3513-4865-b517-cb39b6e5cd90)


## Instalación y Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu_usuario/tu_repositorio.git
   ```
2. Abrir el proyecto en **NetBeans** o **IntelliJ IDEA**.
3. Compilar y ejecutar `Dashboard.java`.

---

**Autor:** _[Walter Morel Noguera]_




