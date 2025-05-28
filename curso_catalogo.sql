INSERT INTO usuarios (Id, run, nombre, apellido, rol, correo, contraseña) VALUES (1, '12.345.678-9', 'Laura', 'Gómez', 'Administrador', 'laura.gomez@email.com', 'pass1234'), (2, '23.456.789-0', 'Carlos', 'Pérez', 'Usuario', 'carlos.perez@email.com', 'qwerty5678'), (3, '34.567.890-1', 'María', 'López', 'Moderador', 'maria.lopez@email.com', 'abcdefgh'), (4, '45.678.901-2', 'Juan', 'Martínez', 'Usuario', 'juan.martinez@email.com', '1234abcd'), (5, '56.789.012-3', 'Sofía', 'Ramírez', 'Administrador', 'sofia.ramirez@email.com', 'password!');

INSERT INTO `curso_catalogo` (`activo`, `duracion_horas`, `descripcion`, `categoria`, `nombre`,`cupos_Disponible`, `coste`) VALUES
(b'0', 40, 'Juegos AAA', 'Juegos', 'Juegos A gran escala',20,20000),
(b'1', 35, 'Fundamentos de Inteligencia Artificial', 'Tecnología', 'Introducción a IA',20,20000),
(b'1', 50, 'Diseño de interfaces de usuario', 'Diseño', 'UI/UX para aplicaciones',20,25000),
(b'0', 40, 'Producción musical con herramientas digitales', 'Arte', 'Composición digital',20,27000),
(b'1', 45, 'Gestión de bases de datos con MySQL', 'Tecnología', 'Administración de DB',20,24000),
(b'1', 30, 'Marketing digital y redes sociales', 'Negocios', 'Estrategias de crecimiento',20,20000),
(b'0', 55, 'Programación en Python desde cero', 'Programación', 'Python básico',20,20000),
(b'1', 48, 'Seguridad informática y hacking ético', 'Tecnología', 'Ciberseguridad avanzada',20,20000),
(b'1', 25, 'Arte digital con Photoshop e Illustrator', 'Diseño', 'Ilustración digital',20,20000),
(b'0', 20,  'Creación de contenido para YouTube', 'Comunicación', 'YouTube para principiantes',20,20000),
(b'1', 60,  'Desarrollo de juegos AAA', 'Juegos', 'Creación de Juegos A gran escala',20,20000);

