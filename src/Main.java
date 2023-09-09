
public class Main {
    public static int Checker(int[][] field){
        if(emptyField(field)==true){
            if((field[0][0]==1 & field[1][1]==1 & field[2][2]==1)| (field[0][2]==1 & field[1][1]==1 & field[2][0]==1)
                    | (field[0][0]==1 & field[1][0]==1 & field[2][0]==1) | (field[0][1]==1 & field[1][1]==1 & field[2][1]==1) | (field[0][2]==1 & field[1][2]==1 & field[2][2]==1)
                    | (field[0][0]==1 & field[0][1]==1 & field[0][2]==1) | (field[1][0]==1 & field[1][1]==1 & field[1][2]==1) | (field[2][0]==1 & field[2][1]==1 & field[2][2]==1)){
                return 1;
            }
            if((field[0][0]==2 & field[1][1]==2 & field[2][2]==2)| (field[0][2]==2 & field[1][1]==2 & field[2][0]==2)
                    | (field[0][0]==2 & field[1][0]==2 & field[2][0]==2) | (field[0][1]==2 & field[1][1]==2 & field[2][1]==2) | (field[0][2]==2 & field[1][2]==2 & field[2][2]==2)
                    | (field[0][0]==2 & field[0][1]==2 & field[0][2]==2) | (field[1][0]==2 & field[1][1]==2 & field[1][2]==2) | (field[2][0]==2 & field[2][1]==2 & field[2][2]==2)){
                return 2;
            }else {return 0;}
        }
        else return -1;
    }
    public static boolean emptyField(int[][] field){

        for (int i = 0;i < field.length;i++){
            for (int j = 0;j < field.length;j++){
            if(field[i][j]==0){
                return false;
            }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[][] field = {{2,1,2}, {0,2,1}, {1,2,1}};
        for (int i = 0;i < field.length;i++){

            for (int j = 0;j < field.length;j++){System.out.print(field[i][j] + " ");}
            System.out.println();
        }
        System.out.print(Checker(field));

    }
}