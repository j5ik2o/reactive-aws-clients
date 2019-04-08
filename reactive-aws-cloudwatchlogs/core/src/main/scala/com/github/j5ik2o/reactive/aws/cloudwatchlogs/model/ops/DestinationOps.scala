// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DestinationBuilderOps(val self: Destination.Builder) extends AnyVal {

  final def destinationNameAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.destinationName(v)
    }
  }

  final def targetArnAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.targetArn(v)
    }
  }

  final def roleArnAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  final def accessPolicyAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.accessPolicy(v)
    }
  }

  final def arnAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  final def creationTimeAsScala(value: Option[Long]): Destination.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

}

final class DestinationOps(val self: Destination) extends AnyVal {

  final def destinationNameAsScala: Option[String] = Option(self.destinationName)

  final def targetArnAsScala: Option[String] = Option(self.targetArn)

  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  final def accessPolicyAsScala: Option[String] = Option(self.accessPolicy)

  final def arnAsScala: Option[String] = Option(self.arn)

  final def creationTimeAsScala: Option[Long] = Option(self.creationTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDestinationOps {

  implicit def toDestinationBuilderOps(v: Destination.Builder): DestinationBuilderOps = new DestinationBuilderOps(v)

  implicit def toDestinationOps(v: Destination): DestinationOps = new DestinationOps(v)

}
