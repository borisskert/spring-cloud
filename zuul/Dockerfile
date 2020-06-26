FROM amazoncorretto:11
MAINTAINER https://github.com/borisskert/spring-cloud

WORKDIR /opt/springcloud
COPY ./target/zuul.jar .

EXPOSE 8081

CMD exec $JAVA_HOME/bin/java $JAVA_OPTS -jar /opt/springcloud/zuul.jar
