// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SetQueueAttributesRequestBuilderOps(val self: SetQueueAttributesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): SetQueueAttributesRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala(value: Option[Map[QueueAttributeName, String]]): SetQueueAttributesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava)
    }
  }

}

final class SetQueueAttributesRequestOps(val self: SetQueueAttributesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala: Option[Map[QueueAttributeName, String]] =
    Option(self.attributes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetQueueAttributesRequestOps {

  implicit def toSetQueueAttributesRequestBuilderOps(
      v: SetQueueAttributesRequest.Builder
  ): SetQueueAttributesRequestBuilderOps = new SetQueueAttributesRequestBuilderOps(v)

  implicit def toSetQueueAttributesRequestOps(v: SetQueueAttributesRequest): SetQueueAttributesRequestOps =
    new SetQueueAttributesRequestOps(v)

}
