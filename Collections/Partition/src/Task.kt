// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter { consumer ->
    val (delivered, undelivered) = consumer.orders.partition { it.isDelivered }
    undelivered.size > delivered.size
}.toSet()
