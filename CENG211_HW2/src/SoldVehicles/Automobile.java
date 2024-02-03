// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

public class Automobile extends SoldVehicles {
   private double engineVolume;
   protected static final int BASEPRICE = 200000;

   Automobile(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, double engineVolume, double valueAddedTax) {
      super(vehicleID, monthOfSale, cityOfSale, productionYear, valueAddedTax);
      this.setEngineVolume(engineVolume);
   }

   public double getEngineVolume() {
      return this.engineVolume;
   }

   private void setEngineVolume(double engineVolume) {
      this.engineVolume = engineVolume;
   }

   public double calculateSpecialConsumptionTax() {
      return 0.0;
   }

   public double calculateTotalPrice() {
      double totalPrice = 200000.0 * (1.0 + this.calculateSpecialConsumptionTax() * 0.8) + 1.0 + this.getValueAddedTax() / 100.0;
      return totalPrice;
   }
}
