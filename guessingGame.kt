import kotlin.random.Random
fun main(args: Array<String>)
{
    val secretNumber = Random.nextInt(1, 101)
    var guess = 0

    while (guess != secretNumber)
    {
        print("Guess the number between 1 and 100: ")
        guess = readLine()?.toInt() ?: 0

        when
        {
            guess > secretNumber -> println("Too high, try again.")
            guess < secretNumber -> println("Too low, try again.")
            else -> println("Congratulations! You guessed the number.")
        }
    }
}
