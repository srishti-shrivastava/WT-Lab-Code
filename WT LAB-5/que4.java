class plate
{
    private int length;
    private int width;
    public int getlength()
    {
        return length;
    }
    public void setlength(int length)
    {
        this.length=length;
    }
    public int getwidth()
    {
        return width;
    }
    public void setwidth(int width)
    {
        this.width=width;
    }
}  

class box extends plate
{
    private int height;
    public int getheight()
    {
        return height;
    }
    public void setheight(int height)
    {
        this.height=height;
    }

}

class woodbox extends box
{
    private int thick;
    public int getthick()
    {
        return thick;
    }
    public void setthick(int thick)
    {
        this.thick=thick;
    }
}

public class que4
{
    public static void main(String[] args) {
        woodbox w1=new woodbox();
        w1.setlength(12);
        w1.setwidth(4);
        w1.setheight(7);
        w1.setthick(3);
        System.out.println("Length:" +w1.getlength());
        System.out.println("width:" +w1.getwidth());
        System.out.println("height:" +w1.getheight());
        System.out.println("Thick:" +w1.getthick());


    }
}