package lab_4_bushra;

// Thread for printing student roll numbers
class RollNumberThread extends Thread {
    public void run() {
        // Roll numbers to be printed
        String[] rollNumbers = {
            "2019-SE-336", "2019-SE-337", "2019-SE-338", "2019-SE-339", "2019-SE-340"
        };
        
        // Printing Roll Numbers
        System.out.println("Student Roll Numbers:");
        for (String rollNumber : rollNumbers) {
            System.out.println(rollNumber);
            try {
                Thread.sleep(1000); // Sleep for 1 second to simulate delay in printing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Thread for printing student dates of birth
class DOBThread extends Thread {
    public void run() {
        // Corresponding dates of birth to be printed
        String[] dob = {
            "29-August", "15-July", "11-May", "3-January", "25-December"
        };
        
        // Printing Dates of Birth
        System.out.println("\nStudent Dates of Birth:");
        for (String dateOfBirth : dob) {
            System.out.println(dateOfBirth);
            try {
                Thread.sleep(1000); // Sleep for 1 second to simulate delay in printing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


