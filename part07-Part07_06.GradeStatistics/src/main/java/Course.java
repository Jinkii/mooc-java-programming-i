
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jinki
 */
public class Course {

    private ArrayList<Integer> allPoints;
    private ArrayList<Integer> passingPoints;
    private double points;
    private double averageAll;
    private double averagePassing;
    private double passingPercentage;
    private double passingTotal;
    private double totalPoints;
    private final int MAX = 100;
    private final int MIN = 0;

    public Course() {
        this.allPoints = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.points = 0;
        this.totalPoints = 0;
    }

    public Course(int points, int totalPoints) {
        this.points = points;
        this.totalPoints = totalPoints;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getAverage() {
        return averageAll;
    }

    public void setAverage(int average) {
        this.averageAll = average;
    }

    public double getPassingAverage() {
        return averagePassing;
    }

    public void setPassingAverage(double passingAverage) {
        this.averagePassing = passingAverage;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getMax() {
        return MAX;
    }

    public int getMin() {
        return MIN;
    }

    public void start(Scanner scan) {
        System.out.println("Enter point totals, -1 stops");
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            if (input == -1) {
                break;
            }
            if (input >= MIN && input <= MAX) {
                allPoints.add(input);
                if (input >= 50) {
                    passingPoints.add(input);
                }
            }

        }
        this.averageAll(this.allPoints);
        this.averagePassing(this.passingPoints);
        this.passingPercentage(this.passingPoints);
        this.pointsToGrade(allPoints);
    }

    public void averageAll(ArrayList<Integer> allPoints) {
        if (!(allPoints.isEmpty())) {
            for (Integer i : allPoints) {
                this.totalPoints += i;
            }
            this.averageAll = this.totalPoints / allPoints.size();
            System.out.println("Point average (all): " + this.averageAll);
        }
    }

    public void averagePassing(ArrayList<Integer> passingPoints) {
        if (!(passingPoints.isEmpty())) {
            for (Integer i : passingPoints) {
                if (i >= 50) {
                    this.passingTotal += i;
                }
            }
            this.averagePassing = this.passingTotal / passingPoints.size();
            if (this.averagePassing != 0) {
                System.out.println("Point average (passing): " + this.averagePassing);
            } else {
                System.out.println("Point average (passing): -");
            }
        } else {
            System.out.println("Point average (passing): -");
        }
    }

    public void passingPercentage(ArrayList<Integer> passingPoints) {
        if (!(passingPoints.isEmpty())) {
            this.passingPercentage = 1.0 * (100 * passingPoints.size()) / allPoints.size();
            System.out.println("Pass percentage: " + this.passingPercentage);
        }
    }

    public void pointsToGrade(ArrayList<Integer> points) {
        int grade = 0;
        System.out.println("Grade distribution: ");
        ArrayList<Integer> grade0 = new ArrayList<>();
        ArrayList<Integer> grade1 = new ArrayList<>();
        ArrayList<Integer> grade2 = new ArrayList<>();
        ArrayList<Integer> grade3 = new ArrayList<>();
        ArrayList<Integer> grade4 = new ArrayList<>();
        ArrayList<Integer> grade5 = new ArrayList<>();
        for (Integer i : points) {
            if (i >= MIN && i < MAX) {
                if (i < 50) {
                    grade = 0;
                    grade0.add(i);
                } else if (i < 60) {
                    grade = 1;
                    grade1.add(i);
                } else if (i < 70) {
                    grade = 2;
                    grade2.add(i);
                } else if (i < 80) {
                    grade = 3;
                    grade3.add(i);
                } else if (i < 90) {
                    grade = 4;
                    grade4.add(i);
                } else if (i >= 90) {
                    grade = 5;
                    grade5.add(i);
                }
            }
        }
        System.out.println("5: " + printStars(grade5.size()));
        System.out.println("4: " + printStars(grade4.size()));
        System.out.println("3: " + printStars(grade3.size()));
        System.out.println("2: " + printStars(grade2.size()));
        System.out.println("1: " + printStars(grade1.size()));
        System.out.println("0: " + printStars(grade0.size()));
    }
    
    public String printStars(int number) {
        String stars = "";
        for(int i = 0; i < number; i++) {
            stars += "*";
        }
        return stars;
    }
}
