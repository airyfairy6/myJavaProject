public class AppData {
    private String[] header = new String[]{"Value 1", "Value 2", "Value 3"};
    private int[][] data = {{100, 200, 300}, {400, 500, 600}};

    public int[][] getData() {
        return data;
    }

    public String[] getHeader() {
        return header;
    }

    public AppData() {

    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }
}




