void main(){
    int sumatoria1 = 0;
    int limite = 1000;
    for (int i = 1; i < limite; i++){
        if (i%3 == 0 || i%5 == 0){
            sumatoria1 += i;
            IO.println(sumatoria1);
        }
    }
}