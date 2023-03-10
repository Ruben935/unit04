fun main(args: Array<String>)
{
        print("Enter a positive integer that is not zero: ")
        val input = readLine()?.toIntOrNull()

        if (input == null || input <= 0)
        {
            println("Error. Please enter a positive integer that is not zero.")
            return
        }

        var sum = 0
        for (i in 1..input)

        {
            sum += i
        }

        println("The sum of all integers from 1 to " + input + " is " + sum)

}
