// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutCompositeAlarmRequestBuilderOps(val self: PutCompositeAlarmRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionsEnabledAsScala(value: Option[Boolean]): PutCompositeAlarmRequest.Builder = {
    value.fold(self) { v => self.actionsEnabled(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmActionsAsScala(value: Option[Seq[String]]): PutCompositeAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.alarmActions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmDescriptionAsScala(value: Option[String]): PutCompositeAlarmRequest.Builder = {
    value.fold(self) { v => self.alarmDescription(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNameAsScala(value: Option[String]): PutCompositeAlarmRequest.Builder = {
    value.fold(self) { v => self.alarmName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmRuleAsScala(value: Option[String]): PutCompositeAlarmRequest.Builder = {
    value.fold(self) { v => self.alarmRule(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def insufficientDataActionsAsScala(value: Option[Seq[String]]): PutCompositeAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.insufficientDataActions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def okActionsAsScala(value: Option[Seq[String]]): PutCompositeAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.okActions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): PutCompositeAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class PutCompositeAlarmRequestOps(val self: PutCompositeAlarmRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionsEnabledAsScala: Option[Boolean] = Option(self.actionsEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmActionsAsScala: Option[Seq[String]] =
    Option(self.alarmActions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmDescriptionAsScala: Option[String] = Option(self.alarmDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNameAsScala: Option[String] = Option(self.alarmName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmRuleAsScala: Option[String] = Option(self.alarmRule)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def insufficientDataActionsAsScala: Option[Seq[String]] =
    Option(self.insufficientDataActions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def okActionsAsScala: Option[Seq[String]] =
    Option(self.okActions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutCompositeAlarmRequestOps {

  implicit def toPutCompositeAlarmRequestBuilderOps(
      v: PutCompositeAlarmRequest.Builder
  ): PutCompositeAlarmRequestBuilderOps = new PutCompositeAlarmRequestBuilderOps(v)

  implicit def toPutCompositeAlarmRequestOps(v: PutCompositeAlarmRequest): PutCompositeAlarmRequestOps =
    new PutCompositeAlarmRequestOps(v)

}
