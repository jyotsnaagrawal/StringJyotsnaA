import java.util.Scanner

fun main() {
    // Defining a list of questions and correct answers
    val questions = listOf(
        "Question 1: What is the capital of France?",
        "Question 2: In which year did World War II end?",
        "Question 3: What is the largest mammal on Earth?",
        "Question 4: Who wrote 'Romeo and Juliet'?",
        "Question 5: What is the boiling point of water in Celsius?"
    )

    val correctAnswers = listOf("Paris", "1945", "Blue Whale", "William Shakespeare", "100")

    // Initialize a variable to keep track of the user's score
    var userScore = 0

    // Create a Scanner object to get user input
    val scanner = Scanner(System.`in`)

    // Iterate through each question
    for (i in questions.indices) {
        // Display the current question
        println(questions[i])

        // Get the user's input
        val userInput = scanner.nextLine()

        // Check if the user's input is correct using equalsIgnoreCase method
        if (userInput.equals(correctAnswers[i], ignoreCase = true)) {
            // If correct, increment the user's score and display a success message
            userScore++
            println("Correct! Well done.")
        } else {
            // If incorrect, display the correct answer
            println("Incorrect. The correct answer is: ${correctAnswers[i]}")
        }
    }

    // Display the user's final score
    println("You got $userScore out of ${questions.size} questions right.")

    // Close the scanner to prevent resource leaks
    scanner.close()
}
