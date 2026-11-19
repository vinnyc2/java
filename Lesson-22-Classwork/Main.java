class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

void init(){
    String[] friends = {"Jackson","Gabriel","Vinny","Porchetta"};
    double[] tempC = {-3.4,0,11,37,95,120};
    double[] tempF = convert(tempC);
    
  }

  double[] convert(double[] temp){

    double[] farhen = new double[temp.length];
    for(int x=0; x<=temp.length-1;x++){
      farhen[x] = celsiusToFarhenheit(temp[x]);
    }
    return farhen;
  }

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}