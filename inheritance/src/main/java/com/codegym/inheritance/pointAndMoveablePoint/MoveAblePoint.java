package com.codegym.inheritance.pointAndMoveablePoint;

public class MoveAblePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveAblePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return (super.toString() + ", speed = " + "(" + this.xSpeed + " , " + this.ySpeed + " )");
    }
    public MoveAblePoint move() {
        setX(getX()+this.xSpeed);
        setY(getY()+this.ySpeed);
        return this;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = new float[2];
        array[0] = this.xSpeed;
        array[1] = this.ySpeed;
        return array;
    }
    public static void main(String[] args) {
        MoveAblePoint moveablePoint=new MoveAblePoint(3,4,6,7);
        moveablePoint.move();
        System.out.print(moveablePoint.toString());
        float[] array=moveablePoint.getSpeed();
    }
}
