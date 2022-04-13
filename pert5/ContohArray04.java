public class ContohArray04{
    public static void main(String []args){
      int data[][]=new int[3][3];
      data[0][0]=100;
      data[0][2]=50;
      data[1][2]=100;
      data[2][0]=50;
      for(int i=0;i<data.length;i++){
          for(int j=0;j<data[i].length;j++){
             System.out.print(data[i][j]+" ");   
          }
          System.out.println();
      }
    }
}