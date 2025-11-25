void main(){
    String password = generatePassword();
    IO.println(password);
}

public static String generatePassword(){
    double aleatorio = Math.random()*1000000;
    long numeroAleatorio = Math.round(aleatorio);
    String password = ",kjsflkjbafvbaelakjhvblquekfbvliaefhlo"+numeroAleatorio  ;
    return password;
}