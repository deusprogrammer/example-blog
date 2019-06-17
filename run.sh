#!/bin/bash
cd example-blog-ui-react
npm start &
cd ../example-blog-service-springboot/
./gradlew build
cd ../
docker-compose up --build