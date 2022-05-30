package main.java;

public class Level11 {

    private  int width;
    private  int height;

    public Level11(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}

class LevelLoader11 {


    public void load(Level11 level) throws LevelTooBigException {
        int s= level.getHeight() * level.getWidth();
        if (s < 100000)
            System.out.println("Level loaded");
        if(s > 100000)
        { throw new LevelTooBigException();}

    }}


class LevelTooBigException extends Exception {
    LevelTooBigException() {

    }
}

class LevelLoaderTest11 {
    public static void main(String[] args)   {
        try { new LevelLoader11().load(new Level11(10, 20));

        } catch (LevelTooBigException e) {
            System.out.println("Level too big");
        }
        // .load(new Level11(10, 200));

        try { new LevelLoader11().load(new Level11(10000, 2000));

        } catch (LevelTooBigException e) {
            System.out.println("Level too big");
        }
    }}