## Created the Skeleton from https://start.spring.io/

- The test application is build using Java 11, Spring Boot.
- You would require a JDK installed environment
- To run the application you can run it from either and IDE using "Run as" ->  "Spring Boot App" or else from 
	"java -jar path/to/your/jarfile.jar com.kccreate.ecommerce.EcommerceApplication"
	

## Application Demo and Code walk through:
 
- This application is to achieve e-commerce application basic CRUD functionalities
- This application is web backend application built using REST APis,
- Create a Database schema named "gocity" in MySQL server.
- There are 2 entities Item and Category.

- CategoryController.java and ItemController.java are the entry point for the REST APIs.

- CategoryService.java and ItemService.java are the service layer of the application where all the business logic has been written.

- Application Demo 
Scenario : Adding item to database
		`[URL]: [POST] http://localhost:8080/api/item/add`
		
		Request Body:
		
			{
			    "name":"Lenevo laptop",
			    "description":"Lenevo laptop with FHD and Intel i7",
			    "categoryId":"4584e065-f7da-4708-9960-2db7da77775f"
			}
			
		Response:
			{
			    "body": {
			        "id": "32fa64ff-7195-4b68-8a57-0b4fd7689d36",
			        "name": "Lenevo laptop",
			        "category": {
			            "id": "4584e065-f7da-4708-9960-2db7da77775f",
			            "name": null
			        },
			        "description": "Lenevo laptop with FHD and Intel i7"
			    },
			    "message": "Item Added successfully",
			    "status": 200,
			    "error": null
			}
	
Scenario : Adding category. 

`[URL]: [POST] http://localhost:8080/api/category/add`
		
		Request Body:
		
			{
    			"name":"Electronics"
			}
			
		Response: Status Code 201 Created

Scenario : Sorting items by name and pagination. 

`[URL]: [GET] http://localhost:8080/api/item/findAll?sort=name,desc`
		
		Response:
			{
			    "body": {
			        "content": [
			            {
			                "id": "288426d6-5a38-40b3-bd9b-a72cb880cf34",
			                "name": "test",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "test"
			            },
			            {
			                "id": "0367fe22-9f43-46de-b24b-74b6b2db313c",
			                "name": "Software Engineer",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "Software Engineer"
			            },
			            {
			                "id": "4894da22-de49-4ef2-878c-23c443d71752",
			                "name": "Software Engineer",
			                "category": null,
			                "description": "Software Engineer"
			            },
			            {
			                "id": "d4c9411f-8da4-450f-9787-e76179234671",
			                "name": "Product 1",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "Product 1"
			            },
			            {
			                "id": "32fa64ff-7195-4b68-8a57-0b4fd7689d36",
			                "name": "Lenevo laptop",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "Lenevo laptop with FHD and Intel i7"
			            },
			            {
			                "id": "c0ea2f04-a9da-4e9c-a24a-0878cafc07dc",
			                "name": "Full Stack Software Engineer 32",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "Full Stack Software Engineer 32"
			            },
			            {
			                "id": "3de110df-97b1-4741-a78b-65a5eb495b35",
			                "name": "Full Stack Software Engineer 3",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "Full Stack Software Engineer 3"
			            },
			            {
			                "id": "afec435c-7a98-4bce-840a-2e26c443764f",
			                "name": "Full Stack Software Engineer 2",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "Full Stack Software Engineer 2"
			            },
			            {
			                "id": "a2ab3982-4873-49ac-a499-5832614888ea",
			                "name": "Full Stack Software Engineer 1",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "Full Stack Software Engineer 1"
			            },
			            {
			                "id": "eb46d911-193e-4142-96dd-b30245ef4708",
			                "name": "d",
			                "category": {
			                    "id": "0ba2bbd9-5a5c-45a4-9930-b84505c8d06b",
			                    "name": "Accounts"
			                },
			                "description": "d"
			            },
			            {
			                "id": "b8b40043-278c-4a78-aab9-475db961283b",
			                "name": "3",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "3"
			            },
			            {
			                "id": "832834d2-549e-4ea2-a250-f51abd77c2d0",
			                "name": "2",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "2"
			            },
			            {
			                "id": "19958e2d-bea3-43fa-b215-c51ccf29e399",
			                "name": "1",
			                "category": {
			                    "id": "4584e065-f7da-4708-9960-2db7da77775f",
			                    "name": "IT"
			                },
			                "description": "1"
			            }
			        ],
			        "pageable": {
			            "sort": {
			                "sorted": true,
			                "unsorted": false,
			                "empty": false
			            },
			            "offset": 0,
			            "pageSize": 20,
			            "pageNumber": 0,
			            "unpaged": false,
			            "paged": true
			        },
			        "last": true,
			        "totalPages": 1,
			        "totalElements": 13,
			        "number": 0,
			        "size": 20,
			        "sort": {
			            "sorted": true,
			            "unsorted": false,
			            "empty": false
			        },
			        "first": true,
			        "numberOfElements": 13,
			        "empty": false
			    },
			    "message": "Item Fetched successfully",
			    "status": 200,
			    "error": null
		}
Scenario : Deleting item. 

			`[URL]: [DELETE] http://localhost:8080/api/item/delete?itemId=ae79e73d-3cf7-4356-b7f3-ce35dd42731f` 
			Response: Status Code 204 No Content
			
Scenario: Updating item

	`[URL]: [PUT] http://localhost:8080/api/item/update/ae79e73d-3cf7-4356-b7f3-ce35dd42731f
			Response:{
			    "body": {
			        "id": "ae79e73d-3cf7-4356-b7f3-ce35dd42731f",
			        "name": "Samsung S21",
			        "category": {
			            "id": "4584e065-f7da-4708-9960-2db7da77775f",
			            "name": "IT"
			        },
			        "description": "Samsung S21"
			    },
			    "message": "Item Updated successfully",
			    "status": 200,
			    "error": null
			    }
	




		