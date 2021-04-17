
I built this program on Jdk 16, so it required Gradle version 7+ to run correctly, hopefully
the gradle wrapper attached to the program will let the application run without needing to locally
set it up.

To run:
Execute the following command:
./gradlew clean build run

You can then enter the string you want to parse in the command line.

Things I would improve on the app given unlimited time:
The instructions on the prompt weren't clear if we want simply want to make sure that we have the correct
number of open and close brackets or if we also needed to make sure indentation was correct, I operated under
the assumption that the code needed to acknowledge if a strings parantheses, if any, would be correct.

This operation is O(N), so long as the string isn't so huge it causes the JVM to go nuts or we don't have so many
open parantheses that we overcome and int, then we are good.