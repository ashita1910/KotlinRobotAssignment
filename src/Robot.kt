class Robot(val robotName: String) {

    fun ringAlarm(time: String) {
        var dayList = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        println("Alarm is ringing at $time on ${dayList.toString()}!")
    }

    data class CoffeeIngredients(var waterAmt: String, var coffeeAmt: String)

    /*fun makeCoffee(sugarAmt : String) {
        var blackCoffee = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        var coffeeWithMilk = arrayListOf("Saturday", "Sunday")
        val coffeeIngredients = CoffeeIngredients("1 Cup", "3 Spoons")
        println("Black Coffee is made at ${blackCoffee.toString()} with ${coffeeIngredients.waterAmt} of water, ${coffeeIngredients.coffeeAmt} of coffee and $sugarAmt of sugar!")
        println("Coffee with milk is made at ${coffeeWithMilk.toString()} with ${coffeeIngredients.waterAmt} of water, ${coffeeIngredients.coffeeAmt} of coffee and $sugarAmt of sugar!")
    }*/

    fun heatWater() {

    }

    fun packBag() {

    }

    fun cookFood() {

    }

    fun ironClothes() {

    }
}