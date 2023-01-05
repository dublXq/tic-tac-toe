#!/usr/bin/env sh

java -jar ${project.build.finalName}.jar
echo "press to continue..."
read -r test

