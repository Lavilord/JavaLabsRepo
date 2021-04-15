package lab1;

public class App {
    public static  void main(String ... args){
        ProjectorScreen whiteScreen = new ProjectorScreen(10, 20, "Samsung", "wall");
        ProjectorScreen blackScreen = new ProjectorScreen(40,50,"Xiaomi","ceil",
                "proScreenInc", 300,"plastic", "Windows", 100, 20,
                "black");
        ProjectorScreen redScreen = new ProjectorScreen(10,40,"Huawei","floor");
        System.out.println(whiteScreen);
        System.out.println(blackScreen);
        System.out.println(redScreen);
        whiteScreen.printProjectorCounter();
        ProjectorScreen.printStaticProjectorCounter();
    }

}
