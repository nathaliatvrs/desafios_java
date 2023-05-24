public class Lasagna {
    public static void main(String[] args) {
        int layers = 4; // Example number of layers
        int ovenTime = 30; // Example number of minutes the lasagna has been in the oven

        int expectedMinutesInOven = expectedMinutesInOven();     // TODO: define the 'expectedMinutesInOven()' method
        int remainingMinutesInOven = remainingMinutesInOven(ovenTime);   // TODO: define the 'remainingMinutesInOven()' method
        int preparationTimeInMinutes = preparationTimeInMinutes(layers); // TODO: define the 'preparationTimeInMinutes()' method
        int totalTimeInMinutes = totalTimeInMinutes(layers, ovenTime);  // TODO: define the 'totalTimeInMinutes()' method

        System.out.println("Expected Minutes in Oven: " + expectedMinutesInOven);
        System.out.println("Remaining Minutes in Oven: " + remainingMinutesInOven);
        System.out.println("Preparation Time in Minutes: " + preparationTimeInMinutes);
        System.out.println("Total Time in Minutes: " + totalTimeInMinutes);
    }
    public static int expectedMinutesInOven() {
        return 40;
    }

    public static int remainingMinutesInOven(int minutesInOven) {
        int expectedMinutesInOven = expectedMinutesInOven();
        return expectedMinutesInOven - minutesInOven;
    }

    public static int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public static int totalTimeInMinutes(int layers, int minutesInOven) {
        int preparationTimeInMinutes = preparationTimeInMinutes(layers);
        return preparationTimeInMinutes + minutesInOven;
    }


}

