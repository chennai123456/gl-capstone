FROM maven:3.5.4-jdk-10

COPY . /build
RUN cd /build && mvn clean install && mkdir /Inventory && cp /build/target/Inventory*.jar /Inventory/app.jar

ENTRYPOINT [ "sh", "-c", "java -jar /Inventory/app.jar --spring.datasource.url=$DATABASE_URL --spring.datasource.username=$DATABASE_USER --spring.datasource.password=$DATABASE_PASSWORD" ]