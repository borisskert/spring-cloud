FROM adorsys/openjdk-jre-base:8
MAINTAINER https://git.adorsys.de/bsk/springcloud

WORKDIR /opt/springcloud
COPY ./target/discovery-client-*.jar .

EXPOSE 8080

CMD exec $JAVA_HOME/bin/java $JAVA_OPTS -jar /opt/springcloud/discovery-client-*.jar
