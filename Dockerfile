FROM openjdk:12

ADD target/ozelWedler.jar ozelWedler.jar
ENTRYPOINT ["java","-jar","ozelWedler.jar"]