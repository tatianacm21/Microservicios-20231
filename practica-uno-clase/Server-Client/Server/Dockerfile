FROM openjdk:8u111-jdk
RUN mkdir /opt/app/
COPY server/src/Server.java /opt/app/
RUN javac /opt/app/Server.java
RUN cp /opt/app/Server.class /
RUN jar cf server.jar Server.class 
RUN mv server.jar /opt/app/
RUN rm Server.class 
CMD ["java", "-cp","/opt/app/server.jar", "Server"]