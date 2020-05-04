package raylib.jna;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;
import raylib.jna.Image;
import clojure.lang.Keyword;
import clojure.lang.APersistentMap;

@FieldOrder({"value","offsetX","offsetY","advanceX","image"})
public class CharInfo extends Structure{
    public static class ByReference extends CharInfo implements Structure.ByReference {
        public ByReference(int value, int offsetX, int offsetY, int advanceX, Image image){
            super(value, offsetX, offsetY, advanceX, image);
        }

        public ByReference(){
            super();
        }

        public ByReference(APersistentMap map){
            super(map);
        }
    }
    public int value;
    public int offsetX;
    public int offsetY;
    public int advanceX;
    public Image image;

    public CharInfo(APersistentMap map){
        super();
        Number value = (Number)map.get(Keyword.intern("value"));
        if(value == null)
            throw new IllegalArgumentException("Map needs key :value");
        this.value = value.intValue();
        Number offsetX = (Number)map.get(Keyword.intern("offsetX"));
        if(offsetX == null)
            throw new IllegalArgumentException("Map needs key :offsetX");
        this.offsetX = offsetX.intValue();
        Number offsetY = (Number)map.get(Keyword.intern("offsetY"));
        if(offsetY == null)
            throw new IllegalArgumentException("Map needs key :offsetY");
        this.offsetY = offsetY.intValue();
        Number advanceX = (Number)map.get(Keyword.intern("advanceX"));
        if(advanceX == null)
            throw new IllegalArgumentException("Map needs key :advanceX");
        this.advanceX = advanceX.intValue();
        Object image = map.get(Keyword.intern("image"));
        if(image == null)
            throw new IllegalArgumentException("Map needs key :image");
        if(image instanceof APersistentMap){
            this.image = new Image((APersistentMap)image);
        }
        else if(image instanceof Image){
            this.image = new Image((Image)image);
        }
        else{
            throw new IllegalArgumentException(":image is of unsupported type");
        }
    }

    public CharInfo(int value, int offsetX, int offsetY, int advanceX, Image image){
        super();
        this.value = value;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.advanceX = advanceX;
        this.image = image;
    }

    public CharInfo(){
        super();
    }
}
