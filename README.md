# Workshop-Spring-Boot-Events

## Ejercicio: Desarrollo de una API RESTful para Sistema de Registro de Eventos
### Objetivo:
Crear una API RESTful que gestione un sistema de registro de eventos. La API 
permitirá a los usuarios realizar operaciones básicas de CRUD (Crear, Leer, 
Actualizar, Eliminar) sobre la tabla Eventos.
### Requisitos de la API:

### Modelo de Datos:
La tabla Eventos deberá incluir los siguientes campos:

 id (identificador único del evento, tipo STRING y generado UUID)

 nombre (nombre del evento, tipo cadena)

 fecha (fecha del evento, tipo fecha)

 ubicacion (ubicación del evento, tipo cadena)

 capacidad (capacidad máxima de asistentes, tipo entero)

### Endpoints de la API:

 Crear evento: Un endpoint para añadir un nuevo evento al sistema.

 Obtener eventos: Un endpoint para listar todos los eventos registrados.

 Obtener evento por ID: Un endpoint para obtener detalles de un evento 
específico por su ID.

 Actualizar evento: Un endpoint para actualizar la información de un evento 
existente.

 Eliminar evento: Un endpoint para eliminar un evento del sistema

Todos los endpoints se deben probar en una coleccion de Postman guardando 
Variables atomaticamente. 
### Desafío Adicional:
Implementar validaciones para asegurar que la fecha del evento no sea en el 
pasado y que la capacidad no sea negativa.
Implementa paginacion para el endpoint de obtener todos los eventos
