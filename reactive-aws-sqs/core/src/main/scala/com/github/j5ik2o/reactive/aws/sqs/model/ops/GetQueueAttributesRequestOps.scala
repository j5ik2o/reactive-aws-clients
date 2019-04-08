// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class GetQueueAttributesRequestBuilderOps(val self: GetQueueAttributesRequest.Builder) extends AnyVal {

  final def queueUrlAsScala(value: Option[String]): GetQueueAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  }

  final def attributeNamesAsScala(value: Option[Seq[QueueAttributeName]]): GetQueueAttributesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeNames(v.asJava)
    }
  }

}

final class GetQueueAttributesRequestOps(val self: GetQueueAttributesRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  final def attributeNamesAsScala: Option[Seq[QueueAttributeName]] = Option(self.attributeNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
