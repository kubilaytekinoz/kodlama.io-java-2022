package validators;

import entities.Category;

import java.util.ArrayList;

public class CategoryValidator {

    public static void isValid(ArrayList<Category> categories) throws Exception {
       for (int i=0; i< categories.size();i++){
           Category category = categories.get(i);
           String categoryName = category.getCategoryName();
           for (int j=0;j<(categories.size()-1);j++){
               ArrayList<Category> checkCategory = new ArrayList<>(categories);
               checkCategory.remove(i);
               if (categoryName.equals(checkCategory.get(j).getCategoryName())){
                   throw new Exception("Tekrar eden kategori bulundu " + categoryName);
               }
           }
       }


    }
}
