package com.gurshobit.questionone;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BuildingProblem {
    public static Scanner scannerInput = new Scanner(System.in);
    public static void floorWorkLogic(int[] floors, int maxFloors){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        int maxFloorNumber = maxFloors;

        for (int f = 0; f < maxFloors; f++) {
            System.out.println("Day " + (f+1) +": ");

            priorityQueue.add(floors[f]);

            while(!priorityQueue.isEmpty() && priorityQueue.peek() == maxFloorNumber){
                System.out.print(priorityQueue.poll() + " ");
                maxFloorNumber--;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int totalFloors = 0;
        do {
            System.out.println("Enter Number of floors in building");
            totalFloors = Integer.parseInt(scannerInput.nextLine());
        } while (totalFloors < 1);

        int[] floors = new int[totalFloors];

        for (int f = 0; f < totalFloors; f++){
            int floorSize = 0;
            do {
                System.out.println("Enter Floor Size on Day " + (f+1) + ":");
                floorSize = Integer.parseInt(scannerInput.nextLine());
            } while (floorSize < 1);
            floors[f] = floorSize;
        }
        System.out.println("Building's Floor Construction Plans as follows: ");
        floorWorkLogic(floors,totalFloors);
    }
}
