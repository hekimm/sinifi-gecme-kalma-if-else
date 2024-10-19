# Student Grade Calculator

This project is a simple Java-based grade calculator. It takes input scores for several subjects, calculates the average score, and determines whether the student has passed or failed based on the calculated average.

## Features

- Input grades for different subjects.
- Calculate the average score of all subjects.
- Determine if the student has passed or failed (passing grade is 55 or higher).

## Subjects

The subjects for which the grades are taken include:

- Mathematics
- Physics
- Turkish
- Chemistry
- Music

## Usage

The program runs in the command line and interacts with the user to gather the input scores and determine the outcome. Here is a step-by-step explanation of how the system works:

1. The user is prompted to enter their grades for Mathematics, Physics, Turkish, Chemistry, and Music.
2. The program calculates the average of these grades.
3. Based on the average, one of the following outcomes is displayed:
   - **Failed**: If the average is below 55, the user is notified that they have failed.
   - **Passed**: If the average is 55 or above, the user is notified that they have passed.

## How to Run

To run this project, you need to have Java installed on your computer. Follow these steps:

1. Save the `Main.java` file.
2. Open a terminal and navigate to the directory where the file is saved.
3. Compile the program using the following command:

   ```sh
   javac Main.java
   ```

4. Run the program using the following command:

   ```sh
   java Main
   ```

5. Follow the prompts to enter your grades for each subject.

## Example Output

```
Matematik notunuzu giriniz:
70
Fizik notunuzu giriniz:
65
Türkçe notunuzu giriniz:
80
Kimya notunuzu giriniz:
55
Müzik notunuzu giriniz:
90
Ortalamanız: 72.0
Geçtiniz !!
```

## Code Overview

- **User Input**: The program takes integer inputs for each of the subjects using the `Scanner` class.
- **Average Calculation**: The average of the grades is calculated by summing the grades and dividing by 5.0.
- **Pass/Fail Determination**: If the average is below 55, the user is notified of failure; otherwise, they are notified of passing.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

- **Hekim Can Aktas** - [GitHub](https://github.com/hekimcanaktas)

