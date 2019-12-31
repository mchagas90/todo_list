# todo_list


## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Running

### With Docker:

Inside project root:

    docker-compose up

Open another terminal tab and execute (first run only):

    docker-compose exec db bash -c "mysql menagerie -uroot -ptoor < ./docker-entrypoint-initdb.d/init.sql"

This will generate the necessary table for the code execution

Server will be available at http://localhost:3000


### Without Docker (not recommended)

To start a web server for the application, run:

    lein ring server

---

### Available endpoints:

```
GET localhost:3000/api/todos
```

```
POST localhost:3000/api/todos
{
    "title": "titulo",
    "description": "descricao"
}
```

```
PUT localhost:3000/api/todos/1
{
    "title": "titulo_alterado",
    "description": "descricao_alterada"
}
```

```
DELETE localhost:3000/api/todos/1
```

## License

Copyright © 2019 FIXME
