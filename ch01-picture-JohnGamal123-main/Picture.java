/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;
private Square shed;
private Triangle pyramid;
private Circle zero;
private Square block;
private Circle sphere;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        drawn = false;
        shed = new Square();
        pyramid = new Triangle();
        zero = new Circle();
        block = new Square();
        sphere = new Circle();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
            
            shed.makeVisible();
            shed.changeColor("blue");
            shed.moveHorizontal(60);
            shed.moveVertical(70);
            shed.changeSize(45);
            
            pyramid.makeVisible();
            pyramid.changeColor("orange");
            pyramid.moveHorizontal(-70);
            pyramid.moveVertical(50);
            pyramid.changeColor("orange");

            zero.makeVisible();
            zero.changeColor("black");
            zero.moveHorizontal(150);
            zero.moveVertical(-80);
            
            block.makeVisible();
            block.changeColor("purple");
            block.moveHorizontal(100);
            block.moveVertical(-50);
            
            sphere.changeColor("blue");
            sphere.moveHorizontal(180);
            sphere.moveVertical(75);
            sphere.makeVisible();
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        shed.changeColor("blue");
        pyramid.changeColor("orange");
        zero.changeColor("black");
        block.changeColor("pruple");
        sphere.changeColor("blue");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
