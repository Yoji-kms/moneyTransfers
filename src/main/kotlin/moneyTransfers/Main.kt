package moneyTransfers

import kotlin.math.max
import kotlin.math.round


fun main() {
    val minCommission = 3500.0F
    val commissionPercent = 0.0075F

    print("Enter the sum (rubles): ")
    val moneyInput = readLine()?.toFloatOrNull()

    if (moneyInput != null) {
        val moneyInputPennies = moneyInput * 100
        val commissionPennies = max(minCommission, moneyInputPennies * commissionPercent)
        val moneyAmountPennies = moneyInputPennies + commissionPennies

        val commission = round(commissionPennies) / 100
        val moneyAmount = round(moneyAmountPennies) / 100
        println("Commission: $commission")
        println("Money amount with commission: $moneyAmount")
    }
}