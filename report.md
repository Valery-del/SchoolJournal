# Отчёт по лабораторной работе: Школьный журнал

## Цель и задачи
Цель: Освоить Git в VS Code, разработать приложение "Школьный журнал".
Задачи:
- Настроить Git, создать репозиторий с веткой main.
- Реализовать приложение (MVC) с поиском оценок и фильтрацией.
- Работать с ветками, конфликтами, откатами.
- Опубликовать на GitHub.

## Описание ПО
Консольное приложение (Java, MVC):
- Сущности: Student, Subject, Grade.
- Операции: поиск оценок, фильтрация по среднему баллу.

## История команд
| Команда | Назначение |
|---------|------------|
| `git branch -m master main` | Переименование master в main |
| `javac src/*.java` | Компиляция всех Java-файлов |
| `git merge feature/models` | Слияние моделей |
| `git merge conflict-branch` | Слияние с конфликтом |

## Скриншоты
- `ls src/` и `ls src/*.class`
- `java -cp src SchoolJournal` (вывод программы)
- `Student.java` (конфликт до/после)
- `git log --oneline --graph`
- GitHub (репозиторий, default branch: main)

## Ссылка
https://github.com/yourusername/school-journal