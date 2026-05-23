FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY . .

RUN chmod +x gradlew
RUN chmod +x build.sh
RUN chmod +x run.sh

RUN sh build.sh

EXPOSE 8000

CMD ["sh", "run.sh"]