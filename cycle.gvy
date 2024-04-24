String msg = ''
for(int i=0;i<=8;i+=2){
  msg+=" hi $i "
}
println msg

def numbers = [1,2,3,4,5]
for(number in numbers){
  println "this is $number"
}

for(i in 0..13){
  print i + ( i==13 ? '\n' : '--' )
}

def text = "QWERTY"
def list = []
for (chara in text){
  list.add(chara)
}
println list


def count = 5
while(count<21){
  print count+" | "
  count+=3
}
println ''

count = 2
def fact = 1
do {
  fact *= count--
}while(count>2)
println fact

count = 2
fact = 1
while(count>2){
  fact *= count--
}
println fact

for(int i in [0,10,200,30,45,500]){
  print(i+' | ');
  if(i==30){
    println ''
    break
  }
}

numbers = [0,10,200,30,45,500]
for(int i=0;i<numbers.size();i++){
  if(numbers[i]==30)
    continue
  print(numbers[i]+' | ')
}