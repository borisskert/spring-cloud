FROM amazoncorretto:11
MAINTAINER https://github.com/borisskert/spring-cloud

WORKDIR /opt/springcloud
COPY ./target/discovery-client.jar .

EXPOSE 8080

CMD exec $JAVA_HOME/bin/java $JAVA_OPTS -jar /opt/springcloud/discovery-client.jar
