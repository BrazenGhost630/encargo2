-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-05-2025 a las 23:46:07
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
-- Base de datos: `bd_encargo_2_curso`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso_catalogo`
--

CREATE TABLE `curso_catalogo` (
  `activo` bit(1) NOT NULL,
  `duracion_horas` int(11) NOT NULL,
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  `categoria` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `curso_catalogo`
--

INSERT INTO `curso_catalogo` (`activo`, `duracion_horas`, `id`, `descripcion`, `categoria`, `nombre`) VALUES
(b'0', 40, 1, 'Juegos AAA', 'Juegos', 'Juegos A gran escala'),
(b'1', 35, 2, 'Fundamentos de Inteligencia Artificial', 'Tecnología', 'Introducción a IA'),
(b'1', 50, 3, 'Diseño de interfaces de usuario', 'Diseño', 'UI/UX para aplicaciones'),
(b'0', 40, 4, 'Producción musical con herramientas digitales', 'Arte', 'Composición digital'),
(b'1', 45, 5, 'Gestión de bases de datos con MySQL', 'Tecnología', 'Administración de DB'),
(b'1', 30, 6, 'Marketing digital y redes sociales', 'Negocios', 'Estrategias de crecimiento'),
(b'0', 55, 7, 'Programación en Python desde cero', 'Programación', 'Python básico'),
(b'1', 48, 8, 'Seguridad informática y hacking ético', 'Tecnología', 'Ciberseguridad avanzada'),
(b'1', 25, 9, 'Arte digital con Photoshop e Illustrator', 'Diseño', 'Ilustración digital'),
(b'0', 20, 10, 'Creación de contenido para YouTube', 'Comunicación', 'YouTube para principiantes'),
(b'1', 60, 11, 'Desarrollo de juegos AAA', 'Juegos', 'Creación de Juegos A gran escala');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `curso_catalogo`
--
ALTER TABLE `curso_catalogo`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK969iklng1ido7pvj7sissfqf3` (`nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `curso_catalogo`
--
ALTER TABLE `curso_catalogo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
