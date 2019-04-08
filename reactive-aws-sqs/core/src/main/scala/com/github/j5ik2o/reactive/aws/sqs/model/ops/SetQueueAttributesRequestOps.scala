// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SetQueueAttributesRequestBuilderOps(val self: SetQueueAttributesRequest.Builder) extends AnyVal {

  final def queueUrlAsScala(value: Option[String]): SetQueueAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  } // String

  final def attributesAsScala(value: Option[Map[QueueAttributeName, String]]): SetQueueAttributesRequest.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    } // Map[String, String]
  }

}

final class SetQueueAttributesRequestOps(val self: SetQueueAttributesRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl) // String

  final def attributesAsScala: Option[Map[QueueAttributeName, String]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetQueueAttributesRequestOps {

  implicit def toSetQueueAttributesRequestBuilderOps(
      v: SetQueueAttributesRequest.Builder
  ): SetQueueAttributesRequestBuilderOps = new SetQueueAttributesRequestBuilderOps(v)

  implicit def toSetQueueAttributesRequestOps(v: SetQueueAttributesRequest): SetQueueAttributesRequestOps =
    new SetQueueAttributesRequestOps(v)

}
