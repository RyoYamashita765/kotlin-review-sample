fun processOrder(order: Order): OrderResult {
    if (order.isValid()) {
        if (order.hasInStockItems()) {
            if (order.customerHasEnoughCredit()) {
                // The logic for processing an order
                val packingSlip = generatePackingSlip(order)
                val invoice = generateInvoice(order)
                sendConfirmationEmail(order.customer, packingSlip, invoice)
                updateInventory(order.items)
                chargeCustomer(order.customer, order.totalAmount)
                return OrderResult.Success(packingSlip, invoice)
            } else {
                // Notification to the customer (credit card declined)
                sendInsufficientCreditNotification(order.customer)
                logFailedOrder(order, "Insufficient credit")
                return OrderResult.Failure("Insufficient credit")
            }
        } else {
            // When items are out of stock
            val backorderItems = findBackorderItems(order.items)
            createBackorder(order, backorderItems)
            sendBackorderNotification(order.customer, backorderItems)
            logFailedOrder(order, "Items out of stock")
            return OrderResult.Failure("Items out of stock")
        }
    } else {
        // Invalid order processing
        logInvalidOrder(order)
        sendInvalidOrderNotification(order.customer)
        return OrderResult.Failure("Invalid order")
    }
}

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val order = Order(
            customer = Customer,
            items = listOf(Item),
            totalAmount = 1000,
        )
    }
}
