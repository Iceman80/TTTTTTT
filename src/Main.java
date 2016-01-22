
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //       String tok = "";
        String dataTemp = "";
        String temp1 = "";
        String temp2 = "";
        String temp3 = "";
        String tok = "1\t0\t{2,3,4}\n10\tINF\t{}\n10\tINF\t{}\n2\t1\t{}\n2\t1\t{5,6}\n3\t1\t{}\n3\t1\t{}\n4\t1\t{}\n4\t1\t{7,8}\n5\t2\t{}\n5\tINF\t{9,10}\n6\t2\t{}\n6\tINF\t{}\n" +
                "7\t2\t{}\n7\tINF\t{}\n8\t2\t{}\n8\tINF\t{}\n9\tINF\t{}\n9\tINF\t{}";


//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//            tok = sc.nextLine();

        StringTokenizer tokenizer1 = new StringTokenizer(tok);
        while (tokenizer1.hasMoreTokens()) {
            String tok1 = tokenizer1.nextToken("\n");
            String[] data = tok1.split("\t");
            if (dataTemp.equals("")) {
                dataTemp = data[0];
                temp1 = data[1];
            }
            if (!data[0].equals(dataTemp)) {
                if (data[2].equals("{}")) {
                    temp1 = data[1];
                    dataTemp = data[0];
                    continue;
                }
            } else {
                temp2 = data[2];
            }
            System.out.println(Integer.parseInt(data[0]) + "\t" + temp1 + "\t" + temp2);

        }

    }
}

