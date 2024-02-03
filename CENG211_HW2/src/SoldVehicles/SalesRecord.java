// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

import FileIO.FileIO;
import java.util.ArrayList;
import java.util.Iterator;

public class SalesRecord {
   private ArrayList<Hatchback> allHatchbacks = new ArrayList();
   private ArrayList<Sedan> allSedans = new ArrayList();
   private ArrayList<Minivan> allMinivans = new ArrayList();
   private ArrayList<PickUpTruck> allPickUpTrucks = new ArrayList();
   private ArrayList<Bicycle> allBicycles = new ArrayList();
   FileIO readCSV = new FileIO("HW2_SoldVehicles.csv");

   public SalesRecord() {
      this.vehicleManager();
   }

   public ArrayList<Hatchback> getHatchbackVehicles() {
      ArrayList<Hatchback> copyHatchbacks = new ArrayList();

      for(int i = 0; i < this.allHatchbacks.size(); ++i) {
         copyHatchbacks.add(new Hatchback((Hatchback)this.allHatchbacks.get(i)));
      }

      return copyHatchbacks;
   }

   public ArrayList<Sedan> getSedanVehicles() {
      ArrayList<Sedan> copySedans = new ArrayList();

      for(int i = 0; i < this.allSedans.size(); ++i) {
         copySedans.add(new Sedan((Sedan)this.allSedans.get(i)));
      }

      return copySedans;
   }

   public ArrayList<Minivan> getMinivanVehicles() {
      ArrayList<Minivan> copyMinivans = new ArrayList();

      for(int i = 0; i < this.allMinivans.size(); ++i) {
         copyMinivans.add(new Minivan((Minivan)this.allMinivans.get(i)));
      }

      return copyMinivans;
   }

   public ArrayList<PickUpTruck> getPickUpVehicles() {
      ArrayList<PickUpTruck> copyPickUpTrucks = new ArrayList();

      for(int i = 0; i < this.allPickUpTrucks.size(); ++i) {
         copyPickUpTrucks.add(new PickUpTruck((PickUpTruck)this.allPickUpTrucks.get(i)));
      }

      return copyPickUpTrucks;
   }

   public ArrayList<Bicycle> getBicycleVehicles() {
      ArrayList<Bicycle> copyBicycles = new ArrayList();

      for(int i = 0; i < this.allBicycles.size(); ++i) {
         copyBicycles.add(new Bicycle((Bicycle)this.allBicycles.get(i)));
      }

      return copyBicycles;
   }

   public void vehicleManager() {
      for(int i = 0; i < this.readCSV.allElements.size(); ++i) {
         char firstLetter = ((String[])this.readCSV.allElements.get(i))[0].charAt(0);
         switch (firstLetter) {
            case 'B':
               Bicycle bicycle = new Bicycle(((String[])this.readCSV.allElements.get(i))[0], ((String[])this.readCSV.allElements.get(i))[1], ((String[])this.readCSV.allElements.get(i))[2], Integer.parseInt(((String[])this.readCSV.allElements.get(i))[3]), ((String[])this.readCSV.allElements.get(i))[4], ((String[])this.readCSV.allElements.get(i))[5], Double.parseDouble(((String[])this.readCSV.allElements.get(i))[6]));
               this.allBicycles.add(bicycle);
               break;
            case 'H':
               Hatchback hatchback = new Hatchback(((String[])this.readCSV.allElements.get(i))[0], ((String[])this.readCSV.allElements.get(i))[1], ((String[])this.readCSV.allElements.get(i))[2], Integer.parseInt(((String[])this.readCSV.allElements.get(i))[3]), ((String[])this.readCSV.allElements.get(i))[4], Double.parseDouble(((String[])this.readCSV.allElements.get(i))[5]), Double.parseDouble(((String[])this.readCSV.allElements.get(i))[6]));
               this.allHatchbacks.add(hatchback);
               break;
            case 'M':
               Minivan minivan = new Minivan(((String[])this.readCSV.allElements.get(i))[0], ((String[])this.readCSV.allElements.get(i))[1], ((String[])this.readCSV.allElements.get(i))[2], Integer.parseInt(((String[])this.readCSV.allElements.get(i))[3]), Integer.parseInt(((String[])this.readCSV.allElements.get(i))[4]), Double.parseDouble(((String[])this.readCSV.allElements.get(i))[5]), Double.parseDouble(((String[])this.readCSV.allElements.get(i))[6]));
               this.allMinivans.add(minivan);
               break;
            case 'P':
               PickUpTruck pickUpTruck = new PickUpTruck(((String[])this.readCSV.allElements.get(i))[0], ((String[])this.readCSV.allElements.get(i))[1], ((String[])this.readCSV.allElements.get(i))[2], Integer.parseInt(((String[])this.readCSV.allElements.get(i))[3]), ((String[])this.readCSV.allElements.get(i))[4], ((String[])this.readCSV.allElements.get(i))[5], Double.parseDouble(((String[])this.readCSV.allElements.get(i))[6]));
               this.allPickUpTrucks.add(pickUpTruck);
               break;
            case 'S':
               Sedan sedan = new Sedan(((String[])this.readCSV.allElements.get(i))[0], ((String[])this.readCSV.allElements.get(i))[1], ((String[])this.readCSV.allElements.get(i))[2], Integer.parseInt(((String[])this.readCSV.allElements.get(i))[3]), ((String[])this.readCSV.allElements.get(i))[4], Double.parseDouble(((String[])this.readCSV.allElements.get(i))[5]), Double.parseDouble(((String[])this.readCSV.allElements.get(i))[6]));
               this.allSedans.add(sedan);
               break;
            default:
               System.out.println("You didn't enter a valid character!");
         }
      }

   }

   public void printAllSoldVehicles() {
      this.printAllHatchbacks();
      this.printAllSedans();
      this.printAllMinivans();
      this.printAllPickUpTrucks();
      this.printAllBicycles();
   }

   public void printAllHatchbacks() {
      Iterator var2 = this.allHatchbacks.iterator();

      while(var2.hasNext()) {
         Hatchback hatchback = (Hatchback)var2.next();
         System.out.println("Vehicle: Hatchback Vehicle ID: " + hatchback.getVehicleID() + " Month: " + hatchback.getMonthOfSale() + " City: " + hatchback.getCityOfSale() + " Production Year: " + hatchback.getProductionYear() + " SCT: " + hatchback.calculateSpecialConsumptionTax());
         System.out.println("The total price paid for " + hatchback.getVehicleID() + " is: " + hatchback.calculateTotalPrice() + " TL");
      }

   }

   public void printAllSedans() {
      Iterator var2 = this.allSedans.iterator();

      while(var2.hasNext()) {
         Sedan sedan = (Sedan)var2.next();
         System.out.println("Vehicle: Sedan Vehicle ID: " + sedan.getVehicleID() + " Month: " + sedan.getMonthOfSale() + " City: " + sedan.getCityOfSale() + " Production Year: " + sedan.getProductionYear() + " SCT: " + sedan.calculateSpecialConsumptionTax());
         System.out.println("The total price paid for " + sedan.getVehicleID() + " is: " + sedan.calculateTotalPrice() + " TL");
      }

   }

   public void printAllMinivans() {
      Iterator var2 = this.allMinivans.iterator();

      while(var2.hasNext()) {
         Minivan minivan = (Minivan)var2.next();
         System.out.println("Vehicle: Minivan Vehicle ID: " + minivan.getVehicleID() + " Month: " + minivan.getMonthOfSale() + " City: " + minivan.getCityOfSale() + " Production Year: " + minivan.getProductionYear() + " SCT: " + minivan.calculateSpecialConsumptionTax());
         System.out.println("The total price paid for " + minivan.getVehicleID() + " is: " + minivan.calculateTotalPrice() + " TL");
      }

   }

   public void printAllPickUpTrucks() {
      Iterator var2 = this.allPickUpTrucks.iterator();

      while(var2.hasNext()) {
         PickUpTruck pickUpTruck = (PickUpTruck)var2.next();
         System.out.println("Vehicle: PickUpTruck Vehicle ID: " + pickUpTruck.getVehicleID() + " Month: " + pickUpTruck.getMonthOfSale() + " City: " + pickUpTruck.getCityOfSale() + " Production Year: " + pickUpTruck.getProductionYear() + " SCT: " + pickUpTruck.calculateSpecialConsumptionTax());
         System.out.println("The total price paid for " + pickUpTruck.getVehicleID() + " is: " + pickUpTruck.calculateTotalPrice() + " TL");
      }

   }

   public void printAllBicycles() {
      Iterator var2 = this.allBicycles.iterator();

      while(var2.hasNext()) {
         Bicycle bicycle = (Bicycle)var2.next();
         System.out.println("Vehicle: Bicycle Vehicle ID: " + bicycle.getVehicleID() + " Month: " + bicycle.getMonthOfSale() + " City: " + bicycle.getCityOfSale() + " Production Year: " + bicycle.getProductionYear() + " SCT: " + bicycle.calculateSpecialConsumptionTax());
         System.out.println("The total price paid for " + bicycle.getVehicleID() + " is: " + bicycle.calculateTotalPrice() + " TL");
      }

   }
}
