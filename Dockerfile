FROM eclipse-temurin:25

COPY target/demo-distribution/demo/ /
EXPOSE 80 443

ENTRYPOINT /run.sh