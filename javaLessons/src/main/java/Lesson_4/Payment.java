package Lesson_4;

public class Payment {

    private String name;

    public Payment() {
    }

    public Payment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public class Products {
        private String productName;
        private int productCost;


        public String getProductName() {
            return productName;
        }

        public int getProductCost() {
            return productCost;
        }


        public Products() {

        }

        public Products(String productName, int productCost) {
            this.productName = productName;
            this.productCost = productCost;
        }

        public void infoProducts() {
            System.out.println("Товар " + productName + "  можно приобрести по стоимости " + productCost + " руб. за 1 шт.");
        }


    }


    public void set(Products p, int b) {
        System.out.println("Приобретен товар " + p.productName + " в количестве " + b + " единиц.");
    }

}


