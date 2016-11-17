curl -i -X POST -H "Content-Type:application/json" -d "{  \"length\" : \"30\" }" http://localhost:8080/shelves
curl -i -X POST -H "Content-Type:application/json" -d "{  \"title\" : \"The Battasdf\" }" http://localhost:8080/books
curl -i -X PUT -H "ContentType: text/uri-list" -d "http://localhost:8080/shelves/1" http://localhost:8080/books/1/shelve
