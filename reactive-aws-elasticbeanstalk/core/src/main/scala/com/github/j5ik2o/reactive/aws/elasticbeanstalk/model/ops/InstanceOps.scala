// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class InstanceBuilderOps(val self: Instance.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

}

final class InstanceOps(val self: Instance) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceOps {

  implicit def toInstanceBuilderOps(v: Instance.Builder): InstanceBuilderOps = new InstanceBuilderOps(v)

  implicit def toInstanceOps(v: Instance): InstanceOps = new InstanceOps(v)

}
