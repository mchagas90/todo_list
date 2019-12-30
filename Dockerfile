FROM clojure:slim-buster
COPY . /app
WORKDIR /app
CMD ["lein", "ring", "server-headless"]