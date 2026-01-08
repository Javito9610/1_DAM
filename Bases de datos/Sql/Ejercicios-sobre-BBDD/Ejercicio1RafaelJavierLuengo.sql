CREATE DATABASE personal;
USE personal;
CREATE TABLE personas(
    id_persona INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    apellidos VARCHAR(100),
    direccion VARCHAR(255),
    poblacion VARCHAR(100),
    provincia VARCHAR(100),
    codigo_postal VARCHAR(10),
    telefono VARCHAR(10)
);
INSERT INTO personas (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono)
VALUES 
('Juan', 'Pérez García', 'Calle Mayor 1', 'Madrid', 'Madrid', '28001', '600123456'),
('Ana', 'López Ruiz', 'Avenida del Sol 2', 'Barcelona', 'Barcelona', '08002', '612345678'),
('Carlos', 'Gómez Sánchez', 'Calle Luna 3', 'Sevilla', 'Sevilla', '41003', '623456789'),
('Marta', 'Martínez Fernández', 'Plaza de la Estrella 4', 'Valencia', 'Valencia', '46004', '634567890'),
('Luis', 'Torres Díaz', 'Avenida de la Paz 5', 'Bilbao', 'Vizcaya', '48005', '645678901'),
('Elena', 'Santos Morales', 'Calle del Río 6', 'Granada', 'Granada', '18006', '656789012'),
('Pedro', 'Navarro López', 'Paseo del Bosque 7', 'Zaragoza', 'Zaragoza', '50007', '667890123'),
('Carmen', 'Blanco Ortega', 'Calle del Mar 8', 'Málaga', 'Málaga', '29008', '678901234'),
('Jorge', 'Castillo Ramírez', 'Calle de las Flores 9', 'Murcia', 'Murcia', '30009', '689012345'),
('Sara', 'Vidal Hernández', 'Avenida de las Ciencias 10', 'Salamanca', 'Salamanca', '37010', '690123456');
SELECT * FROM personas;
