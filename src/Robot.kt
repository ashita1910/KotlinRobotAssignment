class Robot(val robotName: String) {

    //ringAlarm() method to ring the alarm on time.
    fun ringAlarm(time: String) {
        var dayList = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        println("Alarm is ringing at $time on ${dayList.toString()}!")
    }

    //data class CoffeeIngredients to give data of the other ingredients to be used in the coffee.
    data class CoffeeIngredients(var waterAmt: String, var coffeeAmt: String)

    //makeCoffee() method to make coffee according to the desire for the day.
    fun makeCoffee(sugarAmt: String) {
        var blackCoffee = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        var coffeeWithMilk = arrayListOf("Saturday", "Sunday")
        val coffeeIngredients = CoffeeIngredients("1 Cup", "3 Spoons")
        println("Black Coffee is made at ${blackCoffee.toString()} with ${coffeeIngredients.waterAmt} of water, ${coffeeIngredients.coffeeAmt} of coffee and $sugarAmt of sugar!")
        println("Coffee with milk is made at ${coffeeWithMilk.toString()} with ${coffeeIngredients.waterAmt} of water, ${coffeeIngredients.coffeeAmt} of coffee and $sugarAmt of sugar!")
    }

    //heatWater() method to heat the water upto temperature suitable for bathing.
    fun heatWater(bathingTemp: String) {
        var dayList = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
        println("Take bath at ${dayList.toString()} with water at temperature $bathingTemp!")
    }

    //packBag() method to put the books in bag according to the time table of particular day.
    fun packBag(timeTable: ArrayList<List<String>>) {
        var dayList = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
        for (j in 1..6) {
            for (i in dayList) {
                if (i == timeTable[j][0]) {
                    print("Bag is packed according to the timetable [")
                    for (k in 1..4) {
                        print("${timeTable[j][k]}, ")
                    }
                    println("${timeTable[j][5]}] of the day $i!")
                }
            }
        }
    }

    //cookFoodForBreakfast() method to cook the food for breakfast.
    fun cookFoodForBreakfast(breakfastFoodList: List<String>) {
        println("Breakfast cooked for today is ${breakfastFoodList.random()}!")
    }

    //cookFoodForLunch() method to cook the food for lunch.
    fun cookFoodForLunch(LunchFoodList: List<String>) {
        println("Lunch cooked for today is ${LunchFoodList.random()}!")
    }

    //ironClothes() method to iron the clothes and make them ready to wear.
    fun ironClothes(clothes: String) {
        println("$clothes are ironed and ready to wear!")
    }
}