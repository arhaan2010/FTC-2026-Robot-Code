package org.firstinspires.ftc.teamcode.auto.blue;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierCurve;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.Path;
import com.pedropathing.paths.PathChain;

public class BluePaths {

    public PathChain preloadPath;

    public PathChain collectBall1;
    public PathChain shootBall1;

    public PathChain collectBall2;
    public PathChain shootBall2;

    public PathChain collectBall3;
    public PathChain shootBall3;

    public PathChain parkPath;

    public BluePaths(Follower follower) {

        preloadPath = follower.pathBuilder()

                .addPath(
                        new Path(
                                new BezierCurve(
                                        BlueConstants.START,
                                        new Pose(12, 0),
                                        BlueConstants.SHOOT
                                )
                        )
                )

                .setConstantHeadingInterpolation(
                        Math.toRadians(0)
                )

                .build();

        collectBall1 = follower.pathBuilder()

                .addPath(
                        new Path(
                                BezierCurve.through(
                                        BlueConstants.SHOOT,
                                        new Pose(30, 6),
                                        BlueConstants.BALL1
                                )
                        )
                )

                .build();

        shootBall1 = follower.pathBuilder()

                .addPath(
                        new Path(
                                BezierCurve.through(
                                        BlueConstants.BALL1,
                                        new Pose(30, 6),
                                        BlueConstants.SHOOT
                                )
                        )
                )

                .build();

        collectBall2 = follower.pathBuilder()

                .addPath(
                        new Path(
                                BezierCurve.through(
                                        BlueConstants.SHOOT,
                                        new Pose(42, 10),
                                        BlueConstants.BALL2
                                )
                        )
                )

                .build();

        shootBall2 = follower.pathBuilder()

                .addPath(
                        new Path(
                                BezierCurve.through(
                                        BlueConstants.BALL2,
                                        new Pose(42, 10),
                                        BlueConstants.SHOOT
                                )
                        )
                )

                .build();

        collectBall3 = follower.pathBuilder()

                .addPath(
                        new Path(
                                BezierCurve.through(
                                        BlueConstants.SHOOT,
                                        new Pose(54, 12),
                                        BlueConstants.BALL3
                                )
                        )
                )

                .build();

        shootBall3 = follower.pathBuilder()

                .addPath(
                        new Path(
                                BezierCurve.through(
                                        BlueConstants.BALL3,
                                        new Pose(54, 12),
                                        BlueConstants.SHOOT
                                )
                        )
                )

                .build();

        parkPath = follower.pathBuilder()

                .addPath(
                        new Path(
                                BezierCurve.through(
                                        BlueConstants.SHOOT,
                                        new Pose(60, 18),
                                        BlueConstants.PARK
                                )
                        )
                )

                .build();
    }
}