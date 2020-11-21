protobuf-version=3.13.0
protoc-gen-grpc-java-version=1.33.1
version=0.1.0
pwd=$(shell pwd)

pb:
	./proto/protoc --plugin=protoc-gen-grpc-java=$(pwd)/proto/protoc-gen-grpc-java --proto_path=./src/main/java/team/burden/music/api/protos --grpc-java_out=./src/main/java --java_out=./src/main/java Grpc.proto
	./proto/protoc --proto_path=./src/main/java/team/burden/music/api/protos --java_out=./src/main/java Music.proto

build:
	mvn clean package -Dmaven.test.skip=true
	cd target && mv api-$(version).jar music-api.jar

docker:
	docker build -t music-api:$(version) -f ./docker/Dockerfile .
	docker tag music-api:$(version) music-api:latest

start:
	docker-compose -f ./docker-compose/docker-compose.yml up -d

stop:
	docker-compose -f ./docker-compose/docker-compose.yml down

end:
	docker-compose -f ./docker-compose/docker-compose.yml down -v

.PHONY: docker
