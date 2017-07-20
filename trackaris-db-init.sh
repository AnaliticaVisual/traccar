docker service create --name trackaris-db --replicas 1 \
    --env MYSQL_DATABASE=traccar \
    --env MYSQL_PASSWORD='' \
    --env MYSQL_USER=track \
    --env MYSQL_ROOT_PASSWORD='' \
    --network trackaris_net \
    -p 3306:3306 \
    --mount type=volume,volume-driver=cloudstor:aws,source={{.Service.Name}}-{{.Task.Slot}}-vol,destination=/var/lib/mysql,volume-opt=size=25 \
    mysql:5.6.30