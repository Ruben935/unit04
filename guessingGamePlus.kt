import kotlin.random.Random
fun main(args: Array<String>)
{
    val secretNumber = Random.nextInt(1, 101)
    var guess: Int
    var numGuesses = 0

    do
    {
        print("Guess a number between 1 and 100: ")
        guess = readLine()?.toIntOrNull() ?: 0
        numGuesses++

        if (guess < secretNumber)
        {
            println("Too low, try again.")
        } else if (guess > secretNumber)
        {
            println("Too high, try again.")
        }
    } while (guess != secretNumber)

    println("Congratulations! You guessed the number in $numGuesses guesses.")
}
