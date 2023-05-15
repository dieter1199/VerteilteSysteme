FROM gitpod/workspace-full-vnc:latest

RUN bash -c ". .nvm/nvm.sh \
    && nvm install 14 \
    && nvm alias default 14 \
    && nvm use default"

RUN sudo apt-get update \
    && sudo apt-get install -y \
    openjdk-17-jdk