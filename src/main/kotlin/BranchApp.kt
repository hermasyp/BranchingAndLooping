class BranchApp {
    var studentScore: Int = 0
    fun run() {
        printHeader()
        inputStudentScore()
        checkStudentExamResult(studentScore)
    }

    private fun printHeader() {
        println("============")
        println("Student Exam Score Checker")
        println("============")
    }

    private fun inputStudentScore() {
        println("Enter Student Score = ")
        studentScore = try {
            readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
            0
        }
    }

    // < 0 && > 100 -> Nilai tidak valid, user diminta untuk input lagi
    // > 75 -> "Student Pass the Exam!"
    // < 75 -> "Student Failed the Exam!"
    private fun checkStudentExamResult(studentScore: Int) {
        if (studentScore < 0 || studentScore > 100) {
            println("Invalid Value, Pleas Re input !")
            inputStudentScore()
            checkStudentExamResult(this.studentScore)
        } else if (studentScore > 75) {
            println("Student Pass the Exam!")
        } else {
            println("Student Failed the Exam!")
        }
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            BranchApp().run()
        }
    }
} // end of app