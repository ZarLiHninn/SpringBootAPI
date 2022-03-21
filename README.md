## SpringBootAPIの使い方手順
1. git cloneでクローンしてください。
2. APIのデータがあるdockerを以下のコマンドでスタートしてください。
```
 docker-compose up -d
```
3. mvn installで実行してください。
4. java -jar ec2demo0.0.1-SNAPSHOT.jarを実行してください。
5. localhost:8080/userListで実行してください。
6. 以下のようなデーターが表示されたらokです。

![alt text for screen readers](https://github.com/ZarLiHninn/SpringBootAPI/blob/main/images/Screen%20Shot%202022-02-25%20at%203.43.44%20PM.png "user lists")
