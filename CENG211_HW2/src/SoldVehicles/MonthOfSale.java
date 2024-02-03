// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

public enum MonthOfSale {
   JANUARY(0.3),
   MAY(0.4),
   AUGUST(0.5),
   OCTOBER(0.6),
   DECEMBER(0.7);

   public final double sctValue;

   private MonthOfSale(double sctValue) {
      this.sctValue = sctValue;
   }
}
