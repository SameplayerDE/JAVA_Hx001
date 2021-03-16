package Framework;

public class HxVec3 {

    private float x, y, z;

    public HxVec3() {}
    public HxVec3(float a) {
        this(a, a, a);
    }
    public HxVec3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
