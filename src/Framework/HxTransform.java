package Framework;

public class HxTransform extends HxComponent {

    private HxVec3 position;
    private HxVec3 rotation;
    private HxVec3 scale;

    public HxVec3 getPosition() {
        return position;
    }

    public HxVec3 getRotation() {
        return rotation;
    }

    public HxVec3 getScale() {
        return scale;
    }

    public void setPosition(HxVec3 position) {
        this.position = position;
    }

    public void setRotation(HxVec3 rotation) {
        this.rotation = rotation;
    }

    public void setScale(HxVec3 scale) {
        this.scale = scale;
    }
}
