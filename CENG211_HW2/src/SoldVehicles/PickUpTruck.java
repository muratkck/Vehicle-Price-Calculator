// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

public class PickUpTruck extends SoldVehicles {
   private String cabType;
   private String truckBedType;
   protected static final int BASEPRICE = 250000;

   PickUpTruck(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String cabType, String truckBedType, double valueAddedTax) {
      super(vehicleID, monthOfSale, cityOfSale, productionYear, valueAddedTax);
      this.setCabType(cabType);
      this.setTruckBedType(truckBedType);
   }

   PickUpTruck(PickUpTruck otherPickUpTruck) {
      super(otherPickUpTruck.getVehicleID(), otherPickUpTruck.getMonthOfSale(), otherPickUpTruck.getCityOfSale(), otherPickUpTruck.getProductionYear(), otherPickUpTruck.getValueAddedTax());
      this.setCabType(otherPickUpTruck.getCabType());
      this.setTruckBedType(otherPickUpTruck.getTruckBedType());
   }

   public String getCabType() {
      return this.cabType;
   }

   private void setCabType(String cabType) {
      this.cabType = cabType;
   }

   public String getTruckBedType() {
      return this.truckBedType;
   }

   private void setTruckBedType(String truckBedType) {
      this.truckBedType = truckBedType;
   }

   public double calculateSpecialConsumptionTax() {
      double calculateSpecialConsumptionTax = TruckBedType.valueOf(this.getTruckBedType().toUpperCase()).sctValue * ProductionYear.valueOf("_" + Integer.toString(super.getProductionYear())).sctValue / CabType.valueOf(this.getCabType().toUpperCase()).sctValue;
      return calculateSpecialConsumptionTax;
   }

   public double calculateTotalPrice() {
      double totalPrice = 250000.0 * (1.0 + this.calculateSpecialConsumptionTax() * 0.6) + 1.0 + this.getValueAddedTax() / 100.0;
      return totalPrice;
   }
}
