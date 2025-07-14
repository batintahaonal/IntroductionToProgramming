package ders1;

import java.util.Random; //

public class Trial { 
	public static void main(String[] args) { 
        int[][] workHours = createWorkersArray(); 
        System.out.println("The workers' weekly working hours are:");
        displayArray(workHours);
        double[] averageHours = calculateAvg(workHours); 
        displayAvg(averageHours); 
        System.out.println("Employee with the max. average working time: " + maxAvg(averageHours)); 
        double[] salary = createSalary(workHours);
        displaySalary(salary); 
    }
    public static int[][] createWorkersArray() { 
        int numWorkers = 10; 
        int numDays = 7; 
        int[][] workHours = new int[numWorkers][numDays]; 
        Random random = new Random(); 

        for (int i = 0; i < numWorkers; i++) { 
            for (int j = 0; j < numDays; j++) { 
                workHours[i][j] = random.nextInt(9) + 1;
            }
        }
        return workHours; 
    }
    public static void displayArray(int[][] workHours) { 
        System.out.println("Su\tM\tT\tW\tTh\tF\tSa"); 
        for (int i = 0; i < workHours.length; i++) { 
            System.out.print("Employee " + i + "\t"); 
            for (int j = 0; j < workHours[i].length; j++) { 
                System.out.print(workHours[i][j] + "\t"); 
            }
            System.out.println(); 
        }
    }
    public static double[] calculateAvg(int[][] workHours) { 
        double[] averageHours = new double[workHours.length];
        for (int i = 0; i < workHours.length; i++) { 
            int totalHours = 0; 
            for (int j = 0; j < workHours[i].length; j++) { 
                totalHours += workHours[i][j]; 
            }
            averageHours[i] = (double) totalHours / workHours[i].length; 
        }
        return averageHours; 
    }
    public static void displayAvg(double[] averageHours) { 
        System.out.println("\nWorkers' Weekly Average Working Hours:"); 
        for (int i = 0; i < averageHours.length; i++) { 
            System.out.printf("Employee %d: %.2f hours\n", i, averageHours[i]); 
        }
    }
    public static int maxAvg(double[] averageHours) { 
        int maxIndex = 0; 
        double maxValue = averageHours[0]; 
        for (int i = 1; i < averageHours.length; i++) { 
            if (averageHours[i] > maxValue) { 
                maxValue = averageHours[i]; 
                maxIndex = i; 
            }
        }
        return maxIndex; 
    }
    public static double[] createSalary(int[][] workHours) { 
        double[] salary = new double[workHours.length]; 
        for (int i = 0; i < workHours.length; i++) { 
            int totalHours = 0; 
            for (int j = 0; j < workHours[i].length; j++) { 
                totalHours += workHours[i][j]; 
            }
            salary[i] = 2500; 
            if (totalHours > 35) {
                salary[i] += (totalHours - 35) * 100; 
            }
        }
        return salary; 
    }

    public static void displaySalary(double[] salary) { //
        System.out.println("\nWorkers' Salaries:"); //
        for (int i = 0; i < salary.length; i++) { //
            System.out.printf("Employee %d: %.2f TL\n", i, salary[i]); //
        }
    }
}
