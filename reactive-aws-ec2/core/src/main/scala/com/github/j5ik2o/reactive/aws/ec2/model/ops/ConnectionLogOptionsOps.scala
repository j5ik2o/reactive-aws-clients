// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ConnectionLogOptionsBuilderOps(val self: ConnectionLogOptions.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def enabledAsScala(value: Option[Boolean]): ConnectionLogOptions.Builder = {
            value.fold(self){ v => self.enabled(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cloudwatchLogGroupAsScala(value: Option[String]): ConnectionLogOptions.Builder = {
            value.fold(self){ v => self.cloudwatchLogGroup(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cloudwatchLogStreamAsScala(value: Option[String]): ConnectionLogOptions.Builder = {
            value.fold(self){ v => self.cloudwatchLogStream(v) }
            } 


}

final class ConnectionLogOptionsOps(val self: ConnectionLogOptions) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def enabledAsScala: Option[Boolean] = Option(self.enabled) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cloudwatchLogGroupAsScala: Option[String] = Option(self.cloudwatchLogGroup) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cloudwatchLogStreamAsScala: Option[String] = Option(self.cloudwatchLogStream) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConnectionLogOptionsOps {

implicit def toConnectionLogOptionsBuilderOps(v: ConnectionLogOptions.Builder): ConnectionLogOptionsBuilderOps = new ConnectionLogOptionsBuilderOps(v)

implicit def toConnectionLogOptionsOps(v: ConnectionLogOptions): ConnectionLogOptionsOps = new ConnectionLogOptionsOps(v)

}

