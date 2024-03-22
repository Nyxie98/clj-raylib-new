package raylib.jna;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;
import raylib.jna.Matrix;
import clojure.lang.APersistentMap;
import clojure.lang.Keyword;

@FieldOrder({"projection", "viewOffset", "leftLensCenter", "rightLensCenter", "leftScreenCenter", 
             "rightScreenCenter", "scale", "scaleIn"})
public class VrStereoConfig extends Structure{
  public static class ByValue extends VrStereoConfig implements Structure.ByValue{
    public ByValue() {
      super();
    }

    public ByValue(APersistentMap map) {
      super(map);
    }

    public ByValue(
      Matrix[] projection,
      Matrix[] viewOffset,
      float[] leftLensCenter,
      float[] rightLensCenter,
      float[] leftScreenCenter,
      float[] rightScreenCenter,
      float[] scale,
      float[] scaleIn
    ) {
      super(projection, viewOffset, leftLensCenter, rightLensCenter, leftScreenCenter, rightScreenCenter, 
            scale, scaleIn);
    };

    public ByValue(Object obj) {
      super(obj);
    }
  }

  public Matrix[] projection = new Matrix[2];
  public Matrix[] viewOffset = new Matrix[2];
  public float[] leftLensCenter = new float[2];
  public float[] rightLensCenter = new float[2];
  public float[] leftScreenCenter = new float[2];
  public float[] rightScreenCenter = new float[2];
  public float[] scale = new float[2];
  public float[] scaleIn = new float[2];

  public VrStereoConfig(
    Matrix[] projection,
    Matrix[] viewOffset,
    float[] leftLensCenter,
    float[] rightLensCenter,
    float[] leftScreenCenter,
    float[] rightScreenCenter,
    float[] scale,
    float[] scaleIn
  ) {
    super();
    this.projection = projection;
    this.viewOffset = viewOffset;
    this.leftLensCenter = leftLensCenter;
    this.rightLensCenter = rightLensCenter;
    this.leftScreenCenter = leftScreenCenter;
    this.rightScreenCenter = rightScreenCenter;
    this.scale = scale;
    this.scaleIn = scaleIn;
  }

  public VrStereoConfig(VrStereoConfig vsc) {
    super();
    this.projection = vsc.projection;
    this.viewOffset = vsc.viewOffset;
    this.leftLensCenter = vsc.leftLensCenter;
    this.rightLensCenter = vsc.rightLensCenter;
    this.leftScreenCenter = vsc.leftScreenCenter;
    this.rightScreenCenter = vsc.rightScreenCenter;
    this.scale = vsc.scale;
    this.scaleIn = vsc.scaleIn;
  }

  public VrStereoConfig(APersistentMap map) {
    super();

    Object projection = map.get(Keyword.intern("projection"));

    if (projection == null) {
      throw new IllegalArgumentException("Map needs key :projection");
    }
    if (projection instanceof APersistentMap) {
      this.projection = (Matrix[])projection;
    } else if (projection instanceof Matrix[]) {
      this.projection = (Matrix[])projection;
    } else {
      throw new IllegalArgumentException(":projection is of unsupported type");
    }

    Object viewOffset = map.get(Keyword.intern("viewOffset"));
    if (viewOffset == null) {
      throw new IllegalArgumentException("Map needs key :viewOffset");
    }
    if (viewOffset instanceof APersistentMap) {
      this.viewOffset = (Matrix[])viewOffset;
    } else if (viewOffset instanceof Matrix[]) {
      this.viewOffset = (Matrix[])viewOffset;
    } else {
      throw new IllegalArgumentException(":viewOffset is of unsupported type");
    }

    Object leftLensCenter = map.get(Keyword.intern("leftLensCenter"));
    if (leftLensCenter == null) {
      throw new IllegalArgumentException("Map needs key :leftLensCenter");
    }
    this.leftLensCenter = (float[])leftLensCenter;

    Object rightLensCenter = map.get(Keyword.intern("rightLensCenter"));
    if (rightLensCenter == null) {
      throw new IllegalArgumentException("Map needs key :rightLensCenter");
    }
    this.rightLensCenter = (float[])rightLensCenter;

    Object leftScreenCenter = map.get(Keyword.intern("leftScreenCenter"));
    if (leftScreenCenter == null) {
      throw new IllegalArgumentException("Map needs key :leftScreenCenter");
    }
    this.leftScreenCenter = (float[])leftScreenCenter;

    Object rightScreenCenter = map.get(Keyword.intern("rightScreenCenter"));
    if (rightScreenCenter == null) {
      throw new IllegalArgumentException("Map needs key :rightScreenCenter");
    }
    this.rightScreenCenter = (float[])rightScreenCenter;

    Object scale = map.get(Keyword.intern("scale"));
    if (scale == null) {
      throw new IllegalArgumentException("Map needs key :scale");
    }
    this.scale = (float[])scale;

    Object scaleIn = map.get(Keyword.intern("scaleIn"));
    if (scaleIn == null) {
      throw new IllegalArgumentException("Map needs key :scaleIn");
    }
    this.scaleIn = (float[])scaleIn;
  }

  public VrStereoConfig(Object obj) throws IllegalArgumentException {
    super();
    if (obj instanceof VrStereoConfig) {
      VrStereoConfig vsc = (VrStereoConfig)obj;
      this.projection = vsc.projection;
      this.viewOffset = vsc.viewOffset;
      this.leftLensCenter = vsc.leftLensCenter;
      this.rightLensCenter = vsc.rightLensCenter;
      this.leftScreenCenter = vsc.leftScreenCenter;
      this.rightScreenCenter = vsc.rightScreenCenter;
      this.scale = vsc.scale;
      this.scaleIn = vsc.scaleIn;
    } else if (obj instanceof APersistentMap) {
      APersistentMap map = (APersistentMap)obj;
      Object projection = map.get(Keyword.intern("projection"));

      if (projection == null) {
        throw new IllegalArgumentException("Map needs key :projection");
      }
      if (projection instanceof APersistentMap) {
        this.projection = (Matrix[])projection;
      } else if (projection instanceof Matrix[]) {
        this.projection = (Matrix[])projection;
      } else {
        throw new IllegalArgumentException(":projection is of unsupported type");
      }

      Object viewOffset = map.get(Keyword.intern("viewOffset"));
      if (viewOffset == null) {
        throw new IllegalArgumentException("Map needs key :viewOffset");
      }
      if (viewOffset instanceof APersistentMap) {
        this.viewOffset = (Matrix[])viewOffset;
      } else if (viewOffset instanceof Matrix[]) {
        this.viewOffset = (Matrix[])viewOffset;
      } else {
        throw new IllegalArgumentException(":viewOffset is of unsupported type");
      }

      Object leftLensCenter = map.get(Keyword.intern("leftLensCenter"));
      if (leftLensCenter == null) {
        throw new IllegalArgumentException("Map needs key :leftLensCenter");
      }
      this.leftLensCenter = (float[])leftLensCenter;

      Object rightLensCenter = map.get(Keyword.intern("rightLensCenter"));
      if (rightLensCenter == null) {
        throw new IllegalArgumentException("Map needs key :rightLensCenter");
      }
      this.rightLensCenter = (float[])rightLensCenter;

      Object leftScreenCenter = map.get(Keyword.intern("leftScreenCenter"));
      if (leftScreenCenter == null) {
        throw new IllegalArgumentException("Map needs key :leftScreenCenter");
      }
      this.leftScreenCenter = (float[])leftScreenCenter;

      Object rightScreenCenter = map.get(Keyword.intern("rightScreenCenter"));
      if (rightScreenCenter == null) {
        throw new IllegalArgumentException("Map needs key :rightScreenCenter");
      }
      this.rightScreenCenter = (float[])rightScreenCenter;

      Object scale = map.get(Keyword.intern("scale"));
      if (scale == null) {
        throw new IllegalArgumentException("Map needs key :scale");
      }
      this.scale = (float[])scale;

      Object scaleIn = map.get(Keyword.intern("scaleIn"));
      if (scaleIn == null) {
        throw new IllegalArgumentException("Map needs key :scaleIn");
      }
      this.scaleIn = (float[])scaleIn;
    } else {
      throw new IllegalArgumentException("obj of unsupported type " + obj);
    }
  }

  public VrStereoConfig() {
    super();
  }
}
