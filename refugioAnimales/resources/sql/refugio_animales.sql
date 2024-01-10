-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-01-2024 a las 23:48:54
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `refugio_animales`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `adopciones`
--

CREATE TABLE `adopciones` (
  `ID` int(11) NOT NULL,
  `ID_ANIMAL` int(11) DEFAULT NULL,
  `ID_VOLUNTARIO` int(11) DEFAULT NULL,
  `FECHA_ADOPCION` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `adopciones`
--

INSERT INTO `adopciones` (`ID`, `ID_ANIMAL`, `ID_VOLUNTARIO`, `FECHA_ADOPCION`) VALUES
(1, 1, 2, '2024-01-20'),
(2, 2, 1, '2024-02-05'),
(3, 3, 3, '2024-03-18'),
(4, 4, 4, '2024-04-25'),
(5, 5, 5, '2024-05-10'),
(6, 6, 6, '2024-06-20'),
(7, 7, 7, '2024-07-07'),
(8, 8, 8, '2024-08-15'),
(9, 9, 9, '2024-09-25'),
(10, 10, 10, '2024-10-30');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `animales`
--

CREATE TABLE `animales` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(50) DEFAULT NULL,
  `RAZA` varchar(50) DEFAULT NULL,
  `CLASE` varchar(50) DEFAULT NULL,
  `EDAD` int(11) DEFAULT NULL,
  `DISPONIBILIDAD` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `animales`
--

INSERT INTO `animales` (`ID`, `NOMBRE`, `RAZA`, `CLASE`, `EDAD`, `DISPONIBILIDAD`) VALUES
(1, 'Max', 'Labrador Retriever', 'Perro', 3, 1),
(2, 'Luna', 'Siamés', 'Gato', 2, 1),
(3, 'Rocky', 'Bulldog', 'Perro', 4, 0),
(4, 'meperdonas', 'Persa', 'Gato', 1, 1),
(5, 'buny', 'Golden Retriever', 'Perro', 2, 1),
(6, 'Simba', 'Bengal', 'Gato', 3, 1),
(7, 'bunny', 'Chihuahua', 'Perro', 1, 1),
(8, 'Lola', 'Ragdoll', 'Gato', 2, 0),
(9, 'solovino', 'Boxer', 'Perro', 3, 1),
(10, 'milaneso', 'Maine Coon', 'Gato', 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas_veterinarias`
--

CREATE TABLE `citas_veterinarias` (
  `ID` int(11) NOT NULL,
  `ID_ANIMAL` int(11) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `OBSERVACIONES` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citas_veterinarias`
--

INSERT INTO `citas_veterinarias` (`ID`, `ID_ANIMAL`, `FECHA`, `OBSERVACIONES`) VALUES
(1, 1, '2024-01-15', 'Vacunación anual'),
(2, 2, '2024-02-01', 'Control de salud'),
(3, 3, '2024-03-10', 'Esterilización'),
(4, 4, '2024-04-20', 'Revisión dental'),
(5, 5, '2024-05-05', 'Vacunación y desparasitación'),
(6, 6, '2024-06-15', 'Control de peso'),
(7, 7, '2024-07-02', 'Consulta general'),
(8, 8, '2024-08-10', 'Vacunación anual'),
(9, 9, '2024-09-18', 'Revisión de oídos'),
(10, 10, '2024-10-25', 'Control de salud y vacunación');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `donaciones`
--

CREATE TABLE `donaciones` (
  `ID` int(11) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `DONANTE` varchar(50) DEFAULT NULL,
  `MONTO` varchar(10) DEFAULT NULL,
  `COMENTARIO` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `donaciones`
--

INSERT INTO `donaciones` (`ID`, `FECHA`, `DONANTE`, `MONTO`, `COMENTARIO`) VALUES
(1, '2024-01-10', 'Carlos', '100€', 'Donación para cuidado de animales'),
(2, '2024-02-15', 'Laura', '50€', 'Apoyo para eventos'),
(3, '2024-03-20', 'Ana', '75€', 'Donación mensual'),
(4, '2024-04-05', 'Pedro', '120€', 'Contribución para alimentación'),
(5, '2024-05-12', 'Isabel', '30€', 'Donación para adopciones'),
(6, '2024-06-18', 'Miguel', '80€', 'Ayuda para gastos veterinarios'),
(7, '2024-07-22', 'Luisa', '25€', 'Donación para eventos'),
(8, '2024-08-30', 'Sofía', '150€', 'Apoyo económico'),
(9, '2024-09-10', 'Javier', '60€', 'Donación para cuidado de animales'),
(10, '2024-10-15', 'Martín', '90€', 'Aporte para el refugio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventos`
--

CREATE TABLE `eventos` (
  `ID` int(11) NOT NULL,
  `NOMBRE_EVENTO` varchar(50) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `DESCRIPCION` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `eventos`
--

INSERT INTO `eventos` (`ID`, `NOMBRE_EVENTO`, `FECHA`, `DESCRIPCION`) VALUES
(1, 'Feria de Adopciones', '2024-01-25', 'Evento para promover la adopción de animales'),
(2, 'Jornada de Voluntariado', '2024-02-12', 'Día dedicado a la participación de voluntarios'),
(3, 'Charla sobre Bienestar Animal', '2024-03-18', 'Conferencia informativa sobre cuidado y bienestar animal'),
(4, 'Caminata Canina Solidaria', '2024-04-08', 'Evento para recaudar fondos'),
(5, 'Taller de Educación Felina', '2024-05-15', 'Sesión educativa sobre cuidado de gatos'),
(6, 'Jornada de Puertas Abiertas', '2024-06-22', 'Oportunidad para que la comunidad conozca el refugio'),
(7, 'Concurso de Disfraces para Mascotas', '2024-07-10', 'Competencia divertida para animales y sus dueños'),
(8, 'Campaña de Esterilización', '2024-08-28', 'Iniciativa para promover la esterilización de mascotas'),
(9, 'Día de la Adopción Especial', '2024-09-15', 'Evento especial para adopciones'),
(10, 'Exposición de Razas', '2024-10-20', 'Muestra de diferentes razas de animales en el refugio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `razas`
--

CREATE TABLE `razas` (
  `ID` int(11) NOT NULL,
  `NOMBRE_RAZA` varchar(50) DEFAULT NULL,
  `DESCRIPCION` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `razas`
--

INSERT INTO `razas` (`ID`, `NOMBRE_RAZA`, `DESCRIPCION`) VALUES
(1, 'Labrador Retriever', 'Perro de tamaño mediano, inteligente y amigable'),
(2, 'Siamés', 'Gato de pelaje corto y cuerpo esbelto con colores distintivos'),
(3, 'Bulldog', 'Perro de constitución musculosa y cabeza distintiva'),
(4, 'Persa', 'Gato de pelaje largo, nariz achatada y cola peluda'),
(5, 'Golden Retriever', 'Perro de tamaño grande, amigable y fácil de entrenar'),
(6, 'Bengal', 'Gato con pelaje manchado que se asemeja al de un leopardo'),
(7, 'Chihuahua', 'Perro pequeño con cabeza redonda y orejas grandes'),
(8, 'Ragdoll', 'Gato de tamaño grande y pelaje suave, conocido por su docilidad'),
(9, 'Boxer', 'Perro de tamaño mediano a grande, musculoso y enérgico'),
(10, 'Maine Coon', 'Gato de gran tamaño, pelaje largo y cola tupida');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `voluntarios`
--

CREATE TABLE `voluntarios` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(50) DEFAULT NULL,
  `APELLIDOS` varchar(50) DEFAULT NULL,
  `TELEFONO` varchar(14) DEFAULT NULL,
  `DISPONIBILIDAD` varchar(3) DEFAULT NULL,
  `HABILIDADES` text DEFAULT NULL,
  `LOCALIDAD` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `voluntarios`
--

INSERT INTO `voluntarios` (`ID`, `NOMBRE`, `APELLIDOS`, `TELEFONO`, `DISPONIBILIDAD`, `HABILIDADES`, `LOCALIDAD`) VALUES
(1, 'Laura', 'Rios', '+34901234567', 'si', 'Cuidado de perros, eventos', 'Madrid'),
(2, 'Carlos', 'López', '+34908765432', 'no', 'Cuidado de gatos, limpieza', 'Alcalá de Henares'),
(3, 'Isabel', 'Martínez', '+34904561234', 'si', 'Cuidado de animales pequeños', 'Getafe'),
(4, 'Javier', 'Sánchez', '+34903215678', 'si', 'Cuidado de perros, eventos', 'Leganés'),
(5, 'Luisa', 'Hernández', '+34906543210', 'no', 'Cuidado de gatos, limpieza', 'Alcobendas'),
(6, 'Miguel', 'Díaz', '+34909876543', 'no', 'Cuidado de animales pequeños', 'Móstoles'),
(7, 'Sofía', 'Muñoz', '+34901234567', 'si', 'Cuidado de perros, eventos', 'Madrid'),
(8, 'Pedro', 'Lopéz', '+34908765432', 'no', 'Cuidado de gatos, limpieza', 'Madrid'),
(9, 'Ale', 'Noguera', '+34904561234', 'si', 'Cuidado de animales pequeños', 'Getafe'),
(10, 'Vanesa', 'Caceres', '+34903215678', 'si', 'Cuidado de animales pequeños', 'Alcalá de Henares');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `adopciones`
--
ALTER TABLE `adopciones`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `animales`
--
ALTER TABLE `animales`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `citas_veterinarias`
--
ALTER TABLE `citas_veterinarias`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `donaciones`
--
ALTER TABLE `donaciones`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `eventos`
--
ALTER TABLE `eventos`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `razas`
--
ALTER TABLE `razas`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `voluntarios`
--
ALTER TABLE `voluntarios`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `adopciones`
--
ALTER TABLE `adopciones`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `animales`
--
ALTER TABLE `animales`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `citas_veterinarias`
--
ALTER TABLE `citas_veterinarias`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `donaciones`
--
ALTER TABLE `donaciones`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `eventos`
--
ALTER TABLE `eventos`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `razas`
--
ALTER TABLE `razas`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `voluntarios`
--
ALTER TABLE `voluntarios`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
