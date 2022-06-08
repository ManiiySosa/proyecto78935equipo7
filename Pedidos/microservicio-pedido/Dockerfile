from rrojano/jdk8
workdir /app
#expose 8080
#cmd ["/app/script.sh"]
add microservicio-pedido/app/tis-0.0.1-SNAPSHOT.jar /app/tis-0.0.1-SNAPSHOT.jar
#add microservicio-pedido/script.sh /app/script.sh
#run chmod 755 /app/script.sh
cmd java -jar -Dserver.port=$PORT tis-0.0.1-SNAPSHOT.jar
