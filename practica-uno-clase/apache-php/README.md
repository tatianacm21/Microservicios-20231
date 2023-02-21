Enunciado:
Cree un contenedor con apache y php, para probar su funcionamiento cree una
página php.

Solución:
Como resultado final de realizar el proceso que se pidió con anterioridad,
te obtuvo un Dockerfile, el cual para que se ejecute se debe ingresar
por consola los siguientes comandos:

    -----------------------------------------------------------------
   |  docker build -t apache-php .                                   |
   | docker run -dit --name my-app-apache-php -p 8080:80 apache-php  |
    -----------------------------------------------------------------
   