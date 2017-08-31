FROM adorsys/openjdk-jre-base:8
MAINTAINER https://git.adorsys.de/bsk/springcloud

WORKDIR /opt/springcloud
COPY ./target/ribbon-*.jar .

EXPOSE 8761

CMD exec $JAVA_HOME/bin/java $JAVA_OPTS -jar /opt/springcloud/ribbon-*.jar
