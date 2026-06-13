package org.firstinspires.ftc.teamcode.auto.blue;
import com.pedropathing.follower.Follower;
import com.pedropathing.follower.FollowerConstants;

import com.pedropathing.ftc.FollowerBuilder;

import com.pedropathing.ftc.drivetrains.MecanumConstants;

import com.pedropathing.ftc.localization.constants.PinpointConstants;

import com.pedropathing.geometry.Pose;
import com.pedropathing.geometry.BezierCurve;

import com.pedropathing.paths.Path;
import com.pedropathing.paths.PathChain;

public enum BlueStates {

    SHOOT_PRELOAD,

    COLLECT_BALL_1,
    SHOOT_BALL_1,

    COLLECT_BALL_2,
    SHOOT_BALL_2,

    COLLECT_BALL_3,
    SHOOT_BALL_3,

    PARK,

    IDLE
}