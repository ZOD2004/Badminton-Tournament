package day05;

class Extended implements AInterface{
    @Override
    public void create(){

    }
    public static void main(String[] args) {
        System.out.println("hi");
        Extended ext = new Extended();
        ext.print();
    }
}