/*
 *
 * Classname: Rhombus
 *
 * @version 13.06.2020
 *
 * @author Kopach Daria
 *
 * Description:Programming patterns. Factory
 *
 */

package com.company;

import java.util.Objects;

public class Rhombus extends Parallelogram {

    private int side;      // side of Rhombus
    private double angle;  // angle of Rhombus

    /**
     * generate the full constructor using Java
     * with the following parameters:
     * @param side, which will be set to Parallelogram object
     * @param angle, which will be set to Parallelogram object
     */

    public Rhombus(int side, double angle) {
        super(side, side, angle);
        this.side = side;
        this.angle = angle;
    }

    // generate getters and setters

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getAngle() {
        return angle;
    }

    @Override
    public void setAngle(double angle) {
        this.angle = angle;
    }

    /*
     * Method to get formatted Parallelogram object
     * @return Returns info about Parallelogram object
     */

    @Override
    public String toString() {
        return "Rhombus {" +
                "side = " + side +
                ", angle = " + angle +
                '}';
    }

    // Generate equals and hashcode

    /**
     * Method to check whether object equals to smth
     * @param o Object as parameter
     * @return Return boolean value as a result
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rhombus rhombus = (Rhombus) o;
        return side == rhombus.side &&
                Double.compare(rhombus.angle, angle) == 0;
    }

    /**
     * Method to get object hash
     * @return Returns rectangularBox object hash.
     */

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side, angle);
    }
}
