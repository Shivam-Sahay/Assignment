public class Seconds {
    private int seconds;

    public Seconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
    public void Days(int seconds)
    {
        double days = seconds/86400;
        System.out.println("No. of days in "+ getSeconds()+ " seconds is "+days);
    }
    public void hours(int seconds)
    {
        double hours = seconds/3600;
        System.out.println("No. of hours in "+ getSeconds()+ " seconds is "+hours);
    }
    public void Minutes(int seconds)
    {
        double minutes = seconds/60;
        System.out.println("No. of Minutes in "+ getSeconds()+ " seconds is "+minutes);
    }
}
