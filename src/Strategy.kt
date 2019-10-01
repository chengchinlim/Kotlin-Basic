interface CreditCard {
    val id: Int
    fun calculateScore(score: Int): Int
}

class Visa(private val num: Int): CreditCard {
    override val id: Int
        get() = num

    override fun calculateScore(score: Int): Int {
        return score * 2
    }
}

class Master(private val num: Int): CreditCard {
    override val id: Int
        get() = num

    override fun calculateScore(score: Int): Int {
        return score * 3
    }
}

class Paypal(client: CreditCard): CreditCard by client {
    fun printCard() {
        println(this.id)
    }
}

fun main() {
    val visa = Visa(12345)
    val master = Master(34567)
    println("Visa score: ${visa.calculateScore(30)}")
    println("Master score: ${master.calculateScore(20)}")
    val payPal1 = Paypal(visa)
    val payPal2 = Paypal(master)
    payPal1.printCard()
    payPal2.printCard()
}