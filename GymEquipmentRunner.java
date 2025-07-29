class GymEquipment {
    int equipmentId;
    String name;
    String type;
    String brand;
    double price;
    String material;
    String usage;  
}

class GymEquipmentRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        GymEquipment eq1 = new GymEquipment();
        eq1.equipmentId = 1;
        eq1.name = "Treadmill";
        eq1.type = "Cardio";
        eq1.brand = "ProForm";
        eq1.price = 1200.0;
        eq1.material = "Steel";
        eq1.usage = "Running, Walking";

        System.out.println("Equipment id " + eq1.equipmentId);
        System.out.println("Name: " + eq1.name);
        System.out.println("Type: " + eq1.type);
        System.out.println("Brand: " + eq1.brand);
        System.out.println("Price: $" + eq1.price);
        System.out.println("Material: " + eq1.material);
        System.out.println("Usage: " + eq1.usage);

        GymEquipment eq2 = new GymEquipment();
        eq2.equipmentId = 2;
        eq2.name = "Dumbbells";
        eq2.type = "Strength";
        eq2.brand = "Bowflex";
        eq2.price = 300.0;
        eq2.material = "Iron";
        eq2.usage = "Weightlifting";

        System.out.println("Equipment id " + eq2.equipmentId);
        System.out.println("Name: " + eq2.name);
        System.out.println("Type: " + eq2.type);
        System.out.println("Brand: " + eq2.brand);
        System.out.println("Price: $" + eq2.price);
        System.out.println("Material: " + eq2.material);
        System.out.println("Usage: " + eq2.usage);

        // --- similarly for equipment 3 to 20 ---

        GymEquipment eq3 = new GymEquipment();
        eq3.equipmentId = 3;
        eq3.name = "Exercise Bike";
        eq3.type = "Cardio";
        eq3.brand = "Schwinn";
        eq3.price = 850.0;
        eq3.material = "Steel";
        eq3.usage = "Cycling";

        System.out.println("Equipment id " + eq3.equipmentId);
        System.out.println("Name: " + eq3.name);
        System.out.println("Type: " + eq3.type);
        System.out.println("Brand: " + eq3.brand);
        System.out.println("Price: $" + eq3.price);
        System.out.println("Material: " + eq3.material);
        System.out.println("Usage: " + eq3.usage);

        GymEquipment eq4 = new GymEquipment();
        eq4.equipmentId = 4;
        eq4.name = "Kettlebell";
        eq4.type = "Strength";
        eq4.brand = "Rogue";
        eq4.price = 50.0;
        eq4.material = "Cast Iron";
        eq4.usage = "Weightlifting";

        System.out.println("Equipment id " + eq4.equipmentId);
        System.out.println("Name: " + eq4.name);
        System.out.println("Type: " + eq4.type);
        System.out.println("Brand: " + eq4.brand);
        System.out.println("Price: $" + eq4.price);
        System.out.println("Material: " + eq4.material);
        System.out.println("Usage: " + eq4.usage);

        GymEquipment eq5 = new GymEquipment();
        eq5.equipmentId = 5;
        eq5.name = "Pull-up Bar";
        eq5.type = "Strength";
        eq5.brand = "Iron Gym";
        eq5.price = 40.0;
        eq5.material = "Steel";
        eq5.usage = "Pull-ups";

        System.out.println("Equipment id " + eq5.equipmentId);
        System.out.println("Name: " + eq5.name);
        System.out.println("Type: " + eq5.type);
        System.out.println("Brand: " + eq5.brand);
        System.out.println("Price: $" + eq5.price);
        System.out.println("Material: " + eq5.material);
        System.out.println("Usage: " + eq5.usage);

        GymEquipment eq6 = new GymEquipment();
        eq6.equipmentId = 6;
        eq6.name = "Yoga Mat";
        eq6.type = "Flexibility";
        eq6.brand = "Liforme";
        eq6.price = 100.0;
        eq6.material = "Rubber";
        eq6.usage = "Yoga, Stretching";

        System.out.println("Equipment id " + eq6.equipmentId);
        System.out.println("Name: " + eq6.name);
        System.out.println("Type: " + eq6.type);
        System.out.println("Brand: " + eq6.brand);
        System.out.println("Price: $" + eq6.price);
        System.out.println("Material: " + eq6.material);
        System.out.println("Usage: " + eq6.usage);

        GymEquipment eq7 = new GymEquipment();
        eq7.equipmentId = 7;
        eq7.name = "Resistance Bands";
        eq7.type = "Flexibility";
        eq7.brand = "Fit Simplify";
        eq7.price = 25.0;
        eq7.material = "Latex";
        eq7.usage = "Strengthening";

        System.out.println("Equipment id " + eq7.equipmentId);
        System.out.println("Name: " + eq7.name);
        System.out.println("Type: " + eq7.type);
        System.out.println("Brand: " + eq7.brand);
        System.out.println("Price: $" + eq7.price);
        System.out.println("Material: " + eq7.material);
        System.out.println("Usage: " + eq7.usage);

        GymEquipment eq8 = new GymEquipment();
        eq8.equipmentId = 8;
        eq8.name = "Medicine Ball";
        eq8.type = "Strength";
        eq8.brand = "Nike";
        eq8.price = 60.0;
        eq8.material = "Leather";
        eq8.usage = "Core Strength";

        System.out.println("Equipment id " + eq8.equipmentId);
        System.out.println("Name: " + eq8.name);
        System.out.println("Type: " + eq8.type);
        System.out.println("Brand: " + eq8.brand);
        System.out.println("Price: $" + eq8.price);
        System.out.println("Material: " + eq8.material);
        System.out.println("Usage: " + eq8.usage);

        GymEquipment eq9 = new GymEquipment();
        eq9.equipmentId = 9;
        eq9.name = "Jump Rope";
        eq9.type = "Cardio";
        eq9.brand = "Crossrope";
        eq9.price = 35.0;
        eq9.material = "Plastic";
        eq9.usage = "Jumping";

        System.out.println("Equipment id " + eq9.equipmentId);
        System.out.println("Name: " + eq9.name);
        System.out.println("Type: " + eq9.type);
        System.out.println("Brand: " + eq9.brand);
        System.out.println("Price: $" + eq9.price);
        System.out.println("Material: " + eq9.material);
        System.out.println("Usage: " + eq9.usage);

        GymEquipment eq10 = new GymEquipment();
        eq10.equipmentId = 10;
        eq10.name = "Foam Roller";
        eq10.type = "Flexibility";
        eq10.brand = "TriggerPoint";
        eq10.price = 45.0;
        eq10.material = "EVA Foam";
        eq10.usage = "Massage, Recovery";

        System.out.println("Equipment id " + eq10.equipmentId);
        System.out.println("Name: " + eq10.name);
        System.out.println("Type: " + eq10.type);
        System.out.println("Brand: " + eq10.brand);
        System.out.println("Price: $" + eq10.price);
        System.out.println("Material: " + eq10.material);
        System.out.println("Usage: " + eq10.usage);

        GymEquipment eq11 = new GymEquipment();
        eq11.equipmentId = 11;
        eq11.name = "Bench Press";
        eq11.type = "Strength";
        eq11.brand = "Body-Solid";
        eq11.price = 800.0;
        eq11.material = "Steel";
        eq11.usage = "Chest Workout";

        System.out.println("Equipment id " + eq11.equipmentId);
        System.out.println("Name: " + eq11.name);
        System.out.println("Type: " + eq11.type);
        System.out.println("Brand: " + eq11.brand);
        System.out.println("Price: $" + eq11.price);
        System.out.println("Material: " + eq11.material);
        System.out.println("Usage: " + eq11.usage);

        GymEquipment eq12 = new GymEquipment();
        eq12.equipmentId = 12;
        eq12.name = "Smith Machine";
        eq12.type = "Strength";
        eq12.brand = "Powerline";
        eq12.price = 1500.0;
        eq12.material = "Steel";
        eq12.usage = "Weightlifting";

        System.out.println("Equipment id " + eq12.equipmentId);
        System.out.println("Name: " + eq12.name);
        System.out.println("Type: " + eq12.type);
        System.out.println("Brand: " + eq12.brand);
        System.out.println("Price: $" + eq12.price);
        System.out.println("Material: " + eq12.material);
        System.out.println("Usage: " + eq12.usage);

        GymEquipment eq13 = new GymEquipment();
        eq13.equipmentId = 13;
        eq13.name = "Rowing Machine";
        eq13.type = "Cardio";
        eq13.brand = "Concept2";
        eq13.price = 900.0;
        eq13.material = "Steel";
        eq13.usage = "Rowing";

        System.out.println("Equipment id " + eq13.equipmentId);
        System.out.println("Name: " + eq13.name);
        System.out.println("Type: " + eq13.type);
        System.out.println("Brand: " + eq13.brand);
        System.out.println("Price: $" + eq13.price);
        System.out.println("Material: " + eq13.material);
        System.out.println("Usage: " + eq13.usage);

        GymEquipment eq14 = new GymEquipment();
        eq14.equipmentId = 14;
        eq14.name = "Pull-up Assist Machine";
        eq14.type = "Strength";
        eq14.brand = "Body-Solid";
        eq14.price = 650.0;
        eq14.material = "Steel";
        eq14.usage = "Pull-ups";

        System.out.println("Equipment id " + eq14.equipmentId);
        System.out.println("Name: " + eq14.name);
        System.out.println("Type: " + eq14.type);
        System.out.println("Brand: " + eq14.brand);
        System.out.println("Price: $" + eq14.price);
        System.out.println("Material: " + eq14.material);
        System.out.println("Usage: " + eq14.usage);

        GymEquipment eq15 = new GymEquipment();
        eq15.equipmentId = 15;
        eq15.name = "Battle Ropes";
        eq15.type = "Strength";
        eq15.brand = "Titan Fitness";
        eq15.price = 120.0;
        eq15.material = "Polyester";
        eq15.usage = "Cardio, Strength";

        System.out.println("Equipment id " + eq15.equipmentId);
        System.out.println("Name: " + eq15.name);
        System.out.println("Type: " + eq15.type);
        System.out.println("Brand: " + eq15.brand);
        System.out.println("Price: $" + eq15.price);
        System.out.println("Material: " + eq15.material);
        System.out.println("Usage: " + eq15.usage);

        GymEquipment eq16 = new GymEquipment();
        eq16.equipmentId = 16;
        eq16.name = "Leg Press Machine";
        eq16.type = "Strength";
        eq16.brand = "Cybex";
        eq16.price = 2000.0;
        eq16.material = "Steel";
        eq16.usage = "Leg Workout";

        System.out.println("Equipment id " + eq16.equipmentId);
        System.out.println("Name: " + eq16.name);
        System.out.println("Type: " + eq16.type);
        System.out.println("Brand: " + eq16.brand);
        System.out.println("Price: $" + eq16.price);
        System.out.println("Material: " + eq16.material);
        System.out.println("Usage: " + eq16.usage);

        GymEquipment eq17 = new GymEquipment();
        eq17.equipmentId = 17;
        eq17.name = "Chest Fly Machine";
        eq17.type = "Strength";
        eq17.brand = "Nautilus";
        eq17.price = 1800.0;
        eq17.material = "Steel";
        eq17.usage = "Chest Workout";

        System.out.println("Equipment id " + eq17.equipmentId);
        System.out.println("Name: " + eq17.name);
        System.out.println("Type: " + eq17.type);
        System.out.println("Brand: " + eq17.brand);
        System.out.println("Price: $" + eq17.price);
        System.out.println("Material: " + eq17.material);
        System.out.println("Usage: " + eq17.usage);

        GymEquipment eq18 = new GymEquipment();
        eq18.equipmentId = 18;
        eq18.name = "Ab Crunch Machine";
        eq18.type = "Strength";
        eq18.brand = "Life Fitness";
        eq18.price = 1300.0;
        eq18.material = "Steel";
        eq18.usage = "Core Workout";

        System.out.println("Equipment id " + eq18.equipmentId);
        System.out.println("Name: " + eq18.name);
        System.out.println("Type: " + eq18.type);
        System.out.println("Brand: " + eq18.brand);
        System.out.println("Price: $" + eq18.price);
        System.out.println("Material: " + eq18.material);
        System.out.println("Usage: " + eq18.usage);

        GymEquipment eq19 = new GymEquipment();
        eq19.equipmentId = 19;
        eq19.name = "Stepper Machine";
        eq19.type = "Cardio";
        eq19.brand = "StairMaster";
        eq19.price = 900.0;
        eq19.material = "Steel";
        eq19.usage = "Stepping";

        System.out.println("Equipment id " + eq19.equipmentId);
        System.out.println("Name: " + eq19.name);
        System.out.println("Type: " + eq19.type);
        System.out.println("Brand: " + eq19.brand);
        System.out.println("Price: $" + eq19.price);
        System.out.println("Material: " + eq19.material);
        System.out.println("Usage: " + eq19.usage);

        GymEquipment eq20 = new GymEquipment();
        eq20.equipmentId = 20;
        eq20.name = "Elliptical Trainer";
        eq20.type = "Cardio";
        eq20.brand = "NordicTrack";
        eq20.price = 1300.0;
        eq20.material = "Steel";
        eq20.usage = "Low-impact Cardio";

        System.out.println("Equipment id " + eq20.equipmentId);
        System.out.println("Name: " + eq20.name);
        System.out.println("Type: " + eq20.type);
        System.out.println("Brand: " + eq20.brand);
        System.out.println("Price: $" + eq20.price);
        System.out.println("Material: " + eq20
