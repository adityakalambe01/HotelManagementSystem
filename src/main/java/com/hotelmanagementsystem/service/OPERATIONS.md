### Guest

- **Create Operations:**
    - `Guest createGuest(Guest guest)`

- **Read Operations:**
    - `Guest getGuestById(Long guestId)`
    - `List<Guest> getAllGuests()`
    - `List<Reservation> getReservationsByGuestId(Long guestId)`

- **Update Operations:**
    - `Guest updateGuest(Long guestId, Guest guest)`

- **Delete Operations:**
    - `void deleteGuest(Long guestId)`

### Reservation

- **Create Operations:**
    - `Reservation createReservation(Reservation reservation)`

- **Read Operations:**
    - `Reservation getReservationById(Long reservationId)`
    - `List<Reservation> getAllReservations()`
    - `List<Reservation> getReservationsByGuestId(Long guestId)`
    - `List<Reservation> getReservationsByRoomId(Long roomId)`

- **Update Operations:**
    - `Reservation updateReservation(Long reservationId, Reservation reservation)`

- **Delete Operations:**
    - `void deleteReservation(Long reservationId)`

### Room

- **Create Operations:**
    - `Room createRoom(Room room)`

- **Read Operations:**
    - `Room getRoomById(Long roomId)`
    - `List<Room> getAllRooms()`
    - `List<Room> getRoomsByType(Long roomTypeId)`

- **Update Operations:**
    - `Room updateRoom(Long roomId, Room room)`

- **Delete Operations:**
    - `void deleteRoom(Long roomId)`

### RoomType

- **Create Operations:**
    - `RoomType createRoomType(RoomType roomType)`

- **Read Operations:**
    - `RoomType getRoomTypeById(Long roomTypeId)`
    - `List<RoomType> getAllRoomTypes()`

- **Update Operations:**
    - `RoomType updateRoomType(Long roomTypeId, RoomType roomType)`

- **Delete Operations:**
    - `void deleteRoomType(Long roomTypeId)`

### Payment

- **Create Operations:**
    - `Payment createPayment(Payment payment)`

- **Read Operations:**
    - `Payment getPaymentById(Long paymentId)`
    - `List<Payment> getAllPayments()`
    - `List<Payment> getPaymentsByReservationId(Long reservationId)`

- **Update Operations:**
    - `Payment updatePayment(Long paymentId, Payment payment)`

- **Delete Operations:**
    - `void deletePayment(Long paymentId)`

### Employee

- **Create Operations:**
    - `Employee createEmployee(Employee employee)`

- **Read Operations:**
    - `Employee getEmployeeById(Long employeeId)`
    - `List<Employee> getAllEmployees()`

- **Update Operations:**
    - `Employee updateEmployee(Long employeeId, Employee employee)`

- **Delete Operations:**
    - `void deleteEmployee(Long employeeId)`

### Service

- **Create Operations:**
    - `Service createService(Service service)`

- **Read Operations:**
    - `Service getServiceById(Long serviceId)`
    - `List<Service> getAllServices()`

- **Update Operations:**
    - `Service updateService(Long serviceId, Service service)`

- **Delete Operations:**
    - `void deleteService(Long serviceId)`

### ServiceRequest

- **Create Operations:**
    - `ServiceRequest createServiceRequest(ServiceRequest serviceRequest)`

- **Read Operations:**
    - `ServiceRequest getServiceRequestById(Long requestId)`
    - `List<ServiceRequest> getAllServiceRequests()`
    - `List<ServiceRequest> getServiceRequestsByGuestId(Long guestId)`
    - `List<ServiceRequest> getServiceRequestsByServiceId(Long serviceId)`
    - `List<ServiceRequest> getServiceRequestsByEmployeeId(Long employeeId)`

- **Update Operations:**
    - `ServiceRequest updateServiceRequest(Long requestId, ServiceRequest serviceRequest)`

- **Delete Operations:**
    - `void deleteServiceRequest(Long requestId)`

### Feedback

- **Create Operations:**
    - `Feedback createFeedback(Feedback feedback)`

- **Read Operations:**
    - `Feedback getFeedbackById(Long feedbackId)`
    - `List<Feedback> getAllFeedbacks()`
    - `List<Feedback> getFeedbacksByGuestId(Long guestId)`
    - `List<Feedback> getFeedbacksByReservationId(Long reservationId)`

- **Update Operations:**
    - `Feedback updateFeedback(Long feedbackId, Feedback feedback)`

- **Delete Operations:**
    - `void deleteFeedback(Long feedbackId)`

### Invoice

- **Create Operations:**
    - `Invoice createInvoice(Invoice invoice)`

- **Read Operations:**
    - `Invoice getInvoiceById(Long invoiceId)`
    - `List<Invoice> getAllInvoices()`
    - `List<Invoice> getInvoicesByReservationId(Long reservationId)`

- **Update Operations:**
    - `Invoice updateInvoice(Long invoiceId, Invoice invoice)`

- **Delete Operations:**
    - `void deleteInvoice(Long invoiceId)`

### Maintenance

- **Create Operations:**
    - `Maintenance createMaintenance(Maintenance maintenance)`

- **Read Operations:**
    - `Maintenance getMaintenanceById(Long maintenanceId)`
    - `List<Maintenance> getAllMaintenanceRecords()`
    - `List<Maintenance> getMaintenanceRecordsByRoomId(Long roomId)`

- **Update Operations:**
    - `Maintenance updateMaintenance(Long maintenanceId, Maintenance maintenance)`

- **Delete Operations:**
    - `void deleteMaintenance(Long maintenanceId)`

### Inventory

- **Create Operations:**
    - `Inventory createInventoryItem(Inventory inventory)`

- **Read Operations:**
    - `Inventory getInventoryItemById(Long itemId)`
    - `List<Inventory> getAllInventoryItems()`

- **Update Operations:**
    - `Inventory updateInventoryItem(Long itemId, Inventory inventory)`

- **Delete Operations:**
    - `void deleteInventoryItem(Long itemId)`

### BookingChannel

- **Create Operations:**
    - `BookingChannel createBookingChannel(BookingChannel bookingChannel)`

- **Read Operations:**
    - `BookingChannel getBookingChannelById(Long channelId)`
    - `List<BookingChannel> getAllBookingChannels()`

- **Update Operations:**
    - `BookingChannel updateBookingChannel(Long channelId, BookingChannel bookingChannel)`

- **Delete Operations:**
    - `void deleteBookingChannel(Long channelId)`