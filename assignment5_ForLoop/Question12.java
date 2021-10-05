package assignment5_ForLoop;

public class Question12 {

	public static void main(String[] args) {
		
		//Print following output using nested for loops.
		//1 2 3 4 5 6 7 8 9 10
		//2 4 6 8 10 12 14 16 18 20
		//3 6 9 12 15 18 21 24 27 30
		//4 8 12 16 20 24 28 32 36 40
		//5 10 15 20 25 30 35 40 45 50
		//6 12 18 24 30 36 42 48 54 60
		//7 14 21 28 35 42 49 56 63 70
		//8 16 24 32 40 48 56 64 72 80
		//9 18 27 36 45 54 63 72 81 90
		//10 20 30 40 50 60 70 80 90 100

	    String Boundary1 = JOptionPane.showInputDialog(null, "Please enter the first boundary of the multiplication table.");
        String Boundary2 = JOptionPane.showInputDialog(null, "Please enter the second boundary of the multiplication table.");

        int X = Integer.parseInt(Boundary1);
        int Y = Integer.parseInt(Boundary2);
        int j = 1;
        String Result = "";
        int x = 1;

        while (x <= X) {
            for (int i = 1; i <= Y; i++) {
                j = i * x;
                Result = Result + j + "\t";
            }
            x++;
            Result = Result + "\n";
        }
        JTextArea jt=new JTextArea(Result);
        jt.setEditable(false);
        jt.setOpaque(false);
        jt.setTabSize(3);
        JOptionPane.showMessageDialog(null, jt);
    }
}
