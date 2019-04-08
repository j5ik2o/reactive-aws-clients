// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UnsuccessfulItemBuilderOps(val self: UnsuccessfulItem.Builder) extends AnyVal {

  final def errorAsScala(value: Option[UnsuccessfulItemError]): UnsuccessfulItem.Builder = {
    value.fold(self) { v =>
      self.error(v)
    }
  }

  final def resourceIdAsScala(value: Option[String]): UnsuccessfulItem.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

}

final class UnsuccessfulItemOps(val self: UnsuccessfulItem) extends AnyVal {

  final def errorAsScala: Option[UnsuccessfulItemError] = Option(self.error)

  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUnsuccessfulItemOps {

  implicit def toUnsuccessfulItemBuilderOps(v: UnsuccessfulItem.Builder): UnsuccessfulItemBuilderOps =
    new UnsuccessfulItemBuilderOps(v)

  implicit def toUnsuccessfulItemOps(v: UnsuccessfulItem): UnsuccessfulItemOps = new UnsuccessfulItemOps(v)

}
