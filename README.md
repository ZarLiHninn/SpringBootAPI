## SpringBootAPIの使い方手順
1. git cloneでクロオンしてください。
2. UserData-dbのファイルをmysqlにインポートしてください。
3. mvn installで実行してください。
4. java -jar ./target/ec2demo0.0.1-SNAPSHOT.jarを実行してください。
5. localhost:8080/usersでアクセスしてください。
6. 以下のようなデーターが表示されたらokです。

![alt text for screen readers](https://github.com/ZarLiHninn/SpringBootAPI/blob/main/images/Screen%20Shot%202022-02-25%20at%203.43.44%20PM.png "user lists")

### curlとjqでterminalからアクセスする方法
1. curl -s http://localhost:8080 |jq
2. jqインストールするコマンド
#### Mac
```brew install jq```
#### Linux
```sudo apt-get install jq```
#### Windows
```chocolatey install jq```
