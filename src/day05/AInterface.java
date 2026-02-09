package day05;
interface AInterface{
    void create();//its public and abstract 
    default void print(){
        System.out.println("AInterface");
    }// can be declared and can be overridden
}