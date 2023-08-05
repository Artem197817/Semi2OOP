import javax.swing.*;

public class Dialog {
    public static String inputPane(String s){
        return JOptionPane.showInputDialog(null,s);
    }
    public  static  boolean confirmPane(String message){
        int is = JOptionPane.showConfirmDialog(null,message,"Выберите Да/Нет",
                JOptionPane.YES_NO_OPTION);
        return is == JOptionPane.YES_OPTION;
    }
    public static void messagePane (String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    public static double checkID(String s) {
        String id;
        do {
            id = Dialog.inputPane(s);
            if (id == null)
                return 0;
        } while (!id.matches("\\-?\\d+(\\.\\d{0,})?"));

        return (double) (Math.round(Double.parseDouble(id)*100)) / 100;
    }
}

