#/bin/sh

git submodule update --init
cd aws-sdk-src/aws-sdk-java-v2
mvn clean install -P quick

