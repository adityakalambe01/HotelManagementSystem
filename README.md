# Hotel Management System

A comprehensive Hotel Management System built using Java, Spring, Spring Boot, and REST API to manage guests, reservations, rooms, payments, employees, services, feedback, invoices, maintenance, inventory, and booking channels.

## Table of Contents

- [Features](#features)
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Entities and Operations](#entities-and-operations)
- [Contributing](#contributing)
- [License](#license)

## Features

- Guest management
- Reservation management
- Room management
- Payment processing
- Employee management
- Service management
- Feedback management
- Invoice generation
- Maintenance tracking
- Inventory management
- Booking channel management

## Architecture

The system is built using Spring Boot and follows a multi-tier architecture:
- *Controller Layer*: Handles HTTP requests and responses.
- *Service Layer*: Contains business logic.
- *Repository Layer*: Interfaces with the database.

## Technologies Used

- *Java*: Programming language
- *Spring Framework*: Dependency injection, aspect-oriented programming
- *Spring Boot*: Rapid application development
- *REST API*: For building scalable web services
- *JPA/Hibernate*: ORM for database interactions
- *Maven*: Dependency management and build tool

## Installation

1. Clone the repository:
   bash
   git clone https://github.com/your-username/hotel-management-system.git


2. Navigate to the project directory:
   bash
   cd hotel-management-system


3. Build the project using Maven:
   bash
   mvn clean install


4. Run the application:
   bash
   mvn spring-boot:run


## Usage

Once the application is running, you can access the API endpoints using a tool like Postman or through your web browser. The default URL is http://localhost:8080.

## API Endpoints

Here is a list of the primary API endpoints:

### Guest

- *Create Guest:* POST /api/guests
- *Get Guest by ID:* GET /api/guests/{guestId}
- *Get All Guests:* GET /api/guests
- *Update Guest:* PUT /api/guests/{guestId}
- *Delete Guest:* DELETE /api/guests/{guestId}
- *Get Reservations by Guest ID:* GET /api/guests/{guestId}/reservations

### Reservation

- *Create Reservation:* POST /api/reservations
- *Get Reservation by ID:* GET /api/reservations/{reservationId}
- *Get All Reservations:* GET /api/reservations
- *Get Reservations by Guest ID:* GET /api/reservations/guest/{guestId}
- *Get Reservations by Room ID:* GET /api/reservations/room/{roomId}
- *Update Reservation:* PUT /api/reservations/{reservationId}
- *Delete Reservation:* DELETE /api/reservations/{reservationId}

### Room

- *Create Room:* POST /api/rooms
- *Get Room by ID:* GET /api/rooms/{roomId}
- *Get All Rooms:* GET /api/rooms
- *Get Rooms by Type:* GET /api/rooms/type/{roomTypeId}
- *Update Room:* PUT /api/rooms/{roomId}
- *Delete Room:* DELETE /api/rooms/{roomId}

### RoomType

- *Create Room Type:* POST /api/roomtypes
- *Get Room Type by ID:* GET /api/roomtypes/{roomTypeId}
- *Get All Room Types:* GET /api/roomtypes
- *Update Room Type:* PUT /api/roomtypes/{roomTypeId}
- *Delete Room Type:* DELETE /api/roomtypes/{roomTypeId}

### Payment

- *Create Payment:* POST /api/payments
- *Get Payment by ID:* GET /api/payments/{paymentId}
- *Get All Payments:* GET /api/payments
- *Get Payments by Reservation ID:* GET /api/payments/reservation/{reservationId}
- *Update Payment:* PUT /api/payments/{paymentId}
- *Delete Payment:* DELETE /api/payments/{paymentId}

### Employee

- *Create Employee:* POST /api/employees
- *Get Employee by ID:* GET /api/employees/{employeeId}
- *Get All Employees:* GET /api/employees
- *Update Employee:* PUT /api/employees/{employeeId}
- *Delete Employee:* DELETE /api/employees/{employeeId}

### Service

- *Create Service:* POST /api/services
- *Get Service by ID:* GET /api/services/{serviceId}
- *Get All Services:* GET /api/services
- *Update Service:* PUT /api/services/{serviceId}
- *Delete Service:* DELETE /api/services/{serviceId}

### ServiceRequest

- *Create Service Request:* POST /api/servicerequests
- *Get Service Request by ID:* GET /api/servicerequests/{requestId}
- *Get All Service Requests:* GET /api/servicerequests
- *Get Service Requests by Guest ID:* GET /api/servicerequests/guest/{guestId}
- *Get Service Requests by Service ID:* GET /api/servicerequests/service/{serviceId}
- *Get Service Requests by Employee ID:* GET /api/servicerequests/employee/{employeeId}
- *Update Service Request:* PUT /api/servicerequests/{requestId}
- *Delete Service Request:* DELETE /api/servicerequests/{requestId}

### Feedback

- *Create Feedback:* POST /api/feedback
- *Get Feedback by ID:* GET /api/feedback/{feedbackId}
- *Get All Feedbacks:* GET /api/feedback
- *Get Feedbacks by Guest ID:* GET /api/feedback/guest/{guestId}
- *Get Feedbacks by Reservation ID:* GET /api/feedback/reservation/{reservationId}
- *Update Feedback:* PUT /api/feedback/{feedbackId}
- *Delete Feedback:* DELETE /api/feedback/{feedbackId}

### Invoice

- *Create Invoice:* POST /api/invoices
- *Get Invoice by ID:* GET /api/invoices/{invoiceId}
- *Get All Invoices:* GET /api/invoices
- *Get Invoices by Reservation ID:* GET /api/invoices/reservation/{reservationId}
- *Update Invoice:* PUT /api/invoices/{invoiceId}
- *Delete Invoice:* DELETE /api/invoices/{invoiceId}

### Maintenance

- *Create Maintenance:* POST /api/maintenance
- *Get Maintenance by ID:* GET /api/maintenance/{maintenanceId}
- *Get All Maintenance Records:* GET /api/maintenance
- *Get Maintenance Records by Room ID:* GET /api/maintenance/room/{roomId}
- *Update Maintenance:* PUT /api/maintenance/{maintenanceId}
- *Delete Maintenance:* DELETE /api/maintenance/{maintenanceId}

### Inventory

- *Create Inventory Item:* POST /api/inventory
- *Get Inventory Item by ID:* GET /api/inventory/{itemId}
- *Get All Inventory Items:* GET /api/inventory
- *Update Inventory Item:* PUT /api/inventory/{itemId}
- *Delete Inventory Item:* DELETE /api/inventory/{itemId}

### BookingChannel

- *Create Booking Channel:* POST /api/bookingchannels
- *Get Booking Channel by ID:* GET /api/bookingchannels/{channelId}
- *Get All Booking Channels:* GET /api/bookingchannels
- *Update Booking Channel:* PUT /api/bookingchannels/{channelId}
- *Delete Booking Channel:* DELETE /api/bookingchannels/{channelId}
