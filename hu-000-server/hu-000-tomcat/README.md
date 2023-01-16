# 工程简介

# 延伸阅读

```shell

mvn package

cd /Users/husx/data/git/github/husxwy/SpringBoot-Labs/hu-000-server

cd hu-000-tomcat/target

java -jar hu-000-tomcat-1.0-SNAPSHOT.jar -Xms2g -Xmx2g -Xmn1g -XX:MaxMetaspaceSize=256m -Xss256k

wrk -t50 -c400 -d30s http://127.0.0.1:8080/hello

#-t50 参数，设置 50 并发线程。
#-c400 参数，设置 400 连接。
#-d30s 参数，设置执行 30s 的时长的 HTTP 请求。
```