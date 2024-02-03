// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

public class Sedan extends Automobile {
   private String roofType;

   Sedan(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String roofType, double engineVolume, double valueAddedTax) {
      super(vehicleID, monthOfSale, cityOfSale, productionYear, engineVolume, valueAddedTax);
      this.setRoofType(roofType);
   }

   Sedan(Sedan otherSedan) {
      super(otherSedan.getVehicleID(), otherSedan.getMonthOfSale(), otherSedan.getCityOfSale(), otherSedan.getProductionYear(), otherSedan.getEngineVolume(), otherSedan.getValueAddedTax());
      this.setRoofType(otherSedan.getRoofType());
   }

   public String getRoofType() {
      return this.roofType;
   }

   private void setRoofType(String roofType) {
      this.roofType = roofType;
   }

   public double calculateSpecialConsumptionTax() {
      double calculateSpecialConsumptionTax = super.getEngineVolume() * 0.2 * RoofType.valueOf(this.getRoofType().toUpperCase()).sctValue / ProductionYear.valueOf("_" + Integer.toString(this.getProductionYear())).sctValue;
      return calculateSpecialConsumptionTax;
   }
}
