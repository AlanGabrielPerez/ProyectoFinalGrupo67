-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 05-10-2023 a las 17:22:33
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `paqueteturistico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamiento`
--

CREATE TABLE `alojamiento` (
  `idAlojamiento` int(11) NOT NULL,
  `tipoAlojamiento` varchar(25) DEFAULT NULL,
  `nombre` varchar(25) DEFAULT NULL,
  `fechaIn` date NOT NULL,
  `fechaOut` date NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `servicio` varchar(11) NOT NULL,
  `importeDiario` double(11,2) NOT NULL,
  `ciudadDest` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `idCiudad` int(11) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `pais` varchar(15) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `provincia` varchar(15) NOT NULL,
  `temAlta` date NOT NULL,
  `temMedia` date NOT NULL,
  `temBaja` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`idCiudad`, `nombre`, `pais`, `estado`, `provincia`, `temAlta`, `temMedia`, `temBaja`) VALUES
(1, 'Cordoba', 'Argentina', 1, 'Cordoba', '2000-05-01', '2000-09-01', '2000-12-01'),
(4, 'Mendoza', 'Argentina', 1, 'Mendoza', '2000-01-01', '2000-09-01', '2000-05-01'),
(5, 'ElCalafate', 'Argentina', 1, 'Santa Cruz', '2000-12-01', '2000-08-01', '2000-04-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paquete`
--

CREATE TABLE `paquete` (
  `idPaquete` int(11) NOT NULL,
  `idOrigen` int(11) NOT NULL,
  `idPasaje` int(11) NOT NULL,
  `idAlojamiento` int(11) NOT NULL,
  `idDestino` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasaje`
--

CREATE TABLE `pasaje` (
  `idPasaje` int(11) NOT NULL,
  `tipoTransporte` varchar(11) NOT NULL,
  `importe` double(11,2) NOT NULL,
  `origen` varchar(11) NOT NULL,
  `destino` varchar(20) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD PRIMARY KEY (`idAlojamiento`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`idCiudad`);

--
-- Indices de la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD PRIMARY KEY (`idPaquete`),
  ADD KEY `idAlojamiento` (`idAlojamiento`),
  ADD KEY `idDestino` (`idDestino`),
  ADD KEY `idOrigen` (`idOrigen`),
  ADD KEY `idPasaje` (`idPasaje`);

--
-- Indices de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD PRIMARY KEY (`idPasaje`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  MODIFY `idAlojamiento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `idCiudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `paquete`
--
ALTER TABLE `paquete`
  MODIFY `idPaquete` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  MODIFY `idPasaje` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `paquete`
--
ALTER TABLE `paquete`
  ADD CONSTRAINT `paquete_ibfk_1` FOREIGN KEY (`idAlojamiento`) REFERENCES `alojamiento` (`idAlojamiento`),
  ADD CONSTRAINT `paquete_ibfk_2` FOREIGN KEY (`idDestino`) REFERENCES `ciudad` (`idCiudad`),
  ADD CONSTRAINT `paquete_ibfk_3` FOREIGN KEY (`idOrigen`) REFERENCES `ciudad` (`idCiudad`),
  ADD CONSTRAINT `paquete_ibfk_4` FOREIGN KEY (`idPasaje`) REFERENCES `pasaje` (`idPasaje`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
