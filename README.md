# Project BlueSudoku

BlueSudoku
The classic sudoku game consists of a 9 × 9 grid with some squares beeing filled with numbers from 1-9.
The goal of the puzzle is to fill the rest of the grid, using all the numbers 1–9 exactly once in each row, column, and the nine 3 × 3 subgrids.

## Team Members

* Chengjiang He (chengjiang.he@usi.ch), CodingCarson
* Eduardo Trabattoni (trabae@usi.ch), EduTrab

## Mentor

* Igor Moreno Santos

## Functionality

* The sudoku game can be played with a TUI or a GUI.
* The user can choose the difficulty level from "Easy", "Medium" and "Hard". The system will randomly select a game of corresponding difficulty from more than 30 sudoku files. The higher the difficulty, the fewer numbers are given.
* After the difficulty is choose and the sudoku game is generated, the user can fill empty cells with numbers from 1 to 9 (inclusive) to try to solve this sudoku game. Once he/she finishes, he/she can click the "check" button to check if his/her answer is correct.
* The user want to stop the current game and go back to the difficulty selection at any time by clicking "menu" button.
* (Only available with TUI) More exciting, the user can also create his/her own sudoku puzzle and ask a AI player to try to solve it.

## TUI and GUI command lines
* TUI: target/classes tui.Main
* GUI: target/classes gui.Main

## Screenshots of TUI
* Fill the cells
![image](https://github.com/EduTrab/project-bluesudoku/blob/main/screenShots/tui_fill.png)

* Check the answer
![image](https://github.com/EduTrab/project-bluesudoku/blob/main/screenShots/tui_checkAnswer.png)

* DIYSudoku puzzle
![image](https://github.com/EduTrab/project-bluesudoku/blob/main/screenShots/tui_DIYSudoku.png)

* AI Solution
![image](https://github.com/EduTrab/project-bluesudoku/blob/main/screenShots/tui_aiSulution.png)

## Screenshots of GUI
* Main menu
![image](https://github.com/EduTrab/project-bluesudoku/blob/main/screenShots/gui_menu.png)

* Sudoku puzzle
![image](https://github.com/EduTrab/project-bluesudoku/blob/main/screenShots/gui_game.png)

## Screenshots of class diagrams
* Packge
![image](https://github.com/EduTrab/project-bluesudoku/blob/main/screenShots/diagram_package.png)

* Model
![image](https://github.com/EduTrab/project-bluesudoku/blob/main/screenShots/diagram_model.png)

* TUI
![image](https://github.com/EduTrab/project-bluesudoku/blob/main/screenShots/diagram_tui.png)

* GUI
![image](https://github.com/EduTrab/project-bluesudoku/blob/main/screenShots/diagram_gui.png)

## Project Structure

This project is both a Maven project and a BlueJ project.
You can open, compile, test, and run the code within BlueJ
by opening `src/package.bluej`.

You can use Maven to compile, test, and check the code
by running `mvn` in this top-level directory (see below).

You can run the code compiled by Maven from the terminal (see below).

The code is structured into three packages:

* `model` - all the model classes and their tests
* `tui` - text user interface (works in a terminal)
* `gui` - Swing-based graphical user interface (opens a window)

Note that the classes in the `model` package MUST NOT refer to any
classes in the `tui` or `gui` packages.

The classes in the `tui` package must not refer to any classes in the `gui` package.

The classes in the `gui` package must not refer to any classes in the `tui` package.

The classes in the `tui` and `gui` packages SHOULD refer to classes in the `model` package.

The classes in the `model` package need to come with unit tests.
(The classes in the `tui` and `gui` packages do not need to be covered with tests.)

## How build using Maven

In this top-level directory:

```bash
mvn compile
```

## How to run the application

To run the application from outside BlueJ, first build it with Maven.
This generates the compiled classes in the directory `target/classes`.

## Running the TUI

To run this application, with the TUI, from the command line:

```bach
java -cp target/classes tui.Main
```

java -cp target/classes tui.Main  (No arguement)

## Running the GUI

To run this application, with the GUI, from the command line:

```bach
java -cp target/classes gui.Main
```

java -cp target/classes gui.Main  (No arguement)

### How run the JUnit tests with Maven

```bash
mvn test
```

### How to run Checkstyle with Maven

```bash
mvn compile
mvn checkstyle:check
```

### How to run Checkstyle with Maven

```bash
mvn compile
mvn checkstyle:check
```

### How to run PMD with Maven

```bash
mvn compile
mvn pmd:check
```

### How to run PMD's CPD with Maven

```bash
mvn compile
mvn pmd:cpd-check
```

### How to determine test coverage with Maven

```bash
mvn site
```

Then open `target/site/index.html` and find the JaCoCo report.
