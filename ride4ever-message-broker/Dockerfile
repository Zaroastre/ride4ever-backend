FROM openjdk:14-slim as build

WORKDIR /opt
RUN apt update
RUN apt install wget -y
RUN wget -c http://mirrors.advancedhosters.com/apache/activemq/5.16.3/apache-activemq-5.16.3-bin.tar.gz
RUN tar xzf apache-activemq-5.16.3-bin.tar.gz
RUN ln -s apache-activemq-5.16.3 activemq
RUN useradd activemq
RUN chown -RH activemq: /opt/activemq
COPY activemq.service /etc/systemd/system/
# RUN systemctl daemon-reload

ENTRYPOINT ["/opt/activemq/bin/activemq", "start"]
