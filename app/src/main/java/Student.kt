class Student(val firstName: String, val lastName: String) : Comparable<Student> {
    override fun compareTo(other: Student): Int = this.lastName.compareTo(other.lastName)
    override fun toString(): String = "$firstName $lastName"
}

val students = arrayOf(
    Student("Tutkenova", "Aruzhan"),
    Student("Onalbayeva", "Zhanna"),
    Student("Kushurova", "Ainel"),
    Student("Mystafa", "Meruert"),
    Student("Tahstanbek", "Gulsezim"),
    Student("Onalbaev", "Ulan"),
    Student("Belyankov", "Arthur"),
    Student("Azimov", "Atabek"),
    Student("Serikov", "Dimash"),
    Student("Orazbay", "Arman"),
    Student("Sapagali", "Medet"),
    Student("Oralkhan", "Zhadyra"),
    Student("Bertursyn", "Shyngys"),
    Student("Sultanov", "Sultan")
)

println(students.joinToString())
fun String.alphabetized() = String(toCharArray().apply { sort() })
println(studenta.joinToString())