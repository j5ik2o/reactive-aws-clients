// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DestinationBuilderOps(val self: Destination.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationNameAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.destinationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetArnAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.targetArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPolicyAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.accessPolicy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[Long]): Destination.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

}

final class DestinationOps(val self: Destination) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationNameAsScala: Option[String] = Option(self.destinationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetArnAsScala: Option[String] = Option(self.targetArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPolicyAsScala: Option[String] = Option(self.accessPolicy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[Long] = Option(self.creationTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDestinationOps {

  implicit def toDestinationBuilderOps(v: Destination.Builder): DestinationBuilderOps = new DestinationBuilderOps(v)

  implicit def toDestinationOps(v: Destination): DestinationOps = new DestinationOps(v)

}
