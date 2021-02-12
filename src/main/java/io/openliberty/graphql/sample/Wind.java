// ******************************************************************************
//  Copyright (c) 2021 IBM Corporation and others.
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  which accompanies this distribution, and is available at
//  http://www.eclipse.org/legal/epl-v10.html
//
//  Contributors:
//  IBM Corporation - initial API and implementation
// ******************************************************************************
package io.openliberty.graphql.sample;

public class Wind {

    private int direction; // valid directions are 0-359
    private double speed; 
    private double gustSpeed;

    public Wind() {}

    public Wind(int direction, double speed, double gustSpeed) {
        this.direction = direction;
        this.speed = speed;
        this.gustSpeed = gustSpeed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getGustSpeed() {
        return gustSpeed;
    }

    public void setGustSpeed(double gustSpeed) {
        this.gustSpeed = gustSpeed;
    }
}
