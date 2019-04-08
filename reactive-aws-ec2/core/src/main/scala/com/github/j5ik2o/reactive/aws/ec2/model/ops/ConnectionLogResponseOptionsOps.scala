// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ConnectionLogResponseOptionsBuilderOps(val self: ConnectionLogResponseOptions.Builder) extends AnyVal {

  final def enabledAsScala(value: Option[Boolean]): ConnectionLogResponseOptions.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  final def cloudwatchLogGroupAsScala(value: Option[String]): ConnectionLogResponseOptions.Builder = {
    value.fold(self) { v =>
      self.cloudwatchLogGroup(v)
    }
  }

  final def cloudwatchLogStreamAsScala(value: Option[String]): ConnectionLogResponseOptions.Builder = {
    value.fold(self) { v =>
      self.cloudwatchLogStream(v)
    }
  }

}

final class ConnectionLogResponseOptionsOps(val self: ConnectionLogResponseOptions) extends AnyVal {

  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  final def cloudwatchLogGroupAsScala: Option[String] = Option(self.cloudwatchLogGroup)

  final def cloudwatchLogStreamAsScala: Option[String] = Option(self.cloudwatchLogStream)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConnectionLogResponseOptionsOps {

  implicit def toConnectionLogResponseOptionsBuilderOps(
      v: ConnectionLogResponseOptions.Builder
  ): ConnectionLogResponseOptionsBuilderOps = new ConnectionLogResponseOptionsBuilderOps(v)

  implicit def toConnectionLogResponseOptionsOps(v: ConnectionLogResponseOptions): ConnectionLogResponseOptionsOps =
    new ConnectionLogResponseOptionsOps(v)

}
