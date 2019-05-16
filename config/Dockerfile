FROM amazoncorretto:8
MAINTAINER https://github.com/borisskert/spring-cloud

WORKDIR /opt/springcloud
COPY ./target/config-*.jar .

EXPOSE 8888

CMD exec $JAVA_HOME/bin/java $JAVA_OPTS -jar /opt/springcloud/config-*.jar
