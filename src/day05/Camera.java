package day05;
interface Camera {
    default void start(){ 
    	System.out.println("Camera on"); 
    }
    static interface CameraA{
    	
    }
}