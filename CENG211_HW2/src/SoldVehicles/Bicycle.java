// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

public class Bicycle extends SoldVehicles {
   private String chainType;
   private String seatPost;
   protected static final int BASEPRICE = 10000;

   Bicycle(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String chainType, String seatPost, double valueAddedTax) {
      super(vehicleID, monthOfSale, cityOfSale, productionYear, valueAddedTax);
      this.setChainType(chainType);
      this.setSeatPost(seatPost);
   }

   Bicycle(Bicycle otherBicycle) {
      super(otherBicycle.getVehicleID(), otherBicycle.getMonthOfSale(), otherBicycle.getCityOfSale(), otherBicycle.getProductionYear(), otherBicycle.getValueAddedTax());
      this.setChainType(otherBicycle.getChainType());
      this.setSeatPost(otherBicycle.getSeatPost());
   }

   public String getChainType() {
      return this.chainType;
   }

   private void setChainType(String chainType) {
      this.chainType = chainType;
   }

   public String getSeatPost() {
      return this.seatPost;
   }

   private void setSeatPost(String seatPost) {
      this.seatPost = seatPost;
   }

   public double calculateSpecialConsumptionTax() {
      double calculateSpecialConsumptionTax = 0.1 * ChainType.valueOf(this.getChainType().toUpperCase()).sctValue * SeatPost.valueOf(this.getSeatPost().toUpperCase()).sctValue + MonthOfSale.valueOf(super.getMonthOfSale().toUpperCase()).sctValue;
      return calculateSpecialConsumptionTax;
   }

   public double calculateTotalPrice() {
      double totalPrice = 9000.0 * (1.0 + this.calculateSpecialConsumptionTax()) + 1.0 + super.getValueAddedTax() / 100.0;
      return totalPrice;
   }
}
