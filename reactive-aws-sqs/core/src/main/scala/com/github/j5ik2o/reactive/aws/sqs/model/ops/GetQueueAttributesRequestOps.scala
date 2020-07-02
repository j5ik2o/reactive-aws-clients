// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class GetQueueAttributesRequestBuilderOps(val self: GetQueueAttributesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): GetQueueAttributesRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeNamesAsScala(value: Option[Seq[QueueAttributeName]]): GetQueueAttributesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributeNames(v.asJava)
    }
  }

}

final class GetQueueAttributesRequestOps(val self: GetQueueAttributesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeNamesAsScala: Option[Seq[QueueAttributeName]] =
    Option(self.attributeNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetQueueAttributesRequestOps {

  implicit def toGetQueueAttributesRequestBuilderOps(
      v: GetQueueAttributesRequest.Builder
  ): GetQueueAttributesRequestBuilderOps = new GetQueueAttributesRequestBuilderOps(v)

  implicit def toGetQueueAttributesRequestOps(v: GetQueueAttributesRequest): GetQueueAttributesRequestOps =
    new GetQueueAttributesRequestOps(v)

}
