FROM amazoncorretto:8
MAINTAINER https://github.com/borisskert/spring-cloud

WORKDIR /opt/springcloud
COPY ./target/ribbon-*.jar .

EXPOSE 8761

CMD exec $JAVA_HOME/bin/java $JAVA_OPTS -jar /opt/springcloud/ribbon-*.jar
