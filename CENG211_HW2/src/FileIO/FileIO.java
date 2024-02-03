// Source code is decompiled from a .class file using FernFlower decompiler.
package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO {
   private String fileName;
   public ArrayList<String[]> allElements = new ArrayList();

   public FileIO(String fileName) {
      this.fileName = fileName;
      this.inputStream();
   }

   private void inputStream() {
      BufferedReader br = null;
      String line = "";
      String splitBy = ",";

      try {
         br = new BufferedReader(new FileReader(this.fileName));

         while((line = br.readLine()) != null) {
            String[] tempArr = line.split(splitBy);
            this.allElements.add(tempArr);
         }

         br.close();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }
}
