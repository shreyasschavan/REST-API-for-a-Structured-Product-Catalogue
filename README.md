# REST-API-for-a-Structured-Product-Catalogue
This is a RESTful API implementation for a product catalog system, designed to handle complex, nested data structures using MongoDB as the database.

Setup Instructions
Follow these steps to set up and run the application:

Prerequisites
Java JDK (version 8 or higher)
Maven
MongoDB

1. Clone the Repository:
   git clone https://github.com/your_username/product-catalog-api.git
   cd product-catalog-api
   
3. Configure MangoDB
   Ensure MongoDB is installed and running locally.
   
4. Configure Application Properties
  Edit the src/main/resources/application.properties file to configure MongoDB connection       
  properties:
  spring.data.mongodb.host=localhost
  spring.data.mongodb.port=27017
  spring.data.mongodb.database=ProductDatabase
  Replace mydatabase with the name of your MongoDB database.

5. Build the Application
   mvn clean install
   
5. Run the Application
  mvn spring-boot:run
The application will start on http://localhost:8080.

7. Explore the API Endpoints
You can explore the following API endpoints using tools like cURL, Postman, or your browser:

POST /api/products: Add a new product.
GET /api/products/{id}: Retrieve a product by ID.
PUT /api/products/{id}: Update a product by ID.
DELETE /api/products/{id}: Delete a product by ID.
GET /api/products: Retrieve all products.
GET /api/products/search: Search products with filters.
POST /api/products/{productId}/rate: Rate a product.

Notes:-
Ensure MongoDB is running before starting the application.
Customize and extend the application as needed for your use case.
Refer to the API documentation for detailed request and response formats.
