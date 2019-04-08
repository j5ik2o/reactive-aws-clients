// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DestinationBuilderOps(val self: Destination.Builder) extends AnyVal {

  final def destinationNameAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.destinationName(v)
    }
  } // String

  final def targetArnAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.targetArn(v)
    }
  } // String

  final def roleArnAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  } // String

  final def accessPolicyAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.accessPolicy(v)
    }
  } // String

  final def arnAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  } // String

  final def creationTimeAsScala(value: Option[Long]): Destination.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  } // Long

}

final class DestinationOps(val self: Destination) extends AnyVal {

  final def destinationNameAsScala: Option[String] = Option(self.destinationName) // String

  final def targetArnAsScala: Option[String] = Option(self.targetArn) // String

  final def roleArnAsScala: Option[String] = Option(self.roleArn) // String

  final def accessPolicyAsScala: Option[String] = Option(self.accessPolicy) // String

  final def arnAsScala: Option[String] = Option(self.arn) // String

  final def creationTimeAsScala: Option[Long] = Option(self.creationTime) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDestinationOps {

  implicit def toDestinationBuilderOps(v: Destination.Builder): DestinationBuilderOps = new DestinationBuilderOps(v)

  implicit def toDestinationOps(v: Destination): DestinationOps = new DestinationOps(v)

}
