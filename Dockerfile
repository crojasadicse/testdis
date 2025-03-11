FROM --platform=linux/x86_64  openjdk:17-jdk-alpine 

# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring

WORKDIR /app

ENV PORT 8081
# ENV JAVA_OPTS  "-Dspring.profiles.active=dev -Deureka.client.serviceUrl.defaultZone=http://mcsv-eureka-server:8761/eureka"
# ENV JAVA_OPTS  "-Dspring.profiles.active=devthink -Deureka.client.serviceUrl.defaultZone=http://mcsv-eureka-server:8761/eureka"
# ENV JAVA_OPTS  "-Dspring.profiles.active=mcsv-developer"
# ENV EUREKA_SERVER="http://mcsv-eureka-server:8761/eureka"

EXPOSE $PORT
COPY target/*.jar /app/disp-0.0.1-SNAPSHOT.jar 
# ENTRYPOINT ["java ${JAVA_OPTS}","-jar","/app/security-server-1.0.1.jar"]
# ENTRYPOINT ["java",$JAVA_OPTS,"-jar","/app/security-server-1.0.1.jar","--eureka.client.serviceUrl.defaultZone=${EUREKA_SERVER}"]
ENTRYPOINT exec java -jar /app/disp-0.0.1-SNAPSHOT.jar 