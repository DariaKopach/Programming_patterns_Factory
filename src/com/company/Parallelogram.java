/*
 *
 * Classname: Parallelogram
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

public class Parallelogram implements IGeometry {

    private int smallSide;  // small side of Parallelogram
    private int bigSide;    // big side of Parallelogram
    private double angle;   // angle between big and small sides of Parallelogram

    // 1. Constructor:
    // a) generate an empty constructor using Java

    public Parallelogram() {
    }

    /**
     * b) generate the full constructor using Java
     * with the following parameters:
     *
     * @param smallSide, which will be set to Parallelogram object
     * @param bigSide,   which will be set to Parallelogram object
     * @param angle,     which will be set to Parallelogram object
     */

    public Parallelogram(int smallSide, int bigSide, double angle) {
        this.smallSide = smallSide;
        this.bigSide = bigSide;
        this.angle = angle;
    }

    // 2. Generate getters and setters

    public int getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(int smallSide) {
        this.smallSide = smallSide;
    }

    public int getBigSide() {
        return bigSide;
    }

    public void setBigSide(int bigSide) {
        this.bigSide = bigSide;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        angle = angle;
    }

    /**
     * Method for calculating the short diagonal
     * Formula:
     * URL: https://en.wikipedia.org/wiki/Parallelogram
     *
     * @return the calculated length of short diagonal of Parallelogram.
     */

    public double getShortDiagonal() {
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() - 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    /**
     * Method for calculating the the long diagonal
     * Formula:
     * URL: https://en.wikipedia.org/wiki/Parallelogram
     *
     * @return the calculated length of long diagonal  of Parallelogram
     */

    public double getLongDiagonal() {
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() + 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }


    /**
     * Implements method to calculate Parallelogram's area from IGeometry.
     *
     * @return the calculated area of Parallelogram.
     */

    @Override
    public double getArea() {
        return this.getSmallSide() * this.getBigSide() * Math.sin(this.getAngle());
    }

    /**
     * Implements method to calculate Parallelogram's perimeter from IGeometry.
     *
     * @return the calculated perimeter of Parallelogram.
     */

    @Override
    public double getLinearLength() {
        return 2 * (this.getSmallSide() + this.getBigSide());
    }


    /**
     * Method to get formatted Parallelogram object
     *
     * @return Returns info about Parallelogram object
     */

    @Override
    public String toString() {
        return "Parallelogram{" +
                "smallSide = " + smallSide +
                ", bigSide = " + bigSide +
                ", angle = " + angle +
                ", Linear Length = " + this.getLinearLength() +
                ", Area = " + this.getArea() +
                '}';
    }

    /**
     * Method to check whether object equals by value
     *
     * @param o Object as parameter
     * @return Return boolean value as a result
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return smallSide == that.smallSide &&
                bigSide == that.bigSide &&
                Double.compare(that.angle, angle) == 0;
    }

    /**
     * Method to get object hash
     *
     * @return hash of Parallelogram
     */

    @Override
    public int hashCode() {
        return Objects.hash(smallSide, bigSide, angle);
    }
}

