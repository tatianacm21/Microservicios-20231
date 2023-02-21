FROM openjdk:8u111-jdk
RUN mkdir /opt/app/
COPY client/src/Client.java /opt/app/
RUN javac /opt/app/Client.java
RUN cp /opt/app/Client.class /
RUN jar cf client.jar Client.class 
RUN mv client.jar /opt/app/
RUN rm Client.class 
#CMD ["java", "-cp","/opt/app/client.jar", "Client"]
