# Luyện tay Java

## Những gì được học trong java-programming.mooc.fi

- Part 1: Getting started, printing, reading input, variables, calculations, conditional statements.
- Part 2: Loops, methods.
- Part 3: Lists (ArrayList), arrays, strings.
- Part 4: Intro to OOP (classes, objects), files.
- Part 5: OOP (encapsulation, constructors, getters/setters, overloading, primitive vs reference variables).
- Part 6: Objects in lists, UI/logic separation, testing, complex programs.
- Part 7: More OOP, interfaces, polymorphism (Java I ends).
- Part 8: HashMap, object similarity/equality.
- Part 9: Inheritance, interfaces, polymorphism.
- Part 10: Streams, Comparable, StringBuilder, regex, enums.
- Part 11-13/14: Generics/type parameters, implementing collections (ArrayList/HashMap), randomness, multidimensional data, algorithms.

Covers basics to intermediate OOP, data structures, and Java fundamentals.

## Danh sách dự án

| Tên dự án | Mô tả qua |
| --- | --- |
| [Simple Calculator](01_cal/README.md) | Use Scanner for input. Support +, -, *, / in a loop. Ask for numbers and operator, show result, repeat until user quits. |
| [Number Guessing Game](02_number-guessing/README.md) | Generate random number (1-100). Loop: read user guess, give "too high/low" hints. Count attempts. End when guessed correctly. |
| To-Do List Manager | Use ArrayList<String> for tasks. Menu: add task, list tasks, remove task, save to file, load from file. Use basic file I/O. |
| Basic Banking System | Create Account class with balance. Methods: deposit, withdraw, show balance. Use ArrayList<Account> to manage multiple accounts. |
| Student Grade Tracker | Create Student class (name, list of grades). Methods: add grade, calculate average, show grades. Use ArrayList<Student> for all students. |
| Library Book Manager | Create Book class (title, author, year, isBorrowed). Use ArrayList<Book>. Menu: add book, list all books, borrow book, return book, search by title/author. |
| Inventory Management System | Create Item class (id, name, quantity, price). Use ArrayList<Item>. Menu: add item, list items, update quantity, remove item, show total value. |
| Contact Book | Create Contact class (name, phone, email). Use HashMap<String, Contact> (name as key). Menu: add contact, search by name, list all, delete contact, update contact. |
| Expense Tracker with categories | Create Expense class (date, amount, category, description). Use ArrayList<Expense>. Menu: add expense, list all, show by category, total expenses, monthly summary. |
| Recipe Manager | Create Recipe class (name, list of ingredients, instructions). Use ArrayList<Recipe>. Menu: add recipe, list all recipes, search by name/ingredient, view recipe details. |
| Text File Word Counter | Read a text file using Scanner or Files. Count total words, unique words (use HashSet), and word frequency (HashMap). Display results. |
| Hangman Game | Create a list of words. Pick one randomly. Use char array or StringBuilder for hidden word. Loop: guess letter, update display, track wrong guesses. End on win or lose. |
| Rock-Paper-Scissors with stats | Play against computer (random choice). Track wins, losses, ties. Menu: play round, show statistics, reset stats. |
| Password Generator | Ask length and options (uppercase, lowercase, numbers, symbols). Generate random password using loops and StringBuilder. Allow multiple generations. |
| Movie Collection Organizer | Create Movie class (title, director, year, genre). Use ArrayList<Movie>. Menu: add movie, list all, search by title/genre, remove movie. |
| Simple ATM Simulation | Create Account class (accountNumber, pin, balance). Menu: login, check balance, deposit, withdraw, exit. Handle insufficient funds. |
| Task Scheduler | Create Task class (description, priority, dueDate). Use ArrayList<Task>. Menu: add task, list tasks (sorted by priority/due date), mark complete, remove task. |
| Vehicle Rental System | Create base Vehicle class (licensePlate, model, rentalPrice). Inherit Car, Bike, Truck with extra fields. Use ArrayList<Vehicle>. Menu: add vehicle, list available, rent, return. |
| Animal Sanctuary Simulator | Create base Animal class (name, age) with makeSound() method. Inherit different animals overriding makeSound(). Use ArrayList<Animal>. Menu: add animal, list all, make all sounds. |
| Shopping Cart | Create Item class (name, price, quantity). Create Cart class with ArrayList<Item>. Menu: add item, remove item, list cart, calculate total. |
| Dictionary | Use HashMap<String, String> (word → definition). Menu: add word, search word, list all words, delete word, update definition. |
| Quiz Game with multiple question types | Create Question base class, inherit MultipleChoice and TrueFalse. Use ArrayList<Question>. Ask questions, track score, show final result. |
| Log Analyzer | Read log file line by line. Count total lines, errors (contains "ERROR"), warnings. Use HashMap for error type frequency. Display summary. |
| Generic Pair/Tuple class | Create generic Pair<T, U> class with two values. Use it to store different data types (e.g. name-age, product-price). |
| Custom Generic Stack | Implement generic Stack<T> class using ArrayList. Methods: push, pop, peek, isEmpty, size. Test with different types. |
| Custom Generic Queue | Implement generic Queue<T> class using ArrayList. Methods: enqueue, dequeue, peek, isEmpty, size. Test with different types. |
| Student Management System | Create base Student class, inherit Undergraduate and Graduate. Use ArrayList<Student>. Menu: add student, list all, show details, calculate averages. |
| Text-Based Adventure Game | Create Room class and Player (with inventory ArrayList). Connect rooms. Menu: go direction, take item, look, inventory. |
| File-based Note Taking App | Create Note class (title, content, timestamp). Use ArrayList<Note>. Menu: create note, list notes, view note, delete note, save/load from file. |
| Personal Finance Analyzer | Create Transaction class (date, amount, category, type). Use ArrayList<Transaction>. Menu: add transaction, list all, summaries (total income/expense, by category) using streams.

