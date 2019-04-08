// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ReceiveMessageResponseBuilderOps(val self: ReceiveMessageResponse.Builder) extends AnyVal {

  final def messagesAsScala(value: Option[Seq[Message]]): ReceiveMessageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.messages(v.asJava)
    } // Seq[Message]
  }

}

final class ReceiveMessageResponseOps(val self: ReceiveMessageResponse) extends AnyVal {

  final def messagesAsScala: Option[Seq[Message]] = Option(self.messages).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Message]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReceiveMessageResponseOps {

  implicit def toReceiveMessageResponseBuilderOps(v: ReceiveMessageResponse.Builder): ReceiveMessageResponseBuilderOps =
    new ReceiveMessageResponseBuilderOps(v)

  implicit def toReceiveMessageResponseOps(v: ReceiveMessageResponse): ReceiveMessageResponseOps =
    new ReceiveMessageResponseOps(v)

}
