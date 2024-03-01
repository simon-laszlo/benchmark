#!/bin/bash

declare -A language0=(
  [program]="kotlin - java $(java -version 2>&1 | head -n1 | cut -d ' ' -f3 | tr -d '"')"
  [directory]="../../java/kotlin_spring"
  [build]="./gradlew clean build"
  [exec]="java -jar ./build/libs/kotlin_spring-0.0.1-SNAPSHOT.jar &"
)

declare -A language1=(
  [program]="node $(node -v) (express) PM2 6 threads"
  [directory]="."
  [build]="npm i"
  [exec]="NODE_ENV=production ./node_modules/.bin/pm2 start -i 6 src/main.js &"
  [stop]="NODE_ENV=production ./node_modules/.bin/pm2 stop main"
)

table=""

declare -n language
for language in ${!language@}; do
  if [[ -z "${language[stop]+unset}" ]]; then
    echo "unset"
  else
    echo "${language[stop]}"
  fi
done

echo "$table"
