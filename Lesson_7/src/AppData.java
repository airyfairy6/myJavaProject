import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public int[][] getData() {
        return data;
    }

    public String[] getHeader() {
        return header;
    }
    public AppData() {

    }

    public AppData(String[] header, int [][]data) {
        this.header = header;
        this.data = data;
    }
    public void add( int k, String m){
for (int i=1; i<=3; i++){
    for(int j=0; j<=3; j++){
            header[i]= m+i;
            System.out.println(Arrays.toString(header)+" ");
            data[i][j]=k+100;
            System.out.println(Arrays.toString(data)+" ");
        }
    }
}
    }



