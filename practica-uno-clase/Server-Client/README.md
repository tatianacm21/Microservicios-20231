Enunciado:
  Punto A.
  Cree una aplicación java que contenga un servidor socket que al recibir una
  conexión con el mensaje CLIENTE <nombre> conteste con el mensaje HOLA
  <nombre>.

  Punto B.
  Cree un Dockerfile para un contenedor capaz de realizar:
    - Pueda crear un jar ejecutable a partir de su proyecto java.
    - Pueda crear una imagen con jar de su proyecto y se pueda verificar el 
      funcionamiento de la aplicación.

  Punto C.
  Modifique el programa para que compare el valor de la variable de entorno
  ROOT con el <nombre> que envía el cliente, si el nombre coincide con el valor
  de la variable de entorno ROOT en logar de contestar con el mensaje HOLA
  <nombre> debe contestar con el mensaje HOLA ADMINISTRADOR

  Punto D.
  Modifique el Dockerfile para que pueda asignarse un valor a dicha variable de
  entorno y realice las pruebas que verifiquen su correcto funcionamiento.

Solución:
Para el anterior enunciado, se realizó por medio de dos proyectos java, en donde,
uno contenía la parte del servidor, y el otro lo concerniente al cliente. Luego,
cada proyecto tenía su propio Dockerfile, con las especificaciones necesarias para
que al correrlo pudiera crear el jar, y en el caso del servidor colocar a correr 
la aplicación.

Como parte de la solución, se implementó un compose capaz de hacer la conexión entre
los dos contenedores (construyendo la imagen en primera instancia) por la red que 
crea este automaticamente, y así poder enviar la información necesario. Otro aspecto 
a resaltar, es que las variables de entorno se encuentran en el compose, y su 
modificación debe ser desde allí.

Ahora para correr de manera satisfactoria la solución se debe:

   En una terminal correr el siguiente comando
    ----------------------------
   | docker-compose up --build  |
    ----------------------------
   
   En otra terminal de forma iterativa con el contenedor del cliente 
    ------------------------
   | java -jar client.jar   |
    ------------------------
    Esto se debe realizar de está forma ya que esta aplicación le pide un mensaje por
    consola al cliente de manera directa, y este debe escribirlo para enviarselo al 
    servidor
    

   