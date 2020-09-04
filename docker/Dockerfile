FROM gcr.io/distroless/java:11-debug
MAINTAINER Vivek <thevivek2@gmail.com>

COPY --chown=nobody:nobody target/demo-matrix.jar /app/app.jar

CMD ["app/app.jar"]
USER  65534
