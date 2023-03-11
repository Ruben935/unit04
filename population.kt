fun main(args: Array<String>)
{
    var startingPopulation = 0
    var dailyIncrease = 0.0
    var numberOfDays = 0

    while (true)
    {
        println("Enter the starting population: ")
        val input = readLine()
        if (input != null && input.toInt() >= 2) {
            startingPopulation = input.toInt()
            break
        }
    }

    while (true)
    {
        println("Enter the daily population increase as a percentage: ")
        val input = readLine()
        if (input != null && input.toDouble() > 0)
        {
            dailyIncrease = input.toDouble()
            break
        }
    }

    while (true)
    {
        println("Enter the number of days they will multiply: ")
        val input = readLine()
        if (input != null && input.toInt() >= 1)
        {
            numberOfDays = input.toInt()
            break
        }
    }

    var population = startingPopulation.toDouble()

    for (day in 1..numberOfDays) {
        println("Day $day: Population is ${population.toInt()}")
        population += population * (dailyIncrease / 100)
    }
}
