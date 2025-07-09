class FanRunner {

    public static void main(String[] fan) {
        System.out.println("Main is started");

        Fan.onOrOff();          
        Fan.increaseSpeed();    
        Fan.increaseSpeed();    
        Fan.increaseSpeed();    
        Fan.increaseSpeed();    
        Fan.increaseSpeed();    
        Fan.onOrOff();         
        Fan.increaseSpeed();    
        Fan.onOrOff();
        Fan.decreaseSpeed();    
        Fan.decreaseSpeed();   

        System.out.println("Main is ended");
    }
}
