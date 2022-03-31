# demo2
 面試作業2



## GET /book/search
**查詢所有書籍**

### Parameter
- none
example: http://localhost:8080/book/search

### Response

200: 執行成功
return 
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
example: http://localhost:8080/book/add

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
example: http://localhost:8080/book/update

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
example: http://localhost:8080/book/update

### Response
200: 執行成功
return delete success

404: 找不到方法
return not found