class Person {
  String name = 'Huh'
  Integer age = 1

  def levelUp (Integer years){
    this.age += years
  }
}

def p = new Person()
println p.levelUp(12)
//p = new Person()
//println p


class Outer {
    private String privateStr = 'outer'

    def callInnerMethod() {
        new Inner().methodA()   // создается экземпляр внутреннего класса и вызывается его метод    
    }

    class Inner {      // определение внутреннего Inner класса, внутри внешнего Outer класса        
        def methodA() {
            // будучи закрытым, доступ к полю вшешнего класса есть у внутреннего классом
            println "${privateStr}."  
        }
    }
}
def o = new Outer()
o.callInnerMethod()


class Outer2 {
    private String privateStr = 'some string'

    def startThread() {
        new Thread(new Runnable() {    // безымяный внутрений класс обратите внимание на ()  
            void run() {
                println "${privateStr}."
            }
        }).start() // метод start вызывается              
    }
}
o = new Outer2()
o.startThread()


class Outer2_1 {
  private String newline = "Что за бизнес?"

  def hosok () {
    new Thread(new Runnable() {
      void run() {
        println "$newline Обознатушки"
      }
    }
    ).start()
  }
}
def testo = new Outer2_1()
testo.hosok()

// абстрактные классы должны быть объявлены с ключевым словом abstract

abstract class Abstract {         
    String name
    // абстрактные методы также должны быть объявлены с помощью ключевого слова abstract
    abstract def abstractMethod() 

    def concreteMethod() {
        println 'concrete'
    }
}

interface Shape {
  void draw (String name)
} // интерфейс определяет только сигнатуры методов, реализации НЕТ

// Прямоугольник объявляет интерфейс Shape с помощью ключевого слова Implements.
class Rectangle implements Shape {
    // Затем реализует требуемый метод draw(String name)
    void draw(String name) {
        println "painted $name"
    }
}
def rectangle = new Rectangle()
// Любой экземпляр Rectangle также является экземпляром интерфейса Shape.
println rectangle instanceof Shape // вернет true

class Goshan implements Shape {
  void draw(String name){
    println "Magaz: $name"
  }
}
def mag = new Goshan()
println mag instanceof Goshan

interface Shape2 {
    void draw(String name)  // интерфейс определяет только сигнатуры методов, реализации НЕТ
}
// интерфейс ExtendedShape2 расширяет интерфейс Shape2 с помощью ключевого слова extends
interface ExtendedShape2 extends Shape2 {
    void delete(String name)
}


interface Shape3 {
    void draw(String name)  // интерфейс определяет только сигнатуры методов, реализации НЕТ
}
class Triangle {
    void draw(String name) { println "Triangle ${name}" }
}

triangleDefault = new Triangle()
println triangleDefault instanceof Shape3 // вернет false

triangleAsShape3 = triangleDefault as Shape3
println triangleAsShape3 instanceof Shape3  // вернет true


class Person2 {
    String name
    Integer age
    // Объявление конструктора
    Person2(name, age) {
        this.name = name
        this.age = age
    }
}

def p1 = new Person2('Alex', 1)    // вызов конструктора, как в Java
def p2 = ['Valera', 2] as Person2  // конструктор с использованием принуждения с ключевым словом as
Person2 p3 = ['Marie', 3]          // конструктор с использованием принуждения в присваивании

class Person3 {   // конструктор не объявлен в классе
    String name
    Integer age
}

def p21 = new Person3()                 // в экземпляре не указаны параметры
def p22 = new Person3(name: 'Valera')   // параметр name, указанный в экземпляре
def p23 = new Person3(age: 1)           // age параметр, указанный в экземпляре
def person4 = new Person3(name: 'Petro', age: 2) // параметры name & age, указанные в экземпляре

class Person4 {
    String name    // создает резервное поле частного имени String, методы getName и setName
    int age       // создает резервное частное целое поле age, методы getAge и setAge
}

Person4 p4 = new Person4()
p4.setName('Valera')
println p4.getName()


class Person5 {
    String name
    void name(String name) {
        /* this.name будет напрямую обращаться к полю,
           доступ к свойству осуществляется из класса, который его определяет. */
        this.name = "Wonder $name"
    }
    String title() {
        /* аналогично доступ для чтения осуществляется непосредственно в поле имени */
        println this.name
    }
}
def p5 = new Person5()

// доступ на запись к свойству осуществляется вне класса Person5, будет неявно вызывать setName
p5.name = 'Diana'

// доступ для чтения к свойству осуществляется вне класса Person5, будет неявно вызывать getName
println p5.name == 'Diana'

p5.name('Woman') // вызовет метод name для Person5, который выполняет прямой доступ к полю

// вызовет метод title для Person5, который выполняет прямой доступ для чтения к полю
println (p5.title() == 'Wonder Woman')

class Person6 {
    String name
    String last
    int age
}
def p6 = new Person()
println p6.properties.keySet() /// [class, age, last, name]

class PseudoProperties {
    // псевдосвойство "name"
    void setName(String name) {}
    String getName() {}

    // псевдо-свойство только для чтения "age"
    int getAge() { 42 }

    // псевдо-свойство только для записи "groovy"
    void setGroovy(boolean groovy) {  }
}
def p7 = new PseudoProperties()

//запись p.name разрешена, потому что это имя псевдо-свойства.
p7.name = 'Foo'

// чтение p.age разрешено, потому что существует свойство age псевдо-только для чтения.
println p7.age == 42

// запись p.groovy разрешена, потому что у groovy есть свойство псевдозаписи только для записи.
p7.groovy = true