// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MessageDataBuilderOps(val self: MessageData.Builder) extends AnyVal {

  final def codeAsScala(value: Option[String]): MessageData.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  } // String

  final def valueAsScala(value: Option[String]): MessageData.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // String

}

final class MessageDataOps(val self: MessageData) extends AnyVal {

  final def codeAsScala: Option[String] = Option(self.code) // String

  final def valueAsScala: Option[String] = Option(self.value) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMessageDataOps {

  implicit def toMessageDataBuilderOps(v: MessageData.Builder): MessageDataBuilderOps = new MessageDataBuilderOps(v)

  implicit def toMessageDataOps(v: MessageData): MessageDataOps = new MessageDataOps(v)

}
