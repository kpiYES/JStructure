# JStructure
Directory Structure in JSON Format

Suppose we have the following folder structure:

```bash
└───com
    └───jstructure
        │   Application.java
        │
        ├───parser
        │   ├───api
        │   │       DirectoryParser.java
        │   │
        │   └───impl
        │           DirectoryParserImpl.java
        │
        └───service
            ├───api
            │       PropertyService.java
            │       WriterService.java
            │
            └───impl
                    PropertyServiceImpl.java
                    WriterServiceImpl.java
```

and this structure can be accessed in src/main/java/com/jstructure
after executing:
```java
  JsonObject object = directoryParser.parse(input);
```
we should obtain the following result:
```json
{
    "name":"jstructure",
    "files":[
        {
            "name":"Application.java"
        }
    ],
    "subdirectories":[
        {
            "name":"parser",
            "files":[
            ],
            "subdirectories":[
                {
                    "name":"api",
                    "files":[
                        {
                            "name":"DirectoryParser.java"
                        }
                    ],
                    "subdirectories":[
                    ]
                },
                {
                    "name":"impl",
                    "files":[
                        {
                            "name":"DirectoryParserImpl.java"
                        }
                    ],
                    "subdirectories":[
                    ]
                }
            ]
        },
        {
            "name":"service",
            "files":[
            ],
            "subdirectories":[
                {
                    "name":"api",
                    "files":[
                        {
                            "name":"PropertyService.java"
                        },
                        {
                            "name":"WriterService.java"
                        }
                    ],
                    "subdirectories":[
                    ]
                },
                {
                    "name":"impl",
                    "files":[
                        {
                            "name":"PropertyServiceImpl.java"
                        },
                        {
                            "name":"WriterServiceImpl.java"
                        }
                    ],
                    "subdirectories":[
                    ]
                }
            ]
        }
    ]
}
```
