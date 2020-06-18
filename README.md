# microservice
1) CalegoryService , ProductService

2. Build the services with maven separately from DOS Prompt

mvn clean
mvn dependency:copy-dependencies
mvn clean install -Dmaven.test.skip=true
Testing:

java -jar CalegoryService-0.0.1-
