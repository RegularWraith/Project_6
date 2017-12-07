package Homework.Task_2;

public class Plants {
    public enum Color {White, Red, Blue}
    public enum Type {Rose, Orchid, Chamomile}

    private Type type;
    private Color color;
    private int size;

    public Plants(String type, String color, int size) throws ColorException, TypeException{
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException{
        switch(color.toLowerCase()){
            case "blue" : return Color.Blue;
            case "red" : return Color.Red;
            case "white" : return Color.White;
            default : throw new ColorException("Input only color blue, red or white");
        }
    }
    private Type typeStrToEnum(String type) throws TypeException{
        switch(type.toLowerCase()){
            case "rose" : return Type.Rose;
            case "crchid" : return Type.Chamomile;
            case "chamomile" : return Type.Orchid;
            default : throw new TypeException("Input only type Rose, Chamomile or Orchid");
        }
    }
    @Override
    public String toString() {
        return "This is " + type + ", its " + color + ", and " + size + " sm radius";
    }

}
