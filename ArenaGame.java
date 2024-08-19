import java.util.Random;
import java.util.Scanner;

public class ArenaGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //H   S    A
        int H1=50,S1=5,A1=10;
        int H2=100,S2=10,A2=5;
        // System.out.println("Enter player1:Health");
        // int H1=sc.nextInt();
        // System.out.println("Enter player1:Strength of Defence");
        // int S1=sc.nextInt();
        // System.out.println("Enter player1:Attack");
        // int A1=sc.nextInt();
        // System.out.println("Enter player2:Health");
        // int H2=sc.nextInt();
        // System.out.println("Enter player2:Strength of Defence");
        // int S2=sc.nextInt();
        // System.out.println("Enter player1:Attack");
        // int A2=sc.nextInt();
        // sc.close();
        Random r=new Random();
        //int rm=r.nextInt(6-1)+1;
        //System.out.println(rm);
        int c=0;
        System.out.println();
        System.out.println("Initial Health of Player 1:"+H1);
        System.out.println("Initial Health of Player 2:"+H2);
        System.out.println();
        System.out.println("-----------GAME STARTED----------");
        
        if(H1<H2){
            while(H1>0 && H2>0){
                if(c%2==0){
                    System.out.println("==========================================");
                    System.out.println("ROUND "+(c+1));
                    System.out.println("==========================================");
                    int D_A=r.nextInt(6-1)+1;
                    System.out.println("Player1 Rolled:"+D_A);
                    int D_D=r.nextInt(6-1)+1;
                    System.out.println("Player2 Rolled:"+D_D);
                    int A=D_A*A1;
                    int D=D_D*S2;
                    System.out.println("Player1 Attacked--->"+A);
                    System.out.println("Player2 Defended--->"+D);
                    if(A-D>0){
                        H2=H2-(A-D);
                        System.out.println("Player2 taken Damage of:"+(A-D));
                    }
                    else{
                        System.out.println("Player2 taken Damage of: 0");
                    }
                    
                    System.out.println();
                    System.out.println("player2 Health:"+H2);
                    System.out.println();
                    c++;
                }
                else{
                    System.out.println("==========================================");
                    System.out.println("ROUND "+(c+1));
                    System.out.println("==========================================");
                    int D_A=r.nextInt(6-1)+1;
                    System.out.println("Player2 Rolled:"+D_A);
                    int D_D=r.nextInt(6-1)+1;
                    System.out.println("Player1 Rolled:"+D_D);
                    int A=D_A*A2;
                    int D=D_D*S1;
                    System.out.println("Player2 Attacked--->"+A);
                    System.out.println("Player1 Defended--->"+D);
                    if(A-D>0){
                        H1=H1-(A-D);
                        System.out.println("Player1 Taken Damage of:"+(A-D));
                    }
                    else{
                        System.out.println("Player1 Taken Damage of: 0");
                    }
                    System.out.println();
                    System.out.println("Player1 Health:"+H1);
                    System.out.println();
                    c++;
                }
                
                
            }
        }
        else{
            while(H1>0 && H2>0){
                if(c%2!=0){
                    System.out.println("==========================================");
                    System.out.println("ROUND "+(c+1));
                    System.out.println("==========================================");
                    int D_A=r.nextInt(6-1)+1;
                    System.out.println("Player2 Rolled:"+D_A);
                    int D_D=r.nextInt(6-1)+1;
                    System.out.println("Player1 Rolled:"+D_D);
                    int A=D_A*A1;
                    int D=D_D*S2;
                    System.out.println("Player2 Attacked--->"+A);
                    System.out.println("Player1 Defended--->"+D);
                    if(A-D>0){
                        H1=H1-(A-D);
                        System.out.println("Player1 Taken Damage of:"+(A-D));
                    }
                    else{
                        System.out.println("Player1 Taken Damage of: 0");
                    }
                    
                    System.out.println();
                    System.out.println("Player1 Health:"+H1);
                    System.out.println();
                    c++;
                }
                else{
                    System.out.println("==========================================");
                    System.out.println("ROUND "+(c+1));
                    System.out.println("==========================================");
                    int D_A=r.nextInt(6-1)+1;
                    System.out.println("Player1 Rolled:"+D_A);
                    int D_D=r.nextInt(6-1)+1;
                    System.out.println("Player2 Rolled:"+D_D);
                    int A=D_A*A2;
                    int D=D_D*S1;
                    System.out.println("Player1 Attacked--->"+A);
                    System.out.println("Player2 Defended--->"+D);
                    if(A-D>0){
                        H2=H2-(A-D);
                        System.out.println("Player2 taken Damage of:"+(A-D));
                    }
                    else{
                        System.out.println("Player2 taken Damage of: 0");
                    }
                    
                    System.out.println();
                    System.out.println("player2 Health:"+H2);
                    System.out.println();
                    c++;
                }
            }
        }
        System.out.println();
        System.out.println("=====GAME OVER=====");
        System.out.println();
        if(H1<=0){
            System.out.println("Player A lost with Health:"+H1);
            System.out.println("Player B Won with Health Remain:"+H2);
        }
        else{
            System.out.println("Player B lost with Health:"+H2);
            System.out.println("Player A Won with Health Remain:"+H1);
        }
        
    }    
}
