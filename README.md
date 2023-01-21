# Домашнее заданиен к занятию "Строки и массивы"

### Задание 1. Статистика

Статистика - очень важный компонент любого бизнеса. У вас есть набор данных о продажах конкретного предприятия по месяцам: [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18].
Программисты все заняты , и вам поручили написать небольшой сервис, который умеет по предоставленному ему массиву месячных продаж рассчитывать:
1. Сумму всех продаж.
2. Среднюю сумму продаж в месяц.
3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
5. Количество месяцев, в которых продажи были ниже среднего (см.п.2).
6. Количество месяцев, в которых продажи были выше среднего (см.п.2).

Примечание:* в вашем задании нужно найти последний месяц, соответствующий условиям.

Сервис должен  представлять собой один класс с шестью методами - по методу на пункт. Входные данные для расчета сервис должен принимать в параметрах своих методов. Обратите внимание, что написанный класс должен уметь работать с любыми значениями в массиве продаж, а приведенный наболр - это лишь пример данных для ваших тестов на методы создаваемого класса.

