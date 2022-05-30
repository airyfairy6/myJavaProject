package Lesson_4;

public class Park {

    private String name;

    public Park() {
    }

    public void info(String name) {
        System.out.println("Парк " + name);
    }

    public Park(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public class Attraction {
        private String attractionName;
        private int attractionCost;
        private String attractionWorkingHours;


        public String getAttractionName() {
            return attractionName;
        }

        public int getAttractionCost() {
            return attractionCost;
        }

        public String getAttractionWorkingHours() {
            return attractionWorkingHours;
        }

        public Attraction() {

        }

        public Attraction(String attractionName, int attractionCost, String attractionWorkingHours) {
            this.attractionName = attractionName;
            this.attractionCost = attractionCost;
            this.attractionWorkingHours = attractionWorkingHours;
        }

        public void infoAttraction() {
            System.out.println("Аттракцион: " + attractionName + ". Стоимость: " + attractionCost + " руб. Часы работы: " + attractionWorkingHours);
        }


    }

}

