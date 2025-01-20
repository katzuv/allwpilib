// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// THIS FILE WAS AUTO-GENERATED BY ./wpilibNewCommands/generate_hids.py. DO NOT MODIFY

package edu.wpi.first.wpilibj2.command.button;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.event.EventLoop;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

/**
 * A version of {@link PS4Controller} with {@link Trigger} factories for command-based.
 *
 * @see PS4Controller
 */
@SuppressWarnings("MethodName")
public class CommandPS4Controller extends CommandGenericHID {
  private final PS4Controller m_hid;

  /**
   * Construct an instance of a controller.
   *
   * @param port The port index on the Driver Station that the controller is plugged into.
   */
  public CommandPS4Controller(int port) {
    super(port);
    m_hid = new PS4Controller(port);
  }

  /**
   * Get the underlying GenericHID object.
   *
   * @return the wrapped GenericHID object
   */
  @Override
  public PS4Controller getHID() {
    return m_hid;
  }

  /**
   * Constructs a Trigger instance around the square button's digital signal.
   *
   * @return a Trigger instance representing the square button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #square(EventLoop)
   */
  public Trigger square() {
    return square(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the square button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the square button's digital signal attached
   *     to the given loop.
   */
  public Trigger square(EventLoop loop) {
    return button(PS4Controller.Button.kSquare.value, loop);
  }

  /**
   * Constructs a Trigger instance around the cross button's digital signal.
   *
   * @return a Trigger instance representing the cross button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #cross(EventLoop)
   */
  public Trigger cross() {
    return cross(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the cross button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the cross button's digital signal attached
   *     to the given loop.
   */
  public Trigger cross(EventLoop loop) {
    return button(PS4Controller.Button.kCross.value, loop);
  }

  /**
   * Constructs a Trigger instance around the circle button's digital signal.
   *
   * @return a Trigger instance representing the circle button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #circle(EventLoop)
   */
  public Trigger circle() {
    return circle(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the circle button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the circle button's digital signal attached
   *     to the given loop.
   */
  public Trigger circle(EventLoop loop) {
    return button(PS4Controller.Button.kCircle.value, loop);
  }

  /**
   * Constructs a Trigger instance around the triangle button's digital signal.
   *
   * @return a Trigger instance representing the triangle button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #triangle(EventLoop)
   */
  public Trigger triangle() {
    return triangle(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the triangle button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the triangle button's digital signal attached
   *     to the given loop.
   */
  public Trigger triangle(EventLoop loop) {
    return button(PS4Controller.Button.kTriangle.value, loop);
  }

  /**
   * Constructs a Trigger instance around the left trigger 1 button's digital signal.
   *
   * @return a Trigger instance representing the left trigger 1 button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #L1(EventLoop)
   */
  public Trigger L1() {
    return L1(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the left trigger 1 button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the left trigger 1 button's digital signal attached
   *     to the given loop.
   */
  public Trigger L1(EventLoop loop) {
    return button(PS4Controller.Button.kL1.value, loop);
  }

  /**
   * Constructs a Trigger instance around the right trigger 1 button's digital signal.
   *
   * @return a Trigger instance representing the right trigger 1 button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #R1(EventLoop)
   */
  public Trigger R1() {
    return R1(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the right trigger 1 button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the right trigger 1 button's digital signal attached
   *     to the given loop.
   */
  public Trigger R1(EventLoop loop) {
    return button(PS4Controller.Button.kR1.value, loop);
  }

  /**
   * Constructs a Trigger instance around the left trigger 2 button's digital signal.
   *
   * @return a Trigger instance representing the left trigger 2 button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #L2(EventLoop)
   */
  public Trigger L2() {
    return L2(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the left trigger 2 button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the left trigger 2 button's digital signal attached
   *     to the given loop.
   */
  public Trigger L2(EventLoop loop) {
    return button(PS4Controller.Button.kL2.value, loop);
  }

  /**
   * Constructs a Trigger instance around the right trigger 2 button's digital signal.
   *
   * @return a Trigger instance representing the right trigger 2 button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #R2(EventLoop)
   */
  public Trigger R2() {
    return R2(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the right trigger 2 button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the right trigger 2 button's digital signal attached
   *     to the given loop.
   */
  public Trigger R2(EventLoop loop) {
    return button(PS4Controller.Button.kR2.value, loop);
  }

  /**
   * Constructs a Trigger instance around the share button's digital signal.
   *
   * @return a Trigger instance representing the share button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #share(EventLoop)
   */
  public Trigger share() {
    return share(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the share button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the share button's digital signal attached
   *     to the given loop.
   */
  public Trigger share(EventLoop loop) {
    return button(PS4Controller.Button.kShare.value, loop);
  }

  /**
   * Constructs a Trigger instance around the options button's digital signal.
   *
   * @return a Trigger instance representing the options button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #options(EventLoop)
   */
  public Trigger options() {
    return options(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the options button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the options button's digital signal attached
   *     to the given loop.
   */
  public Trigger options(EventLoop loop) {
    return button(PS4Controller.Button.kOptions.value, loop);
  }

  /**
   * Constructs a Trigger instance around the L3 (left stick) button's digital signal.
   *
   * @return a Trigger instance representing the L3 (left stick) button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #L3(EventLoop)
   */
  public Trigger L3() {
    return L3(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the L3 (left stick) button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the L3 (left stick) button's digital signal attached
   *     to the given loop.
   */
  public Trigger L3(EventLoop loop) {
    return button(PS4Controller.Button.kL3.value, loop);
  }

  /**
   * Constructs a Trigger instance around the R3 (right stick) button's digital signal.
   *
   * @return a Trigger instance representing the R3 (right stick) button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #R3(EventLoop)
   */
  public Trigger R3() {
    return R3(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the R3 (right stick) button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the R3 (right stick) button's digital signal attached
   *     to the given loop.
   */
  public Trigger R3(EventLoop loop) {
    return button(PS4Controller.Button.kR3.value, loop);
  }

  /**
   * Constructs a Trigger instance around the PlayStation button's digital signal.
   *
   * @return a Trigger instance representing the PlayStation button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #PS(EventLoop)
   */
  public Trigger PS() {
    return PS(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the PlayStation button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the PlayStation button's digital signal attached
   *     to the given loop.
   */
  public Trigger PS(EventLoop loop) {
    return button(PS4Controller.Button.kPS.value, loop);
  }

  /**
   * Constructs a Trigger instance around the touchpad button's digital signal.
   *
   * @return a Trigger instance representing the touchpad button's digital signal attached
   *     to the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #touchpad(EventLoop)
   */
  public Trigger touchpad() {
    return touchpad(CommandScheduler.getInstance().getDefaultButtonLoop());
  }

  /**
   * Constructs a Trigger instance around the touchpad button's digital signal.
   *
   * @param loop the event loop instance to attach the event to.
   * @return a Trigger instance representing the touchpad button's digital signal attached
   *     to the given loop.
   */
  public Trigger touchpad(EventLoop loop) {
    return button(PS4Controller.Button.kTouchpad.value, loop);
  }

  /**
   * Get the X axis value of left side of the controller. Right is positive.
   *
   * @return The axis value.
   */
  public double getLeftX() {
    return m_hid.getLeftX();
  }

  /**
   * Get the Y axis value of left side of the controller. Back is positive.
   *
   * @return The axis value.
   */
  public double getLeftY() {
    return m_hid.getLeftY();
  }

  /**
   * Get the X axis value of right side of the controller. Right is positive.
   *
   * @return The axis value.
   */
  public double getRightX() {
    return m_hid.getRightX();
  }

  /**
   * Get the Y axis value of right side of the controller. Back is positive.
   *
   * @return The axis value.
   */
  public double getRightY() {
    return m_hid.getRightY();
  }

  /**
   * Get the left trigger 2 axis value of the controller. Note that this axis is bound to the
   * range of [0, 1] as opposed to the usual [-1, 1].
   *
   * @return The axis value.
   */
  public double getL2Axis() {
    return m_hid.getL2Axis();
  }

  /**
   * Get the right trigger 2 axis value of the controller. Note that this axis is bound to the
   * range of [0, 1] as opposed to the usual [-1, 1].
   *
   * @return The axis value.
   */
  public double getR2Axis() {
    return m_hid.getR2Axis();
  }
}
