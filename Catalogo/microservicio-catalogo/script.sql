CREATE DATABASE IF NOT EXISTS catalogo;
CREATE USER IF NOT EXISTS 'admin'@'%' IDENTIFIED BY 'admin';
GRANT ALL PRIVILEGES ON catalogo.* TO 'admin';
FLUSH PRIVILEGES;
USE catalogo;