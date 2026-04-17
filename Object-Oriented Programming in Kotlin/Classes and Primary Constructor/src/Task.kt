// TODO: Оголосіть клас Student з первинним конструктором (val name: String, var age: Int)

fun createStudent(): String {
    class Student(val name: String, var age: Int)
    val student = Student("Ivan", 20)
    student.age = 21
    return "${student.name} is ${student.age}"
}