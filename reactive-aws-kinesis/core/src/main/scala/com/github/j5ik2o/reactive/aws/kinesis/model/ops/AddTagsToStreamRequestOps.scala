// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class AddTagsToStreamRequestBuilderOps(val self: AddTagsToStreamRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): AddTagsToStreamRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def tagsAsScala(value: Option[Map[String, String]]): AddTagsToStreamRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Map[String, String]
  }

}

final class AddTagsToStreamRequestOps(val self: AddTagsToStreamRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddTagsToStreamRequestOps {

  implicit def toAddTagsToStreamRequestBuilderOps(v: AddTagsToStreamRequest.Builder): AddTagsToStreamRequestBuilderOps =
    new AddTagsToStreamRequestBuilderOps(v)

  implicit def toAddTagsToStreamRequestOps(v: AddTagsToStreamRequest): AddTagsToStreamRequestOps =
    new AddTagsToStreamRequestOps(v)

}
