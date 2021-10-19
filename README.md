# replication
DB-replication 연습레포

# Master Slave
1. compose docker
``` docker-compose up -d ```

2. docker master network ip address paste
```
dokcer network ls
docker inspect {CONTAINER ID}
```
3. Approach slave container
```
docker ps
docker exec -it {SLAVE_CONTAINER_ID} bash
mysql -u root -p
```
4. slave setting
```
stop slave;


CHANGE MASTER TO 
MASTER_HOST='{master network ip address}', 
MASTER_USER='root', 
MASTER_PASSWORD='password', 
MASTER_LOG_FILE='mysql-bin.000001', 
MASTER_LOG_POS=0, 
GET_MASTER_PUBLIC_KEY=1;

start slave;

show slave status\G
```
