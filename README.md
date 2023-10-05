## Ingenieria de software

En este repositorio se encuentran archivos para el sistema de gestion de turnos.

-El archivo "conexion" tiene el codigo para hacer la conexion entre la base de datos (mariadb) y java.
-El archivo "registro" cuenta con una instancia de la conexion para validar de que se haya hecho correctamente.


Dependencias mysql- maven:
Van colocadas dentro del proyecto en el archivo: pom
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependencies>
  
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>
  
</dependencies>

