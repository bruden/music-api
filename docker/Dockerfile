FROM maven:3.6.3-adoptopenjdk-8 as builder
COPY . /music
RUN apt-get update && \
    apt-get install sqlite -y && \
    apt-get install libsqlite3-dev -y && \
    apt-get install make -y && \
    mkdir /sqlite && \
    cd /sqlite && \
    sqlite3 sqlite.db < /music/sqlite.sql && \
    cd /music && \
    rm /usr/share/maven/conf/settings.xml && \
    mv ./docker/settings.xml /usr/share/maven/conf/settings.xml && \
    make build

FROM java:8
COPY --from=builder /sqlite/sqlite.db /music/data/sqlite/sqlite.db
COPY --from=builder /music/target/music-api.jar /music/music-api.jar
WORKDIR /music
CMD ["java", "-jar", "music-api.jar"]
