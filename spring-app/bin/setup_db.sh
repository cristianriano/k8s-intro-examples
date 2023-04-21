
MYSQL_HOST=${MYSQL_HOST:-127.0.0.1}
MYSQL_USER=${MYSQL_USER:-user}
MYSQL_PORT=${MYSQL_PORT:-3307}
MYSQL_DATABASE=${MYSQL_DATABASE:-shopping_list}

mysql -u root -P $MYSQL_PORT -h $MYSQL_HOST -e "CREATE DATABASE IF NOT EXISTS $MYSQL_DATABASE"
mysql -u root -P $MYSQL_PORT -h $MYSQL_HOST -e "CREATE USER '$MYSQL_USER'@'%' IDENTIFIED BY ''"
mysql -u root -P $MYSQL_PORT -h $MYSQL_HOST -e "GRANT ALL ON $MYSQL_DATABASE.* to '$MYSQL_USER'@'%'"

mysql -u $MYSQL_USER -P $MYSQL_PORT -h $MYSQL_HOST $MYSQL_DATABASE \
  -e "CREATE TABLE IF NOT EXISTS shopping_items (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255) NOT NULL, PRIMARY KEY (id));"