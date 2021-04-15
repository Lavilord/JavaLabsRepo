package lab1;

public class ProjectorScreen {
    private int height;
    private int width;
    private String manufacturer;
    private String connectionType;
    private String distributor;
    private int price;
    private String material;
    private String operationSystem;
    private int quality;
    private static int projectorCounter;
    protected int priceInDollars;
    protected String screenColor;

    public ProjectorScreen(int height, int width, String manufacturer, String connectionType, String distributor,
                           int price, String material, String operationSystem, int quality, int priceInDolars,
                           String screenColor) {
        setProjectorScreenValues(height,width,manufacturer,connectionType,distributor,price,material,operationSystem,
                quality,priceInDolars,screenColor);
        projectorCounter++;
    }

    public ProjectorScreen(int height, int width, String manufacturer, String connectionType) {
        this(height,width,manufacturer,connectionType, null,0,null,null,
                0,0,null);
    }
    private void setProjectorScreenValues(int height, int width, String manufacturer, String connectionType, String distributor,
                                          int price, String material, String operationSystem, int quality, int priceInDolars,
                                          String screenColor){
        this.height = height;
        this.width = width;
        this.manufacturer = manufacturer;
        this.connectionType = connectionType;
        this.distributor = distributor;
        this.price = price;
        this.material = material;
        this.operationSystem = operationSystem;
        this.quality = quality;
        this.priceInDollars = priceInDolars;
        this.screenColor = screenColor;
    }

    private void resetProjectorScreenValues(int height, int width, String manufacturer, String connectionType, String distributor,
                                            int price, String material, String operationSystem, int quality, int priceInDolars,
                                            String screenColor){
        setProjectorScreenValues(height,width,manufacturer,connectionType,distributor,price,material,operationSystem,
                quality,priceInDolars,screenColor);
    }
    public static void printStaticProjectorCounter(){
        System.out.println(projectorCounter);
    }
    public void printProjectorCounter(){
        System.out.println(projectorCounter);
    }
    @Override
    public String toString() {
        return "ProjectorScreen{" +
                "height=" + height +
                ", width=" + width +
                ", manufacturer='" + manufacturer + '\'' +
                ", connectionType='" + connectionType + '\'' +
                ", distributor='" + distributor + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                ", quality=" + quality +
                ", priceInDollars=" + priceInDollars +
                ", screenColor='" + screenColor + '\'' +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getPriceInDollars() {
        return priceInDollars;
    }

    public void setPriceInDollars(int priceInDollars) {
        this.priceInDollars = priceInDollars;
    }

    public String getScreenColor() {
        return screenColor;
    }

    public void setScreenColor(String screenColor) {
        this.screenColor = screenColor;
    }
}
