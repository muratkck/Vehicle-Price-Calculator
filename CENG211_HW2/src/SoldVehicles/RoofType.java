// Source code is decompiled from a .class file using FernFlower decompiler.
package SoldVehicles;

public enum RoofType {
   REGULAR(0.5),
   MOONROOF(0.6),
   SUNROOF(0.8);

   public final double sctValue;

   private RoofType(double sctValue) {
      this.sctValue = sctValue;
   }
}
