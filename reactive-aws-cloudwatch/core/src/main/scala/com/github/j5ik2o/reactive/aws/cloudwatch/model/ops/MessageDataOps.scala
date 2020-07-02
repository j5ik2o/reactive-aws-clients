// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MessageDataBuilderOps(val self: MessageData.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[String]): MessageData.Builder = {
    value.fold(self) { v => self.code(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): MessageData.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class MessageDataOps(val self: MessageData) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[String] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMessageDataOps {

  implicit def toMessageDataBuilderOps(v: MessageData.Builder): MessageDataBuilderOps = new MessageDataBuilderOps(v)

  implicit def toMessageDataOps(v: MessageData): MessageDataOps = new MessageDataOps(v)

}
