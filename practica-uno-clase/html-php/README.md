Enunciado:
Cree una página html con un formulario que solicite su nombre e identificación
y envié la información mediante POST a una página php que reciba dicha
información y genere un mensaje de bienvenida a partir de dichos datos.

Solución
Conforme a lo solicitado, se crea un Dockerfile que cumple con las caracteristicas,
además de dos archivos adicionales, el primero .html para el formulario, y 
el segundo .php para el mensaje de recibido.

Ahora bien, para ejecutar el Dockerfile se hace uso de:

    --------------------------------------------------------------
   |  docker build -t html-php .                                  |
   | docker run -dit --name my-app-html-php -p 8080:80 html-php   |
    --------------------------------------------------------------
   