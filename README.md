# Full Stack CRUD Application with Spring Boot and React Hooks

This repository contains a full-stack CRUD (Create, Read, Update, Delete) application built using Spring Boot for the backend and React Hooks with Functional Components for the frontend. The application leverages the power of Spring Boot to create robust web services (REST API) and utilizes MySQL as the database.

## Technologies Used

- **Backend**:
    - [Spring Boot](https://spring.io/projects/spring-boot) - A Java-based framework for building web applications.
    - [MySQL](https://www.mysql.com/) - A popular open-source relational database management system.
    - [Postman](https://www.postman.com/) - Used for testing the REST API endpoints.

- **Frontend**:
    - [React](https://reactjs.org/) - A JavaScript library for building user interfaces.
    - [React Hooks](https://reactjs.org/docs/hooks-intro.html) - Functional components with state and lifecycle management.
    - [Axios](https://axios-http.com/) - A promise-based HTTP client for making AJAX requests.

## Features

- Create, Read, Update, and Delete operations on data entities.
- RESTful API endpoints for interacting with data.
- Frontend built with React, featuring a user-friendly interface.
- Leveraging React Hooks for efficient state management.
- Utilization of Axios for making API requests.
- Backend powered by Spring Boot for robustness and scalability.
- MySQL database for storing and retrieving data.

## How to Use

1. Clone the repository to your local machine:

   ```bash
   git clone <repository-url>
   ```

2. Set up the Backend:
    - Navigate to the `backend` directory.
    - Configure your MySQL database settings in `application.properties`.
    - Run the Spring Boot application.

3. Set up the Frontend:
    - Navigate to the `frontend` directory.
    - Install dependencies using `npm install` or `yarn install`.
    - Start the React development server using `npm start` or `yarn start`.

4. Access the Application:
    - Open your web browser and go to `http://localhost:3000` to interact with the CRUD application.

## API Endpoints

### **POST**
- **Add User**
    - URL: `http://localhost:8080/user`
    - Description: Create a new user.

### **GET**
- **Get All Users**
    - URL: `http://localhost:8080/users`
    - Description: Retrieve a list of all users.

- **Get User By Id**
    - URL: `http://localhost:8080/user/{id}`
    - Description: Retrieve a specific user by their ID.

### **PUT**
- **Update User**
    - URL: `http://localhost:8080/user/{id}`
    - Description: Update an existing user's information.

### **DELETE**
- **Delete User By Id**
    - URL: `http://localhost:8080/user/{id}`
    - Description: Delete a user by their ID.
## Testing with Postman

You can use Postman to test the REST API endpoints by sending HTTP requests to the specified routes. This allows you to interact with the backend and verify the functionality of the CRUD operations.

## Author

João Carlos Fernandes Bernardo
- GitHub: [https://github.com/jcfbernardo](https://github.com/jcfbernardo)