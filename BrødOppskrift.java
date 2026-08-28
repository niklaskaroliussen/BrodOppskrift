import javax.swing.*;

public class BrødOppskrift {
    public static void main (String[] args) {

        //Du trenger:
        double melDl;
        String melDlAsString = JOptionPane.showInputDialog("hvor mye mel har du?");
        melDl = Double.parseDouble(melDlAsString);

        double vannDl;
        String vannDlAsString = JOptionPane.showInputDialog("hvor mye vann har du?");
        vannDl = Double.parseDouble(vannDlAsString);

        //Bland mel og vann
        double deigDl = melDl + vannDl;

        //Hvor mye deig du trenger for å lage et brød
        double antallDeigPerBrød = 2.5;

        double antallBrød = deigDl / antallDeigPerBrød;

        System.out.println("Du kan lage " + antallBrød + " brød");
        JOptionPane.showMessageDialog(null, "Du kan lage" + antallBrød + " brød");
    }
}
