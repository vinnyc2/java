class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    
    print(allowance() + " days");
    addTwoNumbers();
    print("GCF: " + GCF(12, 18));

  }

int allowance(){
    double money = 0.01;
    int days = 1;

    while(money < 5){
      money *= 2;
      days++;
    }

    return days;
  }
void addTwoNumbers(){
    int num1 = randInt(1, 11);
    int num2 = randInt(1, 11);

print("what is " + n1 " + "+ n2 " = ");
int answer = Input.readInt();
while (!(answer == n1+n2) ) {
  print("Incorrect, try again..."); 
  answer Input.readInt();
}
print("Correct!");
}

  int GCF(int num1, int num2){

    while(num2 != 0){
      int remainder = num1 % num2;
      num1 = num2;
      num2 = remainder;
    }
    return num1;
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}