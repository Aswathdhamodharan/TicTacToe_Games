🎮 Tic-Tac-Toe Game (Java - Console Based)

A simple console-based Tic-Tac-Toe game built using Java and Object-Oriented Programming principles. This project demonstrates clean Low-Level Design (LLD), class separation, and game state management.

📌 About the Game

Tic-Tac-Toe is a two-player strategy game played on a 3 × 3 grid.

🧩 Rules

Two players take turns.

Player 1 uses 'X'

Player 2 uses 'O'

A player wins if they place 3 of their symbols:

In a row

In a column

Diagonally

If the board fills and no one wins → Game Draw

🏗 Project Structure

The project follows proper Low-Level Design with clear class separation:

🔹 Player Class

Stores player name

Stores player symbol (X or O)

🔹 Board Class

Maintains 3x3 grid

Handles:

Move placement

Board printing

Win checking

Draw checking

🔹 Main (Game Controller)

Controls game flow

Manages turn switching

Takes user input

Checks win/draw conditions

🛠 Technologies Used

Java

Object-Oriented Programming (OOP)

Scanner for input handling

Console-based UI

▶️ How to Run
1️⃣ Clone the Repository
git clone <your-repository-link>
2️⃣ Navigate to Project Folder
cd TicTacToe
3️⃣ Compile
javac Main.java
4️⃣ Run
java Main
🖥 Sample Gameplay
  |   |  
---------
  |   |  
---------
  |   |  

Player 1 enter row and column (0-2):
0 0

X |   |  
---------
  |   |  
---------
  |   |  

If a player wins:

Player 1 wins!

If the board fills without a winner:

Game Draw!
