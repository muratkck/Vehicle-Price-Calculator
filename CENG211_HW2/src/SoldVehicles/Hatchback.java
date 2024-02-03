// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

public class Hatchback extends Automobile {
   private String cityMode;

   Hatchback(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String cityMode, double engineVolume, double valueAddedTax) {
      super(vehicleID, monthOfSale, cityOfSale, productionYear, engineVolume, valueAddedTax);
      this.setCityMode(cityMode);
   }

   Hatchback(Hatchback otherHatchback) {
      super(otherHatchback.getVehicleID(), otherHatchback.getMonthOfSale(), otherHatchback.getCityOfSale(), otherHatchback.getProductionYear(), otherHatchback.getEngineVolume(), otherHatchback.getValueAddedTax());
      this.setCityMode(otherHatchback.getCityMode());
   }

   public String getCityMode() {
      return this.cityMode;
   }

   private void setCityMode(String cityMode) {
      this.cityMode = cityMode;
   }

   public double calculateSpecialConsumptionTax() {
      double calculateSpecialConsumptionTax = super.getEngineVolume() * 0.3 * ProductionYear.valueOf("_" + Integer.toString(this.getProductionYear())).sctValue + CityMode.valueOf(this.getCityMode().toUpperCase()).sctValue;
      return calculateSpecialConsumptionTax;
   }
}
