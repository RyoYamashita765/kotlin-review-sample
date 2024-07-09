fun getDiscountPercentage(customer: Customer): Int {
    if (customer.isPremium) {
        if (customer.loyaltyYears > 5) {
            return 20
        } else {
            return 15
        }
    } else {
        if (customer.purchaseCount > 10) {
            return 10
        } else {
            return 5
        }
    }
}
