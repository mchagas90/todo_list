CREATE TABLE IF NOT EXISTS items (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `title` varchar(255),
   `description` varchar(255),
   PRIMARY KEY (`id`)
 );

 ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY 'toor';
