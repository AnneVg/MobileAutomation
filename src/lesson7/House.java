package lesson7;

public class House  {

    private  final boolean hasOngKhoi;
    private final String color;
    private House (Builder builder){
    this.hasOngKhoi = builder.hasOngKhoi;
    this.color = builder.color;
    }

    public void buildHouse(){
        System.out.println("build the house with ong khoi");
        System.out.println("build the house with color");
    }
    // Inner class
    public  static class Builder{
        private boolean hasOngKhoi;
        private String color;
        Builder(){}
        public Builder hasOngKhoi(boolean hasOngKhoi){
            this.hasOngKhoi = hasOngKhoi;
            return this;
        }
        public Builder color(String color){
            this.color = color;
            return this;
        }
        public House build(){
            return  new House(this);
        }
    }

}
