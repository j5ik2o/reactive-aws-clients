// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class QueueBuilderOps(val self: Queue.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): Queue.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def urlAsScala(value: Option[String]): Queue.Builder = {
    value.fold(self) { v => self.url(v) }
  }

}

final class QueueOps(val self: Queue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def urlAsScala: Option[String] = Option(self.url)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueueOps {

  implicit def toQueueBuilderOps(v: Queue.Builder): QueueBuilderOps = new QueueBuilderOps(v)

  implicit def toQueueOps(v: Queue): QueueOps = new QueueOps(v)

}
