FROM tomcat:8.5.38
COPY ./tomcat-users.xml  /usr/local/tomcat/conf/tomcat-users.xml
COPY ./context.xml  /usr/local/tomcat/webapp/manager/META-INF/context.xml
EXPOSE 8080
CMD ["catalina.sh", "run"]
