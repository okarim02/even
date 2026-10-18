## Resilient Order Pipeline

Small project to demonstrate the outbox pattern with RabbitMQ, idempotent consumers, retries with dead-letter queues, and ordering guarantees.

Customers can place orders on souls, and the system will process them and send payments to the customer.

### Definitions 

* Outbox-pattern : A pattern where the producer of a message sends it to a queue, and the consumer of the message retrieves it from the queue.

### How to run

