package frc.team2851.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot
{
    TalonSRX leftTalon1, leftTalon2, rightTalon1, rightTalon2;
    Joystick gamePad;

    DoubleSolenoid solenoid;
    @Override
    public void robotInit()
    {
        solenoid = new DoubleSolenoid(0, 1);
        /*
        leftTalon1 = new TalonSRX(12);
        leftTalon2 = new TalonSRX(22);
        rightTalon1 = new TalonSRX(21);
        rightTalon2 = new TalonSRX(10);
        gamePad = new Joystick(0);
         */
    }

    @Override
    public void teleopPeriodic()
    {
        solenoid.set(DoubleSolenoid.Value.kForward);
        /*
        leftTalon1.set(ControlMode.PercentOutput, gamePad.getRawAxis(1));
        leftTalon2.set(ControlMode.Follower, leftTalon1.getDeviceID());
        rightTalon1.set(ControlMode.PercentOutput, gamePad.getRawAxis(5));
        rightTalon2.set(ControlMode.Follower, rightTalon2.getDeviceID());
         */
    }
}
