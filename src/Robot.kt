class Robot(val robotName: String) {

    fun ringAlarm(time: String) {
        var dayList = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        println("Alarm is ringing at $time on ${dayList.toString()}!")
    }

    data class CoffeeIngredients(var waterAmt: String, var coffeeAmt: String)

    fun makeCoffee(sugarAmt: String) {
        var blackCoffee = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        var coffeeWithMilk = arrayListOf("Saturday", "Sunday")
        val coffeeIngredients = CoffeeIngredients("1 Cup", "3 Spoons")
        println("Black Coffee is made at ${blackCoffee.toString()} with ${coffeeIngredients.waterAmt} of water, ${coffeeIngredients.coffeeAmt} of coffee and $sugarAmt of sugar!")
        println("Coffee with milk is made at ${coffeeWithMilk.toString()} with ${coffeeIngredients.waterAmt} of water, ${coffeeIngredients.coffeeAmt} of coffee and $sugarAmt of sugar!")
    }

    fun heatWater(bathingTemp: String) {
        var dayList = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
        println("Take bath at ${dayList.toString()} with water at temperature $bathingTemp!")
    }

    fun packBag(timeTable: ArrayList<List<String>>) {
        var dayList = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        for (j in 1..6) {
            for (i in dayList) {
                if (i == timeTable[j][0])
                    println("Bag is packed according to the timetable ${timeTable[j].toString()} of the day $i!")
            }
        }
    }

    fun cookFoodForBreakfast(breakfastFoodList: List<String>) {
        println("Breakfast cooked for today is ${breakfastFoodList.random()}!")
    }

    fun cookFoodForLunch(LunchFoodList: List<String>) {
        println("Lunch cooked for today is ${LunchFoodList.random()}!")
    }

    fun ironClothes() {

    }
}