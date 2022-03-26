import kotlin.random.Random

const val STANDARD_DISCOUNT_RUB = 100.0
const val DISCOUNT_PERCENT = 0.05
const val MELOMAN_DISCOUNT_PERCENT = 0.01

fun main() {
    print("Введите сумму покпок (руб.): ")
    val amountOfPurchases = readln().toDouble()
    val userIsMeloman = Random.nextBoolean()
    val discountSum =
        if (amountOfPurchases > 10000) amountOfPurchases * DISCOUNT_PERCENT else if (amountOfPurchases > 1000) STANDARD_DISCOUNT_RUB else 0.0
    val sum = amountOfPurchases - discountSum
    val melomanDiscountSum = if (userIsMeloman) sum * MELOMAN_DISCOUNT_PERCENT else 0.0
    val totalSum = sum - melomanDiscountSum

    println("Пользователь меломан: $userIsMeloman. \nСкидка от суммы покупки: $discountSum руб. Скидка меломану: $melomanDiscountSum руб. \nИтоговая сумма: $totalSum руб.")
}