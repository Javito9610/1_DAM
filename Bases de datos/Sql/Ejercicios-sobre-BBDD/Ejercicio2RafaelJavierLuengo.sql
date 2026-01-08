CREATE DATABASE mascotass;
USE mascotass;
CREATE TABLE animales(
id_animal  INT PRIMARY KEY AUTO_INCREMENT,
nombre  varchar(50) NOT NULL,
especie  varchar(50) NOT NULL,
raza  varchar(50),
sexo  varchar(1) NOT NULL CHECK(sexo IN ('M','F')),
ubicacion  varchar(50),
estado  varchar(50)
);
INSERT INTO animales(nombre, especie, raza, sexo, ubicacion, estado)
VALUES
('Max', 'Perro', 'Labrador', 'M', 'Madrid', 'Adoptado'),
('Luna', 'Gato', 'Siames', 'F', 'Barcelona', 'Disponible'),
('Charlie', 'Perro', 'Bulldog', 'M', 'Sevilla', 'En tratamiento'),
('Mimi', 'Gato', 'Persa', 'F', 'Valencia', 'Adoptado'),
('Rocky', 'Perro', 'Beagle', 'M', 'Bilbao', 'Disponible'),
('Bella', 'Conejo', 'Enano', 'F', 'Granada', 'En tratamiento'),
('Simba', 'León', 'Africano', 'M', 'Zoológico de Madrid', 'Salvado'),
('Coco', 'Loro', 'Amazona', 'M', 'Barcelona', 'Adoptado'),
('Nina', 'Perro', 'Golden Retriever', 'F', 'Valencia', 'Disponible'),
('Toby', 'Gato', 'Común Europeo', 'M', 'Murcia', 'Adoptado'),
('Kira', 'Perro', 'Husky Siberiano', 'F', 'Zaragoza', 'Perdido'),
('Leo', 'Gato', 'Angora', 'M', 'Salamanca', 'Disponible');
SELECT*FROM animales;
