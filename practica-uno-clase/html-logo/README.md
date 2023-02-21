Enunciado:
Cree una página html con mensaje de bienvenida y el logo de la universidad.
Cópiela en su contenedor y verifique que puede acceder a ella mediante un
navegador. De igual forma trate de acceder directamente al logo de la
universidad alojado en el contenedor por medio de su navegador.

Solución:
Como resultado final de realizar el proceso que se pidió con anterioridad,
te obtuvo un Dockerfile, el cual para que se ejecute se debe ingresar
por consola los siguientes comandos:

    --------------------------------------------------------------
   |  docker build -t html-logo .                                 |
   | docker run -dit --name my-app-html-logo -p 8080:80 html-logo |
    --------------------------------------------------------------
   