CREATE TABLE Persona (
    per_id INT PRIMARY KEY IDENTITY(1,1),
    per_nombre VARCHAR(100) NOT NULL,
    per_apellido_paterno VARCHAR(100) NOT NULL,
    per_apellido_materno VARCHAR(100) NOT NULL,
    per_genero INT NOT NULL,
    per_direccion VARCHAR(255) NOT NULL,
    per_telefono VARCHAR(20) NOT NULL,
    per_correo VARCHAR(100) NOT NULL,
    per_estado TINYINT DEFAULT 1
);

INSERT INTO Persona (
    per_nombre,
    per_apellido_paterno,
    per_apellido_materno,
    per_genero,
    per_direccion,
    per_telefono,
    per_correo,
    per_estado
)
VALUES (
    'Juan',
    'Perez',
    'Gomez',
    1, 
    'Av. Principal 123, Lima',
    '987654321',
    'juan.perez@example.com',
    1
);