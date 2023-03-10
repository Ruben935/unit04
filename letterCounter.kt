fun main(args: Array<String>)
{
    print("Enter a string: \n")
    val inputString = readLine()!!

    print("Enter a character to search and count: \n")
    val letter = readLine()!![0]

    val count = inputString.count { it == letter }

    println("The character '" + letter + "' appears " + count + " times in the string '" + inputString + "'" )
}
