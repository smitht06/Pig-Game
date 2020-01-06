# Project 1 - Pig

![Random number comic](https://res.cloudinary.com/dm3fdmzec/image/upload/v1577808073/dillbert-random-number.gif)
## Project Outcomes:
Develop a Java program that uses:
* Basic console input/output
* Conditional logic
* Loops
* (Seeded) Random number generation

## Preparatory Readings:
ZyBooks chapters 1-4

Random number documentation - https://docs.oracle.com/javase/8/docs/api/java/util/Random.html

## Background Information:
### Project overview:
Pig is a simple two player game involving a single die.
One player is chosen to go first.
A player's turn involves repeatedly rolling the die until one of the following happens:
* A **1** is rolled - players turn is over, no points earned.
* The player chooses to keep points earned on this turn.

At the end of a player's turn, game-play continues with the other player.
The game is over when one of the players reaches the total number of points required to win (for example, 25 points).

![Demo of Pig game](https://res.cloudinary.com/dm3fdmzec/image/upload/v1577806764/pig-demo.gif)

### Project Requirements:
Your application must function as described below:
1. Your program should ask for the number of points needed to win and use that number as the end of game limit.
	1. If either player gets a total score that exceeds that amount, a message indicating the winner should be displayed.
1. It should then ask for the _seed_ for the random number generator.
	1. If a number less than zero is entered, then do not initialize your die with a seed.
	1. If 0 or greater is entered, your die should seed with that value - this will allow the grader to have a predictable path to victory or defeat for testing.
	1. It is safe to assume that the user (grader) will enter an integer.
1. Your program will be built for single-player play. The second player will be a computer who uses the following logic:
	1. Always continue to roll until the points for the turn are at least 20.
	If 20 or more points have been rolled, the computer shall choose to keep their points and transfer play back to the person playing.
1. The number of points required to win must indeed stop the game and signify the winner when reached.

### Sample program execution
#### Winning Game
```
$  java Pig
Welcome to the game of Pig!

How many points are required to win? 25
Enter a value to use to 'seed' the random number(negative number will not seed): 0
	Your turn
	You rolled: 5
	Your turn score is 5 and your total score is 0
	If you hold, you will have 5 points.
	Enter 'r' to roll again, 's' to stop: r
	You rolled: 2
	Your turn score is 7 and your total score is 0
	If you hold, you will have 7 points.
	Enter 'r' to roll again, 's' to stop: r
	You rolled: 4
	Your turn score is 11 and your total score is 0
	If you hold, you will have 11 points.
	Enter 'r' to roll again, 's' to stop: r
	You rolled: 4
	Your turn score is 15 and your total score is 0
	If you hold, you will have 15 points.
	Enter 'r' to roll again, 's' to stop: r
	You rolled: 4
	Your turn score is 19 and your total score is 0
	If you hold, you will have 19 points.
	Enter 'r' to roll again, 's' to stop: r
	You rolled: 2
	Your turn score is 21 and your total score is 0
	If you hold, you will have 21 points.
	Enter 'r' to roll again, 's' to stop: r
	You rolled: 3
	Your turn score is 24 and your total score is 0
	If you hold, you will have 24 points.
	Enter 'r' to roll again, 's' to stop: r
	You rolled: 6
	Your turn score is 30 and your total score is 0
	If you hold, you will have 30 points.
	Enter 'r' to roll again, 's' to stop: s
	Your score is 30
YOU WIN!
```


#### Losing Game
```
$  java Pig
Welcome to the game of Pig!

How many points are required to win? 25
Enter a value to use to 'seed' the random number(negative number will not seed): 0
	Your turn
	You rolled: 5
	Your turn score is 5 and your total score is 0
	If you hold, you will have 5 points.
	Enter 'r' to roll again, 's' to stop: s
	Your score is 5

It is the computer's turn.
	The computer rolled: 2
	The computer rolled: 4
	The computer rolled: 4
	The computer rolled: 4
	The computer rolled: 2
	The computer rolled: 3
	The computer rolled: 6
	The computer holds.
	The computer's score is 25

THE COMPUTER WINS!
```

### Implementation Notes:
1. Seeding your random number generator with the same value will ensure that your die returns the same sequence of numbers which can be helpful in testing your code.
1. Work in small steps.
Once you've added new code that is working, commit your code.
Committing code doesn't cost anything, but **not** committing will cost you a lot of time.

### Submission Requirements:
1. All code must be added and committed to your local git repository.
1. All code must be pushed to the GitHub repository created when you "accepted" the assignment.
	1. After pushing, with `git push origin master`, visit the web URL of your repository to verify that your code is there.
	If you don't see the code there, then we can't see it either.
1. If your program will not compile, the graders will not be responsible for trying to test it.

## Important Notes:
* Projects will be graded on whether they correctly solve the problem, and whether they adhere to good programming practices.
* Projects must be received by the time specified on the due date. Projects received after that time will get a grade of zero.
* Please review the academic honesty policy.
	* Note that viewing another student's solution, whether in whole or in part, is considered academic dishonesty.
	* Also note that submitting code obtained through the Internet or other sources, whether in whole or in part, is considered academic dishonesty.
	* All programs submitted will be reviewed for evidence of academic dishonesty, and all violations will be handled accordingly.