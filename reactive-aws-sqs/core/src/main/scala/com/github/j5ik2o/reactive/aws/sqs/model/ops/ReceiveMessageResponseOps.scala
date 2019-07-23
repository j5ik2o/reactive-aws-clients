// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ReceiveMessageResponseBuilderOps(val self: ReceiveMessageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messagesAsScala(value: Option[Seq[Message]]): ReceiveMessageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.messages(v.asJava)
    }
  }

}

final class ReceiveMessageResponseOps(val self: ReceiveMessageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messagesAsScala: Option[Seq[Message]] = Option(self.messages).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReceiveMessageResponseOps {

  implicit def toReceiveMessageResponseBuilderOps(v: ReceiveMessageResponse.Builder): ReceiveMessageResponseBuilderOps =
    new ReceiveMessageResponseBuilderOps(v)

  implicit def toReceiveMessageResponseOps(v: ReceiveMessageResponse): ReceiveMessageResponseOps =
    new ReceiveMessageResponseOps(v)

}
