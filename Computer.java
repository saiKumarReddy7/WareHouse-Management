package Main;

public class Computer {
    private String brandName;
    private String modelName;
    private int hardDriveCapacity;
    private int memory;
    private float cpuSpeed;
    private float price;

    public String getBrandName() {
        return this.brandName;
    }
    // Java convetion for arguments is lowerCamelCase
    public void setBrandName(String Brandname)
    {
        this.brandName =Brandname;
    }
    public String getModelName()
    {
        return this.modelName;
    }
    // Java convetion for arguments is lowerCamelCase
    public void setModelName(String Modelname)
    {
        this.modelName=Modelname;
    }
    public int getHardDeriveCapacity()
    {
        return this.hardDriveCapacity;
    }
    // Java convetion for arguments is lowerCamelCase
    public void setHardDriveCapacity(int HardDirveCapacity)
    {
        this.hardDriveCapacity=HardDirveCapacity;
    }
    public int getMemory()
    {
        return this.memory;
    }
    // Java convetion for arguments is lowerCamelCase
    public void setMemory(int Memory)
    {
        this.memory=Memory;
    }
    public float getCpuSpeed()
    {
        return this.cpuSpeed;
    }
    // Java convetion for arguments is lowerCamelCase
    public void setCpuSpeed(float CpuSpeed)
    {
        this.cpuSpeed=CpuSpeed;
    }
    public float getPrice() {
        return this.price;
    }
    // Java convetion for arguments is lowerCamelCase
    public void setPrice(float Price) {
        this.price = Price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", hardDriveCapacity=" + hardDriveCapacity +
                ", memory=" + memory +
                ", cpuSpeed=" + cpuSpeed +
                ", price=" + price +
                '}';
    }
}


