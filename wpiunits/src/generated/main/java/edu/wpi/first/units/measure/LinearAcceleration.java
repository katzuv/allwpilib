// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// THIS FILE WAS AUTO-GENERATED BY ./wpiunits/generate_units.py. DO NOT MODIFY

package edu.wpi.first.units.measure;

import static edu.wpi.first.units.Units.*;
import edu.wpi.first.units.*;

@SuppressWarnings({"unchecked", "cast", "checkstyle", "PMD"})
public interface LinearAcceleration extends Measure<LinearAccelerationUnit> {
  static  LinearAcceleration ofRelativeUnits(double magnitude, LinearAccelerationUnit unit) {
    return new ImmutableLinearAcceleration(magnitude, unit.toBaseUnits(magnitude), unit);
  }

  static  LinearAcceleration ofBaseUnits(double baseUnitMagnitude, LinearAccelerationUnit unit) {
    return new ImmutableLinearAcceleration(unit.fromBaseUnits(baseUnitMagnitude), baseUnitMagnitude, unit);
  }

  @Override
  LinearAcceleration copy();

  @Override
  default MutLinearAcceleration mutableCopy() {
    return new MutLinearAcceleration(magnitude(), baseUnitMagnitude(), unit());
  }

  @Override
  LinearAccelerationUnit unit();

  @Override
  default LinearAccelerationUnit baseUnit() { return (LinearAccelerationUnit) unit().getBaseUnit(); }

  @Override
  default double in(LinearAccelerationUnit unit) {
    return unit.fromBaseUnits(baseUnitMagnitude());
  }

  @Override
  default LinearAcceleration unaryMinus() {
    return (LinearAcceleration) unit().ofBaseUnits(0 - baseUnitMagnitude());
  }

  @Override
  @Deprecated(since = "2025", forRemoval = true)
  @SuppressWarnings({"deprecation", "removal"})
  default LinearAcceleration negate() {
    return (LinearAcceleration) unaryMinus();
  }

  @Override
  default LinearAcceleration plus(Measure<? extends LinearAccelerationUnit> other) {
    return (LinearAcceleration) unit().ofBaseUnits(baseUnitMagnitude() + other.baseUnitMagnitude());
  }

  @Override
  default LinearAcceleration minus(Measure<? extends LinearAccelerationUnit> other) {
    return (LinearAcceleration) unit().ofBaseUnits(baseUnitMagnitude() - other.baseUnitMagnitude());
  }

  @Override
  default LinearAcceleration times(double multiplier) {
    return (LinearAcceleration) unit().ofBaseUnits(baseUnitMagnitude() * multiplier);
  }

  @Override
  default LinearAcceleration divide(double divisor) {
    return (LinearAcceleration) unit().ofBaseUnits(baseUnitMagnitude() / divisor);
  }

  @Override
  default Velocity<LinearAccelerationUnit> per(TimeUnit period) {
    return divide(period.of(1));
  }


  @Override
  default Mult<LinearAccelerationUnit, AccelerationUnit<?>> times(Acceleration<?> multiplier) {
    return (Mult<LinearAccelerationUnit, AccelerationUnit<?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, AccelerationUnit<?>> divide(Acceleration<?> divisor) {
    return (Per<LinearAccelerationUnit, AccelerationUnit<?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, AngleUnit> times(Angle multiplier) {
    return (Mult<LinearAccelerationUnit, AngleUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, AngleUnit> divide(Angle divisor) {
    return (Per<LinearAccelerationUnit, AngleUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, AngularAccelerationUnit> times(AngularAcceleration multiplier) {
    return (Mult<LinearAccelerationUnit, AngularAccelerationUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, AngularAccelerationUnit> divide(AngularAcceleration divisor) {
    return (Per<LinearAccelerationUnit, AngularAccelerationUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, AngularMomentumUnit> times(AngularMomentum multiplier) {
    return (Mult<LinearAccelerationUnit, AngularMomentumUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, AngularMomentumUnit> divide(AngularMomentum divisor) {
    return (Per<LinearAccelerationUnit, AngularMomentumUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, AngularVelocityUnit> times(AngularVelocity multiplier) {
    return (Mult<LinearAccelerationUnit, AngularVelocityUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, AngularVelocityUnit> divide(AngularVelocity divisor) {
    return (Per<LinearAccelerationUnit, AngularVelocityUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, CurrentUnit> times(Current multiplier) {
    return (Mult<LinearAccelerationUnit, CurrentUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, CurrentUnit> divide(Current divisor) {
    return (Per<LinearAccelerationUnit, CurrentUnit>) Measure.super.divide(divisor);
  }

  @Override
  default LinearAcceleration divide(Dimensionless divisor) {
    return (LinearAcceleration) MetersPerSecondPerSecond.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }

  @Override
  default LinearAcceleration times(Dimensionless multiplier) {
    return (LinearAcceleration) MetersPerSecondPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }


  @Override
  default Mult<LinearAccelerationUnit, DistanceUnit> times(Distance multiplier) {
    return (Mult<LinearAccelerationUnit, DistanceUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, DistanceUnit> divide(Distance divisor) {
    return (Per<LinearAccelerationUnit, DistanceUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, EnergyUnit> times(Energy multiplier) {
    return (Mult<LinearAccelerationUnit, EnergyUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, EnergyUnit> divide(Energy divisor) {
    return (Per<LinearAccelerationUnit, EnergyUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, ForceUnit> times(Force multiplier) {
    return (Mult<LinearAccelerationUnit, ForceUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, ForceUnit> divide(Force divisor) {
    return (Per<LinearAccelerationUnit, ForceUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, FrequencyUnit> times(Frequency multiplier) {
    return (Mult<LinearAccelerationUnit, FrequencyUnit>) Measure.super.times(multiplier);
  }

  @Override
  default LinearVelocity divide(Frequency divisor) {
    return MetersPerSecond.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }


  @Override
  default Mult<LinearAccelerationUnit, LinearAccelerationUnit> times(LinearAcceleration multiplier) {
    return (Mult<LinearAccelerationUnit, LinearAccelerationUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Dimensionless divide(LinearAcceleration divisor) {
    return Value.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }


  @Override
  default Mult<LinearAccelerationUnit, LinearMomentumUnit> times(LinearMomentum multiplier) {
    return (Mult<LinearAccelerationUnit, LinearMomentumUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, LinearMomentumUnit> divide(LinearMomentum divisor) {
    return (Per<LinearAccelerationUnit, LinearMomentumUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, LinearVelocityUnit> times(LinearVelocity multiplier) {
    return (Mult<LinearAccelerationUnit, LinearVelocityUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, LinearVelocityUnit> divide(LinearVelocity divisor) {
    return (Per<LinearAccelerationUnit, LinearVelocityUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, MassUnit> times(Mass multiplier) {
    return (Mult<LinearAccelerationUnit, MassUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, MassUnit> divide(Mass divisor) {
    return (Per<LinearAccelerationUnit, MassUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, MomentOfInertiaUnit> times(MomentOfInertia multiplier) {
    return (Mult<LinearAccelerationUnit, MomentOfInertiaUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, MomentOfInertiaUnit> divide(MomentOfInertia divisor) {
    return (Per<LinearAccelerationUnit, MomentOfInertiaUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, MultUnit<?, ?>> times(Mult<?, ?> multiplier) {
    return (Mult<LinearAccelerationUnit, MultUnit<?, ?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, MultUnit<?, ?>> divide(Mult<?, ?> divisor) {
    return (Per<LinearAccelerationUnit, MultUnit<?, ?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, PerUnit<?, ?>> times(Per<?, ?> multiplier) {
    return (Mult<LinearAccelerationUnit, PerUnit<?, ?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, PerUnit<?, ?>> divide(Per<?, ?> divisor) {
    return (Per<LinearAccelerationUnit, PerUnit<?, ?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, PowerUnit> times(Power multiplier) {
    return (Mult<LinearAccelerationUnit, PowerUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, PowerUnit> divide(Power divisor) {
    return (Per<LinearAccelerationUnit, PowerUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, ResistanceUnit> times(Resistance multiplier) {
    return (Mult<LinearAccelerationUnit, ResistanceUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, ResistanceUnit> divide(Resistance divisor) {
    return (Per<LinearAccelerationUnit, ResistanceUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, TemperatureUnit> times(Temperature multiplier) {
    return (Mult<LinearAccelerationUnit, TemperatureUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, TemperatureUnit> divide(Temperature divisor) {
    return (Per<LinearAccelerationUnit, TemperatureUnit>) Measure.super.divide(divisor);
  }


  @Override
  default LinearVelocity times(Time multiplier) {
    return MetersPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Velocity<LinearAccelerationUnit> divide(Time divisor) {
    return VelocityUnit.combine(unit(), divisor.unit()).ofBaseUnits(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }


  @Override
  default Mult<LinearAccelerationUnit, TorqueUnit> times(Torque multiplier) {
    return (Mult<LinearAccelerationUnit, TorqueUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, TorqueUnit> divide(Torque divisor) {
    return (Per<LinearAccelerationUnit, TorqueUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, VelocityUnit<?>> times(Velocity<?> multiplier) {
    return (Mult<LinearAccelerationUnit, VelocityUnit<?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, VelocityUnit<?>> divide(Velocity<?> divisor) {
    return (Per<LinearAccelerationUnit, VelocityUnit<?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<LinearAccelerationUnit, VoltageUnit> times(Voltage multiplier) {
    return (Mult<LinearAccelerationUnit, VoltageUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<LinearAccelerationUnit, VoltageUnit> divide(Voltage divisor) {
    return (Per<LinearAccelerationUnit, VoltageUnit>) Measure.super.divide(divisor);
  }

}
