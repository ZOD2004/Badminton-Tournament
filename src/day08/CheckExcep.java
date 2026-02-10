class CheckException{
    public static void main(String[] args) {
        int a =5;
        if(a<18){
            throw new IllegalAgeException("Age is below 18");
        }else{
            System.out.println("you are above 18");
        }
    }
}