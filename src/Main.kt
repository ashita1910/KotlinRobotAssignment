fun main() {
    val robot = Robot("Sam")
    robot.ringAlarm("7:00 A.M.")
    robot.makeCoffee("1 Spoon")
    robot.heatWater("112 degrees")
    //robot.packBag(setTimeTable())
}

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
