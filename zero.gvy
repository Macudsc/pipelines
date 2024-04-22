println 500 + 100 //ssssss
/*
dsd
sd
*/
println 500 - 100
println 10 / 5
println "Hello vscode"

String str1
def y

y = 1

str1 = "New string"

def (q, w, r) = [0.001, 9, 'new text']

println q.getClass()

println 'This' + 'Sus'

println "this is ${Varible}"

def t1 = false
def t2 = true
if( !t1 ) {
  println "t1 is $t1"
}
if( t2 ) {
  println "t2 is ${t2}"
} else {
  println "..."
}

def b1 = false
def b2 = true

if(b1) {
  println "b1: ${b1}"
} else if( b2 ){
  println "b2: ${b2} and b1: $b1"
} else if(b1 && b2){
  println "ALL is TRUE"
} else {
  println "else..."
}

def varSwitch = 2
switch(varSwitch) {
  case 1:
    println "t 1"
    break;
  case 2:
    println "t 2"
    break;
  case 3:
    println "t 3"
    break;
  default:
    println "unknown.."
    break;
}

for (int i = 0; i < 5; i++) {
  print "this is i=${i}"
}
for (i in 0..5) {
  print i
}
for (Integer i : 0..5) {
  print i
}

def x1 = 0
while(x1++ < 5){
  print "x1: " + x1
}

def exampleMethod() {
  'Method called'
}

String strMethod() {
  'This is string from method'
  return "This is 0"
}

def paramMethod(param1) {
  "Prmtr1: $param1"
}

def paramDefault(String a,
                Integer b = 100,
                def c = 500){
    println "Text + {a}"
    println "Default: $b and ${c}"
}

exampleMethod()
println "exampleMethod(): " + exampleMethod()
println "strMethod(): " + strMethod()
println "paramMethod(): " + paramMethod(2340)
paramDefault('hello')


def exampleList = [0,1,2,3,4] //cifri
def emptyList = []

exampleList[0]

exampleList[6] = 5
exampleList << 6 << 7
exampleList += [8,9,10000]

for ( iter in exampleList) {println iter}

//////////////////////////

def newMap = [name: 'Snusoed', age: '400', id: 8]
println newMap.name
def emptyMap = [:]

newMap['name'] = 'Sas'
println newMap.name
println newMap['name']
newMap.name = 'Iigor'

emptyMap.put("newKey", 121212) // add
def a = emptyMap.get('newKey') //get
println a

newMap.each {key,value->println "$key and $value"}