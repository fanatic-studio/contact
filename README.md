# 获取联系人列表

## 安装

```shell script
vd plugin install https://github.com/ivde/contact
```

## 卸载

```shell script
vd plugin uninstall https://github.com/ivde/contact
```

## 引用

```js
const contact = app.requireModule("vd/contact");
```

## 获取联系人列表 (未分组)

```js
/**
 * @param callback  回调事件
 */
contact.lists(callback(result))
```

callback 回调result说明

```js
{
    status: "success",    //状态，success|error

    //以下参数仅：status=success有
    lists: [
    {
        "name": "张三",
        "phones": [
            "18811112222",
            "18933334444"
        ],
        "photo": "头像地址"
    },
    {
        "name": "李四",
        "phones": [
            "18955556666"
        ],
        "photo": "头像地址"
    },
    ......
	],
     
    //以下参数仅：status=error有
    error: "没有访问通讯录相关权限"	//错误描述
}
```


## 获取联系人列表 (按A-Z分组)

```js
/**
 * @param callback  回调事件
 */
contact.section(callback(result))
```

callback 回调result说明

```js
{
    status: "success",    //状态，success|error

    //以下参数仅：status=success有
    section: [
    {
        "key": "A",
        "lists": [
            {
                "name": "阿三",
                "phones": [
                    "18811112222",
                    "18933334444"
                ],
                "photo": "头像地址"
            },
            {
                "name": "阿四",
                "phones": [
                    "18955556666"
                ],
                "photo": "头像地址"
            }
        ]
    },
    {
        "key": "B",
        "lists": [
            {
                "name": "宝贝",
                "phones": [
                    "18811112222",
                    "18933334444"
                ],
                "photo": "头像地址"
            },
            {
                "name": "baby",
                "phones": [
                    "18955556666"
                ],
                "photo": "头像地址"
            }
        ]
    },
    ......
	],
     
    //以下参数仅：status=error有
    error: "没有访问通讯录相关权限"	//错误描述
}
```