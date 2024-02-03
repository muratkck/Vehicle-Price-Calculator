// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

public class Minivan extends Automobile {
   private int numberOfSeats;

   Minivan(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, int numberOfSeats, double engineVolume, double valueAddedTax) {
      super(vehicleID, monthOfSale, cityOfSale, productionYear, engineVolume, valueAddedTax);
      this.setNumberOfSeats(numberOfSeats);
   }

   Minivan(Minivan otherMinivan) {
      super(otherMinivan.getVehicleID(), otherMinivan.getMonthOfSale(), otherMinivan.getCityOfSale(), otherMinivan.getProductionYear(), otherMinivan.getEngineVolume(), otherMinivan.getValueAddedTax());
      this.setNumberOfSeats(otherMinivan.getNumberOfSeats());
   }

   public int getNumberOfSeats() {
      return this.numberOfSeats;
   }

   private void setNumberOfSeats(int numberOfSeats) {
      this.numberOfSeats = numberOfSeats;
   }

   public double calculateSpecialConsumptionTax() {
      double calculateSpecialConsumptionTax = 0.6 * ProductionYear.valueOf("_" + Integer.toString(this.getProductionYear())).sctValue / (super.getEngineVolume() + NumberOfSeats.valueOf("_" + Integer.toString(this.getNumberOfSeats())).sctValue);
      return calculateSpecialConsumptionTax;
   }
}
