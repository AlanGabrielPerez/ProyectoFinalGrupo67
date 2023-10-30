-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 14:49:41
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
  `tipoAlojamiento` varchar(25) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `servicio` varchar(30) NOT NULL,
  `importeDiario` double(11,2) NOT NULL,
  `ciudadDest` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alojamiento`
--

INSERT INTO `alojamiento` (`idAlojamiento`, `tipoAlojamiento`, `nombre`, `estado`, `servicio`, `importeDiario`, `ciudadDest`) VALUES
(1, 'Hotel', 'Gran Marplatence', 1, 'Desayuno-  Almuerzo-  Cena', 48000.00, 'Mar del Plata'),
(2, 'Cabaña', 'Casita de madera 2', 1, 'Desayuno-  Almuerzo- ', 21000.00, 'Mar del Plata'),
(3, 'Hostel', 'Los haroldos', 1, '', 1000.00, 'Mar del Plata'),
(4, 'Hotel', 'Hotel del sol', 1, 'Desayuno-  ', 41000.00, 'CABA'),
(5, 'Hotel', 'Hotel del Mar', 1, 'Desayuno-  ', 41000.00, 'Mar del Plata'),
(6, 'Hotel', 'Hotel el pescador', 1, 'Desayuno-  ', 21500.00, 'Bahia Blanca'),
(7, 'Hostel', 'La bahia', 1, 'Desayuno- ', 20500.00, 'Bahia Blanca'),
(8, 'Cabaña', 'Casita de madera', 1, 'Desayuno-  Cena', 21500.00, 'Mar del Plata'),
(9, 'Hotel', 'Gran Hotel', 1, 'Desayuno-  Almuerzo-  Cena', 3000.00, 'Mar del Plata'),
(10, 'Departamento', 'Depto centro', 1, 'Sin servicios disponibles', 10000.00, 'Cordoba Capital'),
(11, 'Hostel', 'Alegria Compartida', 1, 'Sin servicios disponibles', 9000.00, 'Cordoba Capital'),
(12, 'Hostel', 'EcoViajeros', 1, 'Desayuno- ', 5500.00, 'Cordoba Capital'),
(13, 'Hotel', 'Estrellas del Viajero', 1, 'Desayuno-  Cena', 21000.00, 'Cordoba Capital'),
(14, 'Hotel', 'Oasis de Ensueño', 1, 'Desayuno- ', 18500.00, 'Cordoba Capital'),
(15, 'Hotel', 'Nirvana Dreams', 1, 'Desayuno-  Almuerzo-  Cena', 26500.00, 'Cordoba Capital'),
(16, 'Hostel', 'Bohemian Rhapsody', 1, 'Desayuno- ', 20500.00, 'Mendoza Capital'),
(17, 'Hotel', 'Montaña Dorada', 1, 'Desayuno-  Cena', 23000.00, 'Mendoza Capital'),
(18, 'Hostel', 'Luna del Plata', 1, 'Desayuno-  Almuerzo-  Cena', 27500.00, 'Mendoza Capital'),
(19, 'Hotel', ' Montaña Magica', 1, 'Desayuno-  Cena', 22500.00, 'Mendoza Capital'),
(20, 'Departamento', 'Vistas Espectaculares', 1, 'Sin servicios disponibles', 10000.00, 'Mendoza Capital'),
(21, 'Departamento', 'Oasis de Ensueño', 1, 'Sin servicios disponibles', 7000.00, 'Mendoza Capital'),
(22, 'Hostel', 'Malon en el Sur', 1, 'Desayuno-  Cena', 31000.00, 'El Calafate'),
(23, 'Hotel', 'Horcas al Resplandor', 1, 'Desayuno-  Almuerzo-  Cena', 29500.00, 'El Calafate'),
(24, 'Hotel', 'V8 al Amanecer', 1, 'Desayuno- ', 27500.00, 'El Calafate'),
(25, 'Hotel', 'Almafuerte Poderoso', 1, 'Desayuno-  Almuerzo-  Cena', 36000.00, 'El Calafate'),
(26, 'Cabaña', 'Lorihen en la Naturaleza', 1, 'Desayuno- ', 40000.00, 'El Calafate'),
(27, 'Hotel', 'Modernidad Metropolitana', 1, 'Sin servicios disponibles', 15000.00, 'CABA'),
(28, 'Hostel', 'Ruta Viajera', 1, 'Sin servicios disponibles', 8000.00, 'Villa Carlos Paz'),
(29, 'Hostel', ' Estrellas en el Camino', 1, 'Desayuno- ', 10500.00, 'Villa Carlos Paz'),
(30, 'Cabaña', 'Río Encantado', 1, 'Desayuno- ', 17500.00, 'Villa Carlos Paz'),
(31, 'Cabaña', 'Arroyo Tranquilo', 1, ' Cena', 11500.00, 'Villa Carlos Paz'),
(32, 'Cabaña', 'O\'Connor en la Montaña', 1, 'Desayuno-  Cena', 21000.00, 'San Rafael'),
(33, 'Cabaña', 'Los Alamos', 1, 'Desayuno-  Cena', 14000.00, 'San Rafael'),
(34, 'Hostel', 'Corazon Nomada', 1, 'Sin servicios disponibles', 10000.00, 'San Rafael'),
(35, 'Departamento', 'Sol y Naturaleza', 1, 'Sin servicios disponibles', 9000.00, 'Gualeguaychu'),
(36, 'Hotel', 'Ciudad Encantada', 1, 'Desayuno- ', 18000.00, 'Gualeguaychu'),
(37, 'Hotel', 'Oasis de Ensueño', 1, 'Desayuno-  Cena', 18000.00, 'Gualeguaychu'),
(38, 'Cabaña', 'Campestres de Ensueño', 1, 'Sin servicios disponibles', 13000.00, 'Concordia'),
(39, 'Departamento', 'Jardines Secretos', 1, 'Sin servicios disponibles', 6000.00, 'Concordia'),
(40, 'Hostel', 'Bohemio Bajo las Estrella', 1, 'Sin servicios disponibles', 9000.00, 'Concordia'),
(41, 'Cabaña', 'Susurros del Río', 1, ' Cena', 10000.00, 'Colon'),
(42, 'Departamento', ' Sueños Compartidos', 1, 'Sin servicios disponibles', 6000.00, 'Colon'),
(43, 'Cabaña', 'Los Palmares', 1, 'Desayuno-  Cena', 18000.00, 'Colon'),
(44, 'Hotel', 'Valles y Quebradas', 1, 'Desayuno- ', 20500.00, 'Salta Capital'),
(45, 'Hotel', 'Salta del Alma', 1, 'Desayuno-  Cena', 21000.00, 'Salta Capital'),
(46, 'Hotel', ' Oasis en el Norte', 1, 'Desayuno-  Almuerzo-  Cena', 24500.00, 'Salta Capital'),
(47, 'Hotel', 'Tres Fronteras', 1, 'Desayuno-  Cena', 20000.00, 'Puerto iguazu'),
(48, 'Cabaña', 'Cataratas del Descanso', 1, 'Desayuno-  Almuerzo-  Cena', 31000.00, 'Puerto iguazu'),
(49, 'Departamento', 'Encuentro Misionero', 1, 'Sin servicios disponibles', 16000.00, 'Posadas'),
(50, 'Hotel', 'A Orillas del Parana', 1, 'Desayuno- ', 19000.00, 'Posadas'),
(51, 'Cabaña', 'Selva Encantada', 1, 'Desayuno- ', 25000.00, 'Puerto iguazu'),
(52, 'Hotel', 'Amanecer en Iguazú', 1, 'Desayuno-  Cena', 28500.00, 'Puerto iguazu'),
(53, 'Departamento', 'Serenidad Costera', 1, 'Sin servicios disponibles', 20000.00, 'Rio Gallegos'),
(54, 'Hotel', 'Led Zeppelin\'s Haven', 1, 'Desayuno- ', 24000.00, 'Rio Gallegos'),
(55, 'Hotel', 'Ríos de Hielo', 1, 'Desayuno- ', 21500.00, 'Rio Gallegos'),
(56, 'Hotel', 'Vista Panorámica', 1, 'Desayuno- ', 28500.00, 'Bariloche'),
(57, 'Hotel', 'Aurora en el Lago', 1, 'Desayuno-  Cena', 30000.00, 'Bariloche'),
(58, 'Cabaña', 'Pino y Cedro', 1, 'Desayuno-  Almuerzo-  Cena', 40000.00, 'Bariloche'),
(59, 'Cabaña', 'Río Encantado', 1, 'Desayuno- ', 25500.00, 'Bariloche'),
(60, 'Hostel', 'Hostel Villa', 1, 'Desayuno- Almuerzo- Cena', 18000.00, 'Villa la Angostura'),
(61, 'Hotel', 'Hotel Angostura', 1, 'Desayuno- Cena', 30000.00, 'Villa la Angostura'),
(62, 'Cabaña', 'Cabaña Patagonia', 1, 'Cena', 40000.00, 'Villa la Angostura'),
(63, 'Departamento', 'Apartamentos Bosque', 1, 'Desayuno- Cena', 11000.00, 'Villa la Angostura'),
(64, 'Hotel', 'Hotel Termal', 1, 'Desayuno- Almuerzo- Cena', 17500.00, 'Termas de Rio Hondo'),
(65, 'Hostel', 'Hostel Termal', 1, 'Cena', 8500.00, 'Termas de Rio Hondo'),
(66, 'Cabaña', 'Cabañas Relax', 1, 'Desayuno- Cena', 8500.00, 'Termas de Rio Hondo'),
(67, 'Departamento', 'Apartamentos Aqua', 1, 'Sin servicios disponibles', 6000.00, 'Termas de Rio Hondo'),
(68, 'Hotel', 'Hotel Rosario', 1, 'Desayuno- Cena', 8000.00, 'Rosario'),
(69, 'Hostel', 'Hostel Ciudad', 1, 'Desayuno- Almuerzo- Cena', 5000.00, 'Rosario'),
(70, 'Cabaña', 'Cabañas Río', 1, 'Cena', 7000.00, 'Rosario'),
(71, 'Departamento', 'Apartamentos Rosas', 1, 'Desayuno- Cena', 9500.00, 'Rosario'),
(72, 'Hostel', 'Hostel Punta', 1, 'Desayuno- Almuerzo- Cena', 4000.00, 'La Punta'),
(73, 'Hotel', 'Hotel La Punta', 1, 'Desayuno- Cena', 17500.00, 'La Punta'),
(74, 'Cabaña', 'Cabaña de la Sierra', 1, 'Cena', 6500.00, 'La Punta'),
(75, 'Departamento', 'Apartamentos Sol', 1, 'Sin servicios disponibles', 5500.00, 'La Punta'),
(76, 'Hotel', 'Hotel Capital', 1, 'Desayuno- Cena', 18500.00, 'San Lius Capital'),
(77, 'Hostel', 'Hostel San Luis', 1, 'Desayuno- Almuerzo- Cena', 9500.00, 'San Lius Capital'),
(78, 'Cabaña', 'Cabañas del Valle', 1, 'Cena', 13500.00, 'San Lius Capital'),
(79, 'Departamento', 'Apartamentos del Centro', 1, 'Desayuno- Cena', 9500.00, 'San Lius Capital'),
(80, 'Hostel', 'Hostel El Bolson', 1, 'Desayuno- Cena', 14500.00, 'El Bolson'),
(81, 'Hotel', 'Hotel Río Azul', 1, 'Desayuno- Almuerzo- Cena', 40000.00, 'El Bolson'),
(82, 'Cabaña', 'Cabañas Bosque Andino', 1, 'Cena', 45000.00, 'El Bolson'),
(83, 'Departamento', 'Apartamentos El Bosque', 1, 'Sin servicios disponibles', 16000.00, 'El Bolson'),
(84, 'Hotel', 'Hotel Neuquen', 1, 'Desayuno- Cena', 19000.00, 'Ciudad de Neuquen'),
(85, 'Hostel', 'Hostel Capital', 1, 'Desayuno- Almuerzo- Cena', 9500.00, 'Ciudad de Neuquen'),
(86, 'Cabaña', 'Cabañas Neuquinas', 1, 'Cena', 17500.00, 'Ciudad de Neuquen'),
(87, 'Departamento', 'Apartamentos del Río', 1, 'Desayuno- Cena', 11500.00, 'Ciudad de Neuquen'),
(88, 'Hotel', 'Hotel de las Grutas', 1, 'Desayuno- Cena', 18000.00, 'Grutas'),
(89, 'Hostel', 'Hostel Costero', 1, 'Desayuno- Almuerzo- Cena', 11500.00, 'Grutas'),
(90, 'Cabaña', 'Cabañas del Mar', 1, 'Cena', 16500.00, 'Grutas'),
(91, 'Departamento', 'Apartamentos Grutas', 1, 'Sin servicios disponibles', 6000.00, 'Grutas'),
(92, 'Hotel', 'Hotel del Río', 1, 'Desayuno- Cena', 40000.00, 'Montevideo'),
(93, 'Hostel', 'Hostel de la Playa', 1, 'Desayuno- Almuerzo- Cena', 12500.00, 'Montevideo'),
(94, 'Cabaña', 'Cabañas Montevideanas', 1, 'Cena', 11500.00, 'Montevideo'),
(95, 'Departamento', 'Apartamentos Montevideo', 1, 'Desayuno- Cena', 9500.00, 'Montevideo'),
(96, 'Hotel', 'Hotel Histórico', 1, 'Desayuno- Cena', 17000.00, 'Colonia de Sacramento'),
(97, 'Hostel', 'Hostel Colonia', 1, 'Desayuno- Almuerzo- Cena', 10500.00, 'Colonia de Sacramento'),
(98, 'Cabaña', 'Cabañas de Colonia', 1, 'Cena', 9500.00, 'Colonia de Sacramento'),
(99, 'Departamento', 'Apartamentos Colonia', 1, 'Sin servicios disponibles', 6000.00, 'Colonia de Sacramento'),
(100, 'Hotel', 'Hotel del Este', 1, 'Desayuno- Cena', 40000.00, 'Punta del Este'),
(101, 'Hostel', 'Hostel Playa', 1, 'Desayuno- Almuerzo- Cena', 15500.00, 'Punta del Este'),
(102, 'Cabaña', 'Cabañas Esteñas', 1, 'Cena', 21500.00, 'Punta del Este'),
(103, 'Departamento', 'Apartamentos Punta', 1, 'Desayuno- Cena', 9500.00, 'Punta del Este'),
(104, 'Hotel', 'Hotel Tucuman', 1, 'Desayuno- Cena', 18000.00, 'Tucuman Capital'),
(105, 'Hostel', 'Hostel Tucuman', 1, 'Desayuno- Almuerzo- Cena', 5500.00, 'Tucuman Capital'),
(106, 'Cabaña', 'Cabañas Tucumanas', 1, 'Cena', 13500.00, 'Tucuman Capital'),
(107, 'Departamento', 'Apartamentos Tucuman', 1, 'Sin servicios disponibles', 6000.00, 'Tucuman Capital');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `idCiudad` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `pais` varchar(15) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `provincia` varchar(30) NOT NULL,
  `temAlta` date NOT NULL,
  `temMedia` date NOT NULL,
  `temBaja` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`idCiudad`, `nombre`, `pais`, `estado`, `provincia`, `temAlta`, `temMedia`, `temBaja`) VALUES
(1, 'Cordoba Capital', 'Argentina', 1, 'Cordoba', '2000-01-01', '2000-09-01', '2000-05-01'),
(4, 'Mendoza Capital', 'Argentina', 1, 'Mendoza', '2000-01-01', '2000-09-01', '2000-05-01'),
(5, 'El Calafate', 'Argentina', 1, 'Santa Cruz', '2000-05-01', '2000-01-01', '2000-09-01'),
(6, 'CABA', 'Argentina', 1, 'Buenos Aires', '2000-05-01', '2000-01-01', '2000-09-01'),
(7, 'Mar del Plata', 'Argentina', 1, 'Buenos Aires', '2000-01-01', '2000-09-01', '2000-05-01'),
(8, 'Bahia Blanca', 'Argentina', 1, 'Buenos Aires', '2000-05-01', '2000-01-01', '2000-09-01'),
(9, 'Villa Carlos Paz', 'Argentina', 1, 'Cordoba', '2000-01-01', '2000-09-01', '2000-05-01'),
(10, 'San Rafael', 'Argentina', 1, 'Mendoza', '2000-01-01', '2000-09-01', '2000-05-01'),
(11, 'Gualeguaychu', 'Argentina', 1, 'Entre Rios', '2000-01-01', '2000-09-01', '2000-05-01'),
(12, 'Concordia', 'Argentina', 1, 'Entre Rios', '2000-01-01', '2000-09-01', '2000-05-01'),
(13, 'Colon', 'Argentina', 1, 'Entre Rios', '2000-01-01', '2000-09-01', '2000-05-01'),
(14, 'Salta Capital', 'Argentina', 1, 'Salta', '2000-01-01', '2000-09-01', '2000-05-01'),
(15, 'Puerto iguazu', 'Argentina', 1, 'Misiones', '2000-01-01', '2000-09-01', '2000-05-01'),
(16, 'Posadas', 'Argentina', 1, 'Misiones', '2000-01-01', '2000-09-01', '2000-05-01'),
(17, 'Rio Gallegos', 'Argentina', 1, 'Santa Cruz', '2000-05-01', '2000-01-01', '2000-09-01'),
(18, 'Bariloche', 'Argentina', 1, 'Rio Negro', '2000-05-01', '2000-01-01', '2000-09-01'),
(19, 'Villa la Angostura', 'Argentina', 1, 'Neuquen', '2000-05-01', '2000-01-01', '2000-09-01'),
(20, 'Termas de Rio Hondo', 'Argentina', 1, 'Santiago del estero', '2000-05-01', '2000-01-01', '2000-09-01'),
(21, 'Rosario', 'Argentina', 1, 'Santa Fe', '2000-05-01', '2000-01-01', '2000-09-01'),
(22, 'La Punta', 'Argentina', 1, 'San Lius', '2000-05-01', '2000-01-01', '2000-09-01'),
(23, 'San Lius Capital', 'Argentina', 1, 'San Lius', '2000-05-01', '2000-01-01', '2000-09-01'),
(24, 'El Bolson', 'Argentina', 1, 'Rio Negro', '2000-05-01', '2000-01-01', '2000-09-01'),
(25, 'Ciudad de Neuquen', 'Argentina', 1, 'Neuquen', '2000-05-01', '2000-01-01', '2000-09-01'),
(26, 'Grutas', 'Argentina', 1, 'Rio negro', '2000-01-01', '2000-09-01', '2000-05-01'),
(27, 'Montevideo', 'Uruguay', 1, 'Montevideo', '2000-01-01', '2000-09-01', '2000-05-01'),
(28, 'Colonia de Sacramento', 'Uruguay', 1, 'Colonia', '2000-01-01', '2000-09-01', '2000-05-01'),
(29, 'Punta del Este', 'Uruguay', 1, 'Maldonado', '2000-01-01', '2000-09-01', '2000-05-01'),
(30, 'Tucuman Capital', 'Argentina', 1, 'Tucuman', '2000-01-01', '2000-09-01', '2000-05-01'),
(31, 'La Plata', 'La Plata', 1, 'Buenos Aires', '2000-05-01', '2000-01-01', '2000-09-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paquete`
--

CREATE TABLE `paquete` (
  `idPaquete` int(11) NOT NULL,
  `idOrigen` int(11) NOT NULL,
  `idPasaje` int(11) NOT NULL,
  `idAlojamiento` int(11) NOT NULL,
  `idDestino` int(11) NOT NULL,
  `fechaIn` date NOT NULL,
  `fechaOut` date NOT NULL,
  `email` varchar(30) NOT NULL,
  `monto` double(11,2) NOT NULL,
  `cantPasajeros` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paquete`
--

INSERT INTO `paquete` (`idPaquete`, `idOrigen`, `idPasaje`, `idAlojamiento`, `idDestino`, `fechaIn`, `fechaOut`, `email`, `monto`, `cantPasajeros`) VALUES
(1, 6, 42, 74, 22, '2023-10-29', '2023-10-31', 'alan@ulp.com.ar', 48000.00, 1),
(2, 6, 37, 47, 15, '2024-01-01', '2024-01-11', 'alan@ulp.com.ar', 884000.00, 2),
(3, 1, 31, 35, 11, '2023-10-30', '2023-10-31', 'alan@ulp.com.ar', 117300.00, 3),
(4, 6, 39, 78, 23, '2024-06-01', '2024-06-15', 'prueba@gmail.com', 336700.00, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasaje`
--

CREATE TABLE `pasaje` (
  `idPasaje` int(11) NOT NULL,
  `tipoTransporte` varchar(20) NOT NULL,
  `importe` double(11,2) NOT NULL,
  `origen` varchar(35) NOT NULL,
  `destino` varchar(35) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pasaje`
--

INSERT INTO `pasaje` (`idPasaje`, `tipoTransporte`, `importe`, `origen`, `destino`, `estado`) VALUES
(1, 'Avion', 95000.00, 'Mendoza Capital', 'El Calafate', 1),
(2, 'Avion', 60000.00, 'El Calafate', 'Cordoba Capital', 1),
(3, 'Tren', 15000.00, 'CABA', 'Mendoza Capital', 1),
(4, 'Omnibus', 20000.00, 'Cordoba Capital', 'CABA', 1),
(5, 'Tren', 15000.00, 'Cordoba Capital', 'CABA', 1),
(6, 'Omnibus', 25000.00, 'Mendoza Capital', 'El Calafate', 1),
(7, 'Tren', 15000.00, 'Mendoza Capital', 'Cordoba Capital', 1),
(8, 'Avion', 90000.00, 'El Calafate', 'Mendoza Capital', 1),
(10, 'Avion', 70000.00, 'CABA', 'El Calafate', 1),
(11, 'Omnibus', 25000.00, 'CABA', 'Mar del Plata', 1),
(12, 'Omnibus', 34000.00, 'CABA', 'Bahia Blanca', 1),
(13, 'Omnibus', 15000.00, 'Mar del Plata', 'Bahia Blanca', 1),
(14, 'Avion', 80000.00, 'Mar del Plata', 'Mendoza Capital', 1),
(15, 'Omnibus', 25000.00, 'Mar del Plata', 'CABA', 1),
(16, 'Buquebus', 25000.00, 'CABA', 'Montevideo', 1),
(17, 'Omnibus', 25000.00, 'Rosario', 'Montevideo', 1),
(18, 'Omnibus', 25000.00, 'Gualeguaychu', 'Montevideo', 1),
(19, 'Omnibus', 25000.00, 'Concordia', 'Montevideo', 1),
(20, 'Omnibus', 25000.00, 'Colon', 'Montevideo', 1),
(21, 'Omnibus', 25000.00, 'Colon', 'Colonia de Sacramento', 1),
(22, 'Omnibus', 25000.00, 'Concordia', 'Colonia de Sacramento', 1),
(23, 'Omnibus', 25000.00, 'Gualeguaychu', '	\nColonia de Sacramento', 1),
(24, 'Omnibus', 25000.00, 'Rosario', 'Colonia de Sacramento', 1),
(25, 'Omnibus', 35000.00, 'Rosario', 'Punta del Este', 1),
(26, 'Omnibus', 20000.00, 'Rosario', 'Concordia', 1),
(27, 'Omnibus', 20000.00, 'Rosario', 'Colon', 1),
(28, 'Omnibus', 20000.00, 'Rosario', 'Gualeguaychu', 1),
(29, 'Omnibus', 20000.00, 'Rosario', 'Villa Carlos Paz', 1),
(30, 'Omnibus', 20000.00, 'Rosario', 'Cordoba Capital', 1),
(31, 'Omnibus', 25000.00, 'Cordoba Capital', 'Gualeguaychu', 1),
(32, 'Omnibus', 35000.00, 'Cordoba Capital', 'La Punta', 1),
(33, 'Omnibus', 20000.00, 'Mendoza Capital', 'La Punta', 1),
(34, 'Omnibus', 20000.00, 'Mendoza Capital', 'San Lius Capital', 1),
(35, 'Omnibus', 20000.00, 'Mendoza Capital', 'Ciudad de Neuquen', 1),
(36, 'Omnibus', 30000.00, 'Mendoza Capital', 'El Bolson', 1),
(37, 'Avion', 70000.00, 'CABA', 'Puerto iguazu', 1),
(38, 'Avion', 70000.00, 'CABA', 'Salta Capital', 1),
(39, 'Avion', 70000.00, 'CABA', 'San Lius Capital', 1),
(40, 'Avion', 70000.00, 'CABA', 'Bariloche', 1),
(41, 'Avion', 70000.00, 'CABA', 'Termas de Rio Hondo', 1),
(42, 'Omnibus', 35000.00, 'CABA', 'La Punta', 1),
(43, 'Omnibus', 35000.00, 'La Punta', 'Cordoba Capital', 1),
(44, 'Omnibus', 23000.00, 'La Punta', 'Mendoza Capital', 1),
(45, 'Omnibus', 25000.00, 'La Punta', 'San Rafael', 1),
(46, 'Omnibus', 35000.00, 'La Punta', 'Gualeguaychu', 1),
(47, 'Combi', 10000.00, 'La Punta', 'San Lius Capital', 1),
(48, 'Omnibus', 15000.00, 'La Punta', 'San Lius Capital', 1),
(49, 'Omnibus', 30000.00, 'La Punta', 'El Bolson', 1),
(50, 'Omnibus', 30000.00, 'La Punta', 'Ciudad de Neuquen', 1),
(51, 'Omnibus', 30000.00, 'La Punta', 'Termas de Rio Hondo', 1),
(52, 'Omnibus', 33000.00, 'La Punta', 'Salta Capital', 1),
(53, 'Omnibus', 33000.00, 'La Punta', 'Tucuman Capital', 1);

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
  MODIFY `idAlojamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=108;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `idCiudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `paquete`
--
ALTER TABLE `paquete`
  MODIFY `idPaquete` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  MODIFY `idPasaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

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
