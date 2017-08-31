FROM bitnami/minideb:jessie
MAINTAINER https://git.adorsys.de/bsk/springcloud

# ------------------- Install Oracle Java JDK -------------------

ENV JAVA_VERSION=8
ENV JAVA_UPDATE=131
ENV JAVA_BUILD=b11
ENV PATH_HASH=d54c1d3a095b4ff2b6607d096fa80163
ENV JAVA_HOME="/usr/lib/jvm/java-8-oracle"

ENV JAVA_OPTS ""

RUN apt-get update
RUN apt-get install -y wget \
            unzip \
            libzip2 \
            libsnappy1 \
            libssl-dev

RUN set -x &&\
    cd /tmp && \
    wget --header "Cookie: oraclelicense=accept-securebackup-cookie;" \
                  "http://download.oracle.com/otn-pub/java/jdk/${JAVA_VERSION}u${JAVA_UPDATE}-${JAVA_BUILD}/${PATH_HASH}/jre-${JAVA_VERSION}u${JAVA_UPDATE}-linux-x64.tar.gz" &&\
    tar -xzf "jre-${JAVA_VERSION}u${JAVA_UPDATE}-linux-x64.tar.gz" &&\
    mkdir -p /usr/lib/jvm &&\
    mv "jre1.${JAVA_VERSION}.0_${JAVA_UPDATE}" "/usr/lib/jvm/java-${JAVA_VERSION}-oracle" &&\
    rm "jre-${JAVA_VERSION}u${JAVA_UPDATE}-linux-x64.tar.gz"

ENV PATH="$JAVA_HOME/bin:${PATH}"

RUN set -x && rm -rf /var/lib/apt/lists/*

# ---------------------------------------------------------------

WORKDIR /opt/springcloud
COPY ./target/ribbon-*.jar .

EXPOSE 8761

CMD exec $JAVA_HOME/bin/java $JAVA_OPTS -jar /opt/springcloud/ribbon-*.jar
