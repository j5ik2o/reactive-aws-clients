// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class TriggerBuilderOps(val self: Trigger.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): Trigger.Builder = {
    value.fold(self) { v => self.name(v) }
  }

}

final class TriggerOps(val self: Trigger) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTriggerOps {

  implicit def toTriggerBuilderOps(v: Trigger.Builder): TriggerBuilderOps = new TriggerBuilderOps(v)

  implicit def toTriggerOps(v: Trigger): TriggerOps = new TriggerOps(v)

}
