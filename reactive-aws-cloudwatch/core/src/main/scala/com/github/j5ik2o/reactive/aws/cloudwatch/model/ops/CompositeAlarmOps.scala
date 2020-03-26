// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class CompositeAlarmBuilderOps(val self: CompositeAlarm.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionsEnabledAsScala(value: Option[Boolean]): CompositeAlarm.Builder = {
    value.fold(self) { v =>
      self.actionsEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmActionsAsScala(value: Option[Seq[String]]): CompositeAlarm.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.alarmActions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmArnAsScala(value: Option[String]): CompositeAlarm.Builder = {
    value.fold(self) { v =>
      self.alarmArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmConfigurationUpdatedTimestampAsScala(value: Option[java.time.Instant]): CompositeAlarm.Builder = {
    value.fold(self) { v =>
      self.alarmConfigurationUpdatedTimestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmDescriptionAsScala(value: Option[String]): CompositeAlarm.Builder = {
    value.fold(self) { v =>
      self.alarmDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNameAsScala(value: Option[String]): CompositeAlarm.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmRuleAsScala(value: Option[String]): CompositeAlarm.Builder = {
    value.fold(self) { v =>
      self.alarmRule(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def insufficientDataActionsAsScala(value: Option[Seq[String]]): CompositeAlarm.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.insufficientDataActions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def okActionsAsScala(value: Option[Seq[String]]): CompositeAlarm.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.okActions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateReasonAsScala(value: Option[String]): CompositeAlarm.Builder = {
    value.fold(self) { v =>
      self.stateReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateReasonDataAsScala(value: Option[String]): CompositeAlarm.Builder = {
    value.fold(self) { v =>
      self.stateReasonData(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateUpdatedTimestampAsScala(value: Option[java.time.Instant]): CompositeAlarm.Builder = {
    value.fold(self) { v =>
      self.stateUpdatedTimestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateValueAsScala(value: Option[StateValue]): CompositeAlarm.Builder = {
    value.fold(self) { v =>
      self.stateValue(v)
    }
  }

}

final class CompositeAlarmOps(val self: CompositeAlarm) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionsEnabledAsScala: Option[Boolean] = Option(self.actionsEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmActionsAsScala: Option[Seq[String]] = Option(self.alarmActions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmArnAsScala: Option[String] = Option(self.alarmArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmConfigurationUpdatedTimestampAsScala: Option[java.time.Instant] =
    Option(self.alarmConfigurationUpdatedTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmDescriptionAsScala: Option[String] = Option(self.alarmDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNameAsScala: Option[String] = Option(self.alarmName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmRuleAsScala: Option[String] = Option(self.alarmRule)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def insufficientDataActionsAsScala: Option[Seq[String]] = Option(self.insufficientDataActions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def okActionsAsScala: Option[Seq[String]] = Option(self.okActions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateReasonAsScala: Option[String] = Option(self.stateReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateReasonDataAsScala: Option[String] = Option(self.stateReasonData)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateUpdatedTimestampAsScala: Option[java.time.Instant] = Option(self.stateUpdatedTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateValueAsScala: Option[StateValue] = Option(self.stateValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompositeAlarmOps {

  implicit def toCompositeAlarmBuilderOps(v: CompositeAlarm.Builder): CompositeAlarmBuilderOps =
    new CompositeAlarmBuilderOps(v)

  implicit def toCompositeAlarmOps(v: CompositeAlarm): CompositeAlarmOps = new CompositeAlarmOps(v)

}
