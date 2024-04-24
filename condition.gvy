if (4 > 3) {
  println "XYZ"
} else {
  println ":("
}

int x = 15
int y = 30
if (x==15){
  if(y>10){
    println ("y>10")
  } else {
    println ("y closer to 5")
  }
} else {
  println ("x!=15")
}

def i = 12
if(i>23){
  println (i + " more than 2222")
} else if (i<=23&&i>=5) {
  println (i + " is in range between 5 and 23")
}else{
  println (i + " is less then 5")
}

def xx = 17
def result = ""
switch(xx) {
  case "bar":
    result+="bar"
    break
  case [4,5,17,'inList']:
    result = "list"
    break
  case 10..20:
    result = "range"
    break
  case Integer:
    result = "integer"
    break
  case Number:
    result="number"
    break
  default:
    result = "default"
}
println result

//Ternarny
//def sttrr
//println sttrr
def string
//def string = "Tarkov"
result = ( string != null && string.length() > 0) ? 'Found' : 'Not Found'
println result

int ff = 6
result=(ff>5&&ff<20)?'In range between 5 and 20':'bad'
println result

println (ff ? 'Found' : 'Not found')