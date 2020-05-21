fun main() {
    val robot = Robot("Samayra")
    println("____________________________________________________________________________________________________________________________________________________________________")
    println("Hey, there. My name is Samayra and I will be your personal assistant!!")
    println()
    robot.ringAlarm("7:00 A.M.")
    println()
    robot.makeCoffee("1 Spoon")
    println()
    robot.heatWater("112 degrees")
    println()
    robot.packBag(setTimeTable())
    println()
    var breakfastList = arrayListOf("Poha", "Sandwich", "Fried Rice", "Cutlets", "Maggi", "Cornflakes")
    robot.cookFoodForBreakfast(breakfastList)
    println()
    var lunchList = arrayListOf(
        "Stuffed Parantha",
        "Rajma Chawal",
        "Chole Bhature",
        "Noodles with Manchurian",
        "Idli-Sambhar",
        "Sambhar-Dosa"
    )
    robot.cookFoodForLunch(lunchList)
    println()
    robot.ironClothes("Black Jeans and White T-shirt")
    println("____________________________________________________________________________________________________________________________________________________________________")
}

//setTimeTable() method to input the time table according to the day.
private fun setTimeTable(): ArrayList<List<String>> {
    var timeTableList = arrayListOf<List<String>>(arrayListOf<String>())
    timeTableList.add(arrayListOf(" ", "8:00 - 9:00", "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 1:00"))
    timeTableList.add(
        arrayListOf(
            "Monday",
            "Quant",
            "Software Engineering",
            "Computer Networks",
            "Lunch Break",
            "Data Structures and Algorithms"
        )
    )
    timeTableList.add(
        arrayListOf(
            "Tuesday",
            "Data Structures and Algorithms",
            "Computer Networks",
            "Quant",
            "Lunch Break",
            "Software Engineering"
        )
    )
    timeTableList.add(
        arrayListOf(
            "Wednesday",
            "Computer Networks",
            "Software Engineering",
            "Quant",
            "Lunch Break",
            "Data Structures and Algorithms"
        )
    )
    timeTableList.add(
        arrayListOf(
            "Thursday",
            "Software Engineering",
            "Computer Networks",
            "Data Structures and Algorithms",
            "Lunch Break",
            "Quant"
        )
    )
    timeTableList.add(
        arrayListOf(
            "Friday",
            "Quant",
            "Data Structures and Algorithms",
            "Computer Networks",
            "Lunch Break",
            "Software Engineering"
        )
    )
    return timeTableList
}
