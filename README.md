# demo2
 面試作業2



## GET /book/search
**查詢所有書籍**

### Parameter
- none

### Response

200: 執行成功
return example
[
    {
        "name": "完全Coding手冊",
        "author": "工程師",
        "tranlator": "工程師",
        "isbn": "978-0-7334-2609-4",
        "publishers": "我自己",
        "publicationDate": "2022-03-30 00:00:00",
        "pricing": 1
    }
]

404: 找不到方法
return not found

## POST /book/add
**新增一本書籍**

### Parameter
- Route
    - `name (string, required)` 名稱
    - `author (string, required)` 作者
    - `tranlator (string, optional)` 譯者
    - `isbn (string, required)` ISBN
    - `publishers (string, required)` 出版商
    - `publicationDate (date, required)` 出版日期
    - `pricing (int, required)` 定價

### Response
200: 執行成功
return add success

404: 找不到方法
return not found

## PUT /book/update
**更新一本書籍**

### Parameter
- Route
    - `name (string, required)` 名稱
    - `author (string, required)` 作者
    - `tranlator (string, optional)` 譯者
    - `isbn (string, required)` ISBN
    - `publishers (string, required)` 出版商
    - `publicationDate (date, required)` 出版日期
    - `pricing (int, required)` 定價

### Response
200: 執行成功
return update success

404: 找不到方法
return not found


## Delete /book/delete
**刪除一本書籍**

### Parameter
- Route
    - `isbn (string, required)` ISBN

### Response
200: 執行成功
return delete success

404: 找不到方法
return not found


## Docker 啟動指令說明
1. 使用 cd Dockerfile存在的專案路徑中
2. 使用 docker build -t demo-app . 產生對應的Image
3. 使用 docker run -e DATABASE_SERVER=jdbc:h2:mem:tmpdb -p 8080:8080 demo-app 啟動容器及服務，設定 DATABASE_SERVER 環境變數，並宣告映射 8080 port
