from rrojano/jdk8
workdir /app
#expose 8080
cmd ["/app/script.sh"]
run apt-get update
run apt-get install -y mariadb-server
add script.sql /app/script.sql
run /etc/init.d/mysql start; mysql < /app/script.sql
add app/Catalogo-0.0.1-SNAPSHOT.jar /app/Catalogo-0.0.1-SNAPSHOT.jar
add script.sh /app/script.sh
run chmod 755 /app/script.sh