#!/bin/bash

script_dir=$PWD

declare -A language0=(
  [program]="rust"
  [directory]="../../rust"
  [build]="cargo build --release"
  [exec]="./target/release/rust_mongo &"
)

declare -A language1=(
  [program]="$(go version | cut -d ' ' -f3)"
  [directory]="../go"
  [build]="go build -ldflags '-s -w' ."
  [exec]="GIN_MODE=release ./gin &"
)

declare -A language2=(
  [program]="node $(node -v) (express)"
  [directory]="../node/expressjs"
  [build]="npm i"
  [exec]="NODE_ENV=production node src/main.js &"
)

declare -A language3=(
  [program]="node $(node -v) (express) PM2 6 threads"
  [directory]="."
  [build]="npm i"
  [exec]="NODE_ENV=production ./node_modules/.bin/pm2 start -i 6 src/main.js &"
  [stop]="NODE_ENV=production ./node_modules/.bin/pm2 kill"
)

declare -A language4=(
  [program]="node $(node -v) (fastify)"
  [directory]="../fastify"
  [build]="npm i"
  [exec]="NODE_ENV=production node src/main.js &"
)

declare -A language5=(
  [program]="node $(node -v) (fastify) PM2 6 threads"
  [directory]="."
  [build]="npm i"
  [exec]="NODE_ENV=production ./node_modules/.bin/pm2 start -i 6 src/main.js &"
  [stop]="NODE_ENV=production ./node_modules/.bin/pm2 kill"
)

declare -A language6=(
  [program]="node $(node -v) (restana)"
  [directory]="../restana"
  [build]="npm i"
  [exec]="NODE_ENV=production node src/main.js &"
)

declare -A language7=(
  [program]="node $(node -v) (restana) PM2 6 threads"
  [directory]="."
  [build]="npm i"
  [exec]="NODE_ENV=production ./node_modules/.bin/pm2 start -i 6 src/main.js &"
  [stop]="NODE_ENV=production ./node_modules/.bin/pm2 kill"
)
declare -A language8=(
  [program]="kotlin - java $(java -version 2>&1 | head -n1 | cut -d ' ' -f3 | tr -d '"')"
  [directory]="../../java/kotlin_spring"
  [build]="./gradlew clean build"
  [exec]="java -jar ./build/libs/kotlin_spring-0.0.1-SNAPSHOT.jar &"
)

declare -A language9=(
  [program]="kotlin - native image java -$(java -version 2>&1 | head -n1 | cut -d ' ' -f3 | tr -d '"')"
  [directory]="."
  [build]="./gradlew clean nativeCompile"
  [exec]="./build/native/nativeCompile/demo &"
)

declare -A languageA=(
  [program]="spring VirtualThread java $(java -version 2>&1 | head -n1 | cut -d ' ' -f3 | tr -d '"')"
  [directory]="../openjdk_spring"
  [build]="./mvnw clean install"
  [exec]="java -jar ./target/openjdk_spring-0.0.1-SNAPSHOT.jar &"
)

declare -A languageB=(
  [program]="spring VirtualThread native $(java -version 2>&1 | head -n1 | cut -d ' ' -f3 | tr -d '"')"
  [directory]="."
  [build]="native-image -jar ./target/openjdk_spring-0.0.1-SNAPSHOT.jar"
  [exec]="./openjdk_spring-0.0.1-SNAPSHOT &"
)

declare -A languageC=(
  [program]="spring java $(java -version 2>&1 | head -n1 | cut -d ' ' -f3 | tr -d '"')"
  [directory]="../openjdk_spring"
  [build]="./mvnw clean install"
  [exec]="java -jar ./target/openjdk_spring-0.0.1-SNAPSHOT.jar --spring.thread-executor=platform &"
)

declare -A languageD=(
  [program]="spring native $(java -version 2>&1 | head -n1 | cut -d ' ' -f3 | tr -d '"')"
  [directory]="."
  [build]="native-image -jar ./target/openjdk_spring-0.0.1-SNAPSHOT.jar"
  [exec]="./openjdk_spring-0.0.1-SNAPSHOT --spring.thread-executor=platform &"
)

declare -A languageE=(
  [program]="quarkus java $(java -version 2>&1 | head -n1 | cut -d ' ' -f3 | tr -d '"')"
  [directory]="../quarkus"
  [build]="./mvnw package -Dquarkus.package.type=uber-jar"
  [exec]="java -jar target/quarkus-1.0.0-SNAPSHOT-runner.jar &"
)

declare -A languageF=(
  [program]="quarkus native"
  [directory]="."
  [build]="./mvnw package -Pnative -Dquarkus.native.container-build=true"
  [exec]="./target/quarkus-1.0.0-SNAPSHOT-runner &"
)

declare -A languageG=(
  [program]="quarkus-reactive java $(java -version 2>&1 | head -n1 | cut -d ' ' -f3 | tr -d '"')"
  [directory]="../quarkus-reactive"
  [build]="./mvnw package -Dquarkus.package.type=uber-jar"
  [exec]="java -jar target/quarkus-reactive-1.0.0-SNAPSHOT-runner.jar &"
)

declare -A languageH=(
  [program]="quarkus-reactive native"
  [directory]="."
  [build]="./mvnw package -Pnative -Dquarkus.native.container-build=true"
  [exec]="./target/quarkus-reactive-1.0.0-SNAPSHOT-runner &"
)

declare -A languageI=(
  [program]="webflux java $(java -version 2>&1 | head -n1 | cut -d ' ' -f3 | tr -d '"')"
  [directory]="../webflux"
  [build]="./mvnw clean install"
  [exec]="java -jar ./target/webflux-0.0.1-SNAPSHOT.jar &"
)

declare -A languageJ=(
  [program]="webflux native"
  [directory]="."
  [build]="native-image -jar ./target/webflux-0.0.1-SNAPSHOT.jar"
  [exec]="./webflux-0.0.1-SNAPSHOT &"
)

WRK="wrk -c90 -d30s -t3 http://localhost:8080/customers"
WRK_POST="wrk -c60 -d30s -t2 -s customers.lua http://localhost:8080/customers"
WRK_FILE=$script_dir/../../WRK.md

table=""
echo "# WRK details" > $WRK_FILE
echo "" >> $WRK_FILE

declare -n language
for language in ${!language@}; do
  echo "## ${language[program]}" >> $WRK_FILE
  echo "### GET" >> $WRK_FILE
  echo "" >> $WRK_FILE
  echo "$WRK" >> $WRK_FILE
  echo "" >> $WRK_FILE
  echo "\`\`\`" >> $WRK_FILE

  cd ${language[directory]}
  eval ${language[build]}
  eval ${language[exec]}
  pid=$!
  sleep 5
  pidstat -p $pid -uhr 2 > $script_dir/load.log &
  eval $WRK > $script_dir/wrk.log
  cat $script_dir/wrk.log >> $WRK_FILE
  echo "\`\`\`" >> $WRK_FILE
  echo "" >> $WRK_FILE

  if [[ -z "${language[stop]+unset}" ]]; then
    kill $pid
    max_memory=$(grep -v Time $script_dir/load.log | grep . | awk -F ' ' '{print $15*640}' | sort -n | tail -1)
    max_cpu=$(grep -v Time $script_dir/load.log | grep . | awk -F ' ' '{print $9}' | sort -n | tail -1)
  else
    eval ${language[stop]}
    max_cpu="-"
    max_memory="-"
  fi

  req_sec=$(grep Requests/sec $script_dir/wrk.log | cut -d ':' -f2- | tr -d ' ')

  table=$table$(echo "${language[program]} | $req_sec | $max_cpu | $max_memory |")$'\n'

done

echo "Language/runtime | GET (req/sec) | max CPU usage % | max Memory usage (MB)" > $script_dir/../../TABLE_GET.md
echo "--- | --- | --- | --- |" >> $script_dir/../../TABLE_GET.md
echo "$table" >> $script_dir/../../TABLE_GET.md
