// загружаем библиотеку обработки csv
@Grab('com.xlson.groovycsv:groovycsv:1.3')
//@Grab('org.codehaus.groovy:groovy-xml:3.0.9')
//import groovy.xml.MarkupBuilder
import static com.xlson.groovycsv.CsvParser.parseCsv

// Задаем в переменной csv"
def csvText = '''name,lastName,phone
Dmitro,Petrov,+79343943
Alex,Fox,898734923
Mari,Lee,798743023
Skali,Wood,89873242432'''

def data = parseCsv(csvText) // разбираем csv
println("NAME | \t | LastName | \t | PHONE \n")
for(line in data) { // выбираем по строке из общего количества данных
    printf("%-12s %-12s %-12s\n", "$line.name", "$line.lastName",  "$line.phone")
}


loadFile = new File('example.csv')
def csv_content = loadFile.getText('utf-8')

def dataAll = parseCsv(csv_content, separator: ',', readFirstLine: true)
for (line in dataAll) {
    println line[2] + " | " + line[3]
}




//def writer = new FileWriter("../groovy/data.xml" ) // изменить путь до места куда у вас есть доступа
//def xml = new MarkupBuilder(writer)


//xml.records() {
//    car(name: 'HSV Maloo', make: 'Holden', year: 2006) {
//        country('Australia')
//        record(type: 'speed', 'Production Pickup Truck with speed of 271kph')
//    }
//    car(name: 'Royale', make: 'Bugatti', year: 1931) {
//        country('France')
//        record(type: 'price', 'Most Valuable Car at $15 million')
//    }
//}


import groovy.json.JsonSlurper // сделайте импорт JsonSlurper

def jsonSlurper = new JsonSlurper() // создаем объект JsonSlurper

// Затем мы используем функцию parseText класса JsonSlurper для анализа некоторого текста JSON.
def object = jsonSlurper.parseText('{ "name": "Evgeniy Lestopadov", "quality": "Evgenka eblan" } ')

// Когда мы получаем объект, мы можем получить доступ к значениям в строке JSON через ключ.
println object.getClass()  // class org.apache.groovy.json.internal.LazyMap
println object         // [name:Evgeniy Lestopadov]
println object.quality    // Evgeniy Lestopadov




object = jsonSlurper.parseText('{ "myList": [4, 8, 15, 16, 23, 42] }')

println object.getClass() // class org.apache.groovy.json.internal.LazyMap
println object.myList   //[4, 8, 15, 16, 23, 42]


import groovy.json.JsonOutput // сделайте импортJsonOutput
def json = JsonOutput.toJson([name: 'John Doe', age: 42])

println json // {"name":"John Doe","age":42}


class Person { String name }
json = JsonOutput.toJson([ new Person(name: 'Petro'), new Person(name: 'Valera') ])
println json // [{"name":"Petro"},{"name":"Valera"}]


import groovy.yaml.YamlSlurper
def ys = new YamlSlurper()

def yaml = ys.parseText '''
language: groovy
sudo: required
dist: latest

matrix:
  include:
    - jdk: openjdk11
    - jdk: oraclejdk10
    - jdk: oraclejdk9

'''

println yaml.language             // groovy
println yaml.sudo                 // required
println yaml.dist                 // latest
println yaml.matrix.include.jdk   // [openjdk11, oraclejdk10, oraclejdk9]


import groovy.yaml.YamlBuilder

def builder = new YamlBuilder()
builder.records {
    car {
        name 'Stuff'
        make 'RU'
        year 2026
        country 'Russia'
        homepage new URL('http://stepik.org')
        record {
            type '0003'
            description 'production 007'
        }
    }
}

println builder