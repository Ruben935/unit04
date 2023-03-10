fun main(args: Array<String>)
{
    print("Enter a string: \n")
    val inputString = readLine() ?: ""

    print("Enter a character to search and count: \n")
    val letter = readLine()?.getOrNull(0)

    if (letter == null)
    {
        println("Error. Please enter a single character.")
        return
    }

    val count = inputString.count { it == letter }

    println("The character '" + letter + "' appears " + count + " times in the string '" + inputString + "'" )
}
