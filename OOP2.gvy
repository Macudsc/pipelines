import groovy.transform.TupleConstructor

@TupleConstructor
class Student {
    String firstName
    Integer age
}

println 'xd'

class Test {
    static void main(String[] args) {
        Student student1 = new Student(firstName: "Petro", age: 64)
        Student student2 = ["Evgeniy", 48] // благодаря аннотации @TupleConstructor
        println student2.age
    } // main

} // class