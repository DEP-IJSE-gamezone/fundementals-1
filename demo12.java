void main(){
    final String [][] CUSTOMERS={
            {"1","2","3","4"},
            {"Kasun","Nuwan","Ruwan","Supun"},
            {"077-1234567","078-1234567","071-1234567","041-0123456"},
            {"011-1234567","-",null,"033-1234567"}
    };
    System.out.println("-".repeat(45));
    System.out.printf("|%-4s|%-6s|%-15s|%-15s|\n","ID","NAME","CONTACT 1","CONTACT 2");
    System.out.println("-".repeat(45));
    String line="|S%-3s|%-6s|%-15s|%-15s|\n";
    String[] id=CUSTOMERS[0];
    String[] name=CUSTOMERS[1];
    String[] contact1=CUSTOMERS[2];
    String[] contact2=CUSTOMERS[3];
    int id1;
    String  name1,contact11,contact22,printLine;
    for (int i = 0; i < id.length; i++) {
        id1=Integer.parseInt(id[i]);
        name1=name[i];
        contact11=contact1[i];
        contact22=contact2[i];
        printLine=String.format("|S%03d|%-6s|%-15s|%-15s|\n",id1,name1,contact11,contact22);
        System.out.printf(printLine);

    }

    System.out.println("-".repeat(45));
}
