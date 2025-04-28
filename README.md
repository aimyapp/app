### MySQL起動
```bash
$ docker-compose up --build -d
```
### port:3306で起動しているアプリを確認(port重複でMySQL起動できない場合)
```bash
$ netstat -ano | findstr :3306
```

### タスクKill
```bash
$ taskkill /PID {プロセスのID} /F 
```

### コンテナログイン
```bash
$ docker exec -it apl-mysql-1
```

### build-local.gradleで実行する場合
```bash
$ bootRun -Penv=local
```
