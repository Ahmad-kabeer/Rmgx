# Rmgx

# All three api of Category table Listed below.
## 1-Add category of assets
Endpoint: Post: http://localhost:8081/category/addCategory<br />

InputBody: <br />
            {\
                "name": "Pen",\
                "description": "PenPenPenPenPenPenPenPen"\
            }\
Response: <br />Category Added Succeccfully

## 2-Update Category
Endpoint: Post: http://localhost:8081/category/updateCategory<br />
InputBody: <br />{\
                "id": 5,\
                "name": "Pencil",\
                "description": "PencilPencilPencilPencil"\
            }\
Response: <br />Category Updated Succeccfully
## 3-List all Category
Endpoint: Post: http://localhost:8081/category/addCategory<br />
InputBody: <br />Nothing\
Response: <br />
            {\
                "Data": [\
                    {\
                        "id": 1,\
                        "name": "laptops",\
                        "description": "laptopslaptopslaptopslaptopslaptopslaptops"\
                    },\
                    {\
                        "id": 2,\
                        "name": "keyboard",\
                        "description": "keyboardkeyboardkeyboardkeyboard"\
                    },\
                    {\
                        "id": 3,\
                        "name": "stationary",\
                        "description": "stationarystationarystationary"\
                    },\
                    {\
                        "id": 4,\
                        "name": "furniture",\
                        "description": "furniturefurniturefurniture"\
                    },\
                    {\
                        "id": 5,\
                        "name": "Pencil",\
                        "description": "PencilPencilPencilPencil"\
                    }\
                ],\
                "Result": "Success"\
            }
