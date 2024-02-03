// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

public enum CabType {
   REGULAR(2.5),
   EXTENDED(2.8),
   CREW(3.0);

   public final double sctValue;

   private CabType(double sctValue) {
      this.sctValue = sctValue;
   }
}
