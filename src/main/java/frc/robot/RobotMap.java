/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;

/**
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  public static VictorSPX driveLeft1;
  public static VictorSPX driveLeft2;
  public static VictorSPX driveRight1;
  public static VictorSPX driveRight2;
  public static VictorSPX lift1;
  public static VictorSPX lift2;

  public static Encoder liftEncoder;
  public static void init(){
    driveLeft1 = new VictorSPX(2);
    driveLeft2 = new VictorSPX(1);
    driveRight1 = new VictorSPX(6);
    driveRight2 = new VictorSPX(7);
    lift1 = new VictorSPX(0);
    lift2 = new VictorSPX(5);

    //0,1 are just place holders
    liftEncoder = new Encoder(0,1,false,EncodingType.k4X);
  }
}
