import java.util.Scanner;
import java.util.ArrayList;

public class Solver{
  public static void main(String[] args) {
    ArrayList<Integer> vet = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);

    while(true) {
      String line = scan.nextLine();
      System.out.println("$" + line);
      String ui[] = line.split(" ");
      String cmd = ui[0];

      if(line.equals("end")) {
        break;
      } else if(cmd.equals("show")) {
        System.out.print("[ ");
        for(Integer value : vet)
          System.out.print(value + " ");  
        System.out.print("]\n");
      } else if(cmd.equals("rshow")) {
        System.out.print("[ ");
        for (int i = vet.size() - 1; i >= 0; i--)
          System.out.print(vet.get(i) + " ");
        System.out.print("]\n");
      } else if(cmd.equals("add")) {
        for(int i = 1; i < ui.length; i++)
          vet.add(Integer.parseInt(ui[i]));
      } else if(cmd.equals("find")) {
        boolean printed = false;
        int element = Integer.parseInt(ui[1]);
        System.out.print("[ ");
        for (int i = 0; i < vet.size(); i++) {
          if (vet.get(i) == element) {
            System.out.print(i + " ");
            printed = true;
            break;
          }
        }
        if (!printed)
          System.out.print(-1 + " ");
        System.out.print("]\n");
      } else if(cmd.equals("get")) {
        int ind = Integer.parseInt(ui[1]);
        System.out.println(vet.get(ind));
      } else if(cmd.equals("set")) {
        int ind = Integer.parseInt(ui[1]);
        int val = Integer.parseInt(ui[2]);
        vet.set(ind, val);
      } else if(cmd.equals("ins")) {
        int ind = Integer.parseInt(ui[1]);
        int val = Integer.parseInt(ui[2]);
        if (ind >= 0 && ind < vet.size()) {
          vet.add(0);
          for (int i = vet.size() - 1; i > ind-1; i--)
            if (i > 0) vet.set(i, vet.get(i-1));
          vet.set(ind, val);
        } else if (ind >= vet.size()) 
          vet.add(val);
      } else if(cmd.equals("rmi")) {
        int ind = Integer.parseInt(ui[1]);
        vet.remove(ind);
      } else if(cmd.equals("rma")) {
        int val = Integer.parseInt(ui[1]);
        int count = 0;
        for (int i = 0; i < vet.size(); i++)
          if (vet.get(i) == val) count++;
        for (int i = 0; i < count; i++) {
          int ind = 0;

          for (int j = 0; j < vet.size(); j++) {
            if (vet.get(j) == val) {
              ind = j;
              break;
            }
          }

          vet.remove(ind);
        }
      } else {
        System.out.print("fail: command not found\n");
      }
    }
    scan.close();
  }
}
