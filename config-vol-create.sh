docker volume create trackaris-config --driver cloudstor:aws && \
docker run --rm -v trackaris-config:/tmp1 -v $(pwd):/tmp2 busybox cp /tmp2/traccar.xml /tmp1 && \
docker run --rm -v trackaris-config:/tmp busybox ls /tmp