// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotInstanceStatusBuilderOps(val self: SpotInstanceStatus.Builder) extends AnyVal {

  final def codeAsScala(value: Option[String]): SpotInstanceStatus.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def messageAsScala(value: Option[String]): SpotInstanceStatus.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

  final def updateTimeAsScala(value: Option[java.time.Instant]): SpotInstanceStatus.Builder = {
    value.fold(self) { v =>
      self.updateTime(v)
    }
  }

}

final class SpotInstanceStatusOps(val self: SpotInstanceStatus) extends AnyVal {

  final def codeAsScala: Option[String] = Option(self.code)

  final def messageAsScala: Option[String] = Option(self.message)

  final def updateTimeAsScala: Option[java.time.Instant] = Option(self.updateTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotInstanceStatusOps {

  implicit def toSpotInstanceStatusBuilderOps(v: SpotInstanceStatus.Builder): SpotInstanceStatusBuilderOps =
    new SpotInstanceStatusBuilderOps(v)

  implicit def toSpotInstanceStatusOps(v: SpotInstanceStatus): SpotInstanceStatusOps = new SpotInstanceStatusOps(v)

}
