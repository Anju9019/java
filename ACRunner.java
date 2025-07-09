class ACRunner {

    public static void main(String[] args) {
        System.out.println("Main is started");

        AC.onOrOff();                    
        AC.increaseTemperature();        
        AC.increaseTemperature();
        AC.increaseTemperature();
        AC.onOrOff();                   
        AC.increaseTemperature();       
        AC.onOrOff();                    
        AC.decreaseTemperature();        

        System.out.println("Main is ended");
    }
}
