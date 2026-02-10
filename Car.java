public abstract class Car {

    public float accelerationForce;
    public float brakeForce;
    public float dragX;

    public float weight;
    public float speed;
    public float aeroX;
    public float slippingPoint;
    public drivetrain drivetrain;

    public float x, y;
    public float velocityX;
    public float velocityY;
    public float angle;
    public float angularVelocity;
    

    public float throttle;
    public float brake;

    public float turnValue;
    public float maxTurnValue;


    public enum drivetrain {
        RWD,
        FWD,
        AWD
    }


    
}