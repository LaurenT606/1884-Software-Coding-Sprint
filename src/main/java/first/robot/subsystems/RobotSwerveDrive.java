package first.robot.subsystems;
// Implement this class with its respective methods

import org.wpilib.command2.SubsystemBase;
import org.wpilib.math.geometry.Rotation2d;
import org.wpilib.math.geometry.Pose2d;
import org.wpilib.math.geometry.Transform2d;

public class RobotSwerveDrive extends SubsystemBase {
    private Rotation2d robotRotation;
    private Pose2d robotPosition;

    // uses the this() keyword to pass in a default rotation and pose to construct
    public RobotSwerveDrive() {

    }

    // Constructs a RobotSwerveDrive object (assigns values of initialPose and initialRotation to robotRotation and robotPose
    public RobotSwerveDrive(Pose2d initialPose, Rotation2d initialRotation) {
        robotPosition = initialPose;
        robotRotation = initialRotation;
    }

    // Calling this method will make the robot move by a Transform2d

    /*
    	Precondition: transformation will have no angle attached to it
   		Postcondition: robotPosition will be modified by Transform2d transformation
    */
    public void moveRobotLinearly(Transform2d transformation) {
        robotPosition = robotPosition.plus(transformation);
    }

    // Calling this method will make the robot rotate by a Rotation2d

    /*
        Postcondition: robotPosition will be modified by Rotation2d transformation
    */
    public void rotateRobot(Rotation2d transformation) {
        robotRotation = robotRotation.plus(transformation);
    }

    // Calling this method will return a Pose2d with a rotation robotRotation applied to it

    /*
    	Postcondition: robotRotation and robotPosition are unmodified
    */
    public Pose2d returnCombinedPosition() {
        return new Pose2d(robotPosition.getTranslation(), robotRotation.plus(robotPosition.getRotation()));
    }

}
