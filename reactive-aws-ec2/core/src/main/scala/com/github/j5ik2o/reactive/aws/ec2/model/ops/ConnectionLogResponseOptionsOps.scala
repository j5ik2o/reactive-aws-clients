// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ConnectionLogResponseOptionsBuilderOps(val self: ConnectionLogResponseOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): ConnectionLogResponseOptions.Builder = {
    value.fold(self) { v => self.enabled(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudwatchLogGroupAsScala(value: Option[String]): ConnectionLogResponseOptions.Builder = {
    value.fold(self) { v => self.cloudwatchLogGroup(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudwatchLogStreamAsScala(value: Option[String]): ConnectionLogResponseOptions.Builder = {
    value.fold(self) { v => self.cloudwatchLogStream(v) }
  }

}

final class ConnectionLogResponseOptionsOps(val self: ConnectionLogResponseOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudwatchLogGroupAsScala: Option[String] = Option(self.cloudwatchLogGroup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
