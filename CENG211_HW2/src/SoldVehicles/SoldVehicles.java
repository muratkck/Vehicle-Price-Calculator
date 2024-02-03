// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

public class SoldVehicles {
   private String vehicleID;
   private String monthOfSale;
   private String cityOfSale;
   private int productionYear;
   private double valueAddedTax;

   public SoldVehicles(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, double valueAddedTax) {
      this.setVehicleID(vehicleID);
      this.setMonthOfSale(monthOfSale);
      this.setCityOfSale(cityOfSale);
      this.setProductionYear(productionYear);
      this.setValueAddedTax(valueAddedTax);
   }

   public String getVehicleID() {
      return this.vehicleID;
   }

   private void setVehicleID(String vehicleID) {
      this.vehicleID = vehicleID;
   }

   public String getMonthOfSale() {
      return this.monthOfSale;
   }

   private void setMonthOfSale(String monthOfSale) {
      this.monthOfSale = monthOfSale;
   }

   public String getCityOfSale() {
      return this.cityOfSale;
   }

   private void setCityOfSale(String cityOfSale) {
      this.cityOfSale = cityOfSale;
   }

   public int getProductionYear() {
      return this.productionYear;
   }

   private void setProductionYear(int productionYear) {
      this.productionYear = productionYear;
   }

   public double getValueAddedTax() {
      return this.valueAddedTax;
   }

   private void setValueAddedTax(double valueAddedTax) {
      this.valueAddedTax = valueAddedTax;
   }

   public double calculateSpecialConsumptionTax() {
      return 0.0;
   }

   public double calculateTotalPrice() {
      return 0.0;
   }
}
