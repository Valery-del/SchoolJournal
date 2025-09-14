# Школьный журнал

## Описание
Консольное приложение на Java для учёта оценок учеников по предметам. Поддерживает:
- Поиск оценок по ученику.
- Фильтрацию учеников по среднему баллу.

## Установка и запуск
1. Клонируйте: `git clone <url>`
2. Соберите: `javac src/*.java`
3. Запустите: `java -cp src SchoolJournal`

## Архитектура
- Model: Student.java, Subject.java, Grade.java
- Controller: JournalController.java
- View: ConsoleView.java