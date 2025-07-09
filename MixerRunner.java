class MixerRunner {

    public static void main(String[] mixer) {
        System.out.println("Main is started");

        Mixer.onOrOff();          
        Mixer.increaseSpeed();   
        Mixer.increaseSpeed();
        Mixer.increaseSpeed();
        Mixer.increaseSpeed();
        Mixer.increaseSpeed();    
        Mixer.onOrOff();          
        Mixer.increaseSpeed();    
        Mixer.onOrOff();          
        Mixer.decreaseSpeed();    
        Mixer.decreaseSpeed();

        System.out.println("Main is ended");
    }
}
