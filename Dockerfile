FROM ubuntu
RUN apt-get update \
    && apt-get upgrade -y \
    && apt-get install -y wrk sysstat docker-buildx wget curl build-essential docker-compose
RUN wget https://github.com/graalvm/graalvm-ce-builds/releases/download/jdk-21.0.2/graalvm-community-jdk-21.0.2_linux-x64_bin.tar.gz
RUN tar -xzf graalvm-community-jdk-21.0.2_linux-x64_bin.tar.gz -C /opt/
ENV PATH /opt/graalvm-community-openjdk-21.0.2+13.1/bin:$PATH
ENV JAVA_HOME /opt/graalvm-community-openjdk-21.0.2+13.1
WORKDIR /root
ENV NVM_DIR /usr/local/nvm
ENV NODE_VERSION v20.11.1
RUN mkdir -p $NVM_DIR
RUN curl https://raw.githubusercontent.com/creationix/nvm/master/install.sh | bash
RUN /bin/bash -c "source $NVM_DIR/nvm.sh && nvm install $NODE_VERSION"
ENV NODE_PATH $NVM_DIR/versions/node/$NODE_VERSION/lib/node_modules
ENV PATH $NVM_DIR/versions/node/$NODE_VERSION/bin:$PATH
RUN curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- -y
ENV PATH /root/.cargo/bin:$PATH
RUN wget https://go.dev/dl/go1.22.1.linux-amd64.tar.gz
RUN tar -C /usr/local -xzf go1.22.1.linux-amd64.tar.gz
ENV PATH $PATH:/usr/local/go/bin
WORKDIR /opt/benchmark/
COPY docker ./docker
COPY rust ./rust
COPY go ./go
COPY node ./node
COPY java ./java
WORKDIR /opt/benchmark/docker
EXPOSE 8080
CMD ["/bin/bash", "-c", "dockerd & docker-compose up -d; ../wrk/exec.sh"]