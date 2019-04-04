// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class RemoveTagsFromStreamRequestBuilderOps(val self: RemoveTagsFromStreamRequest.Builder) extends AnyVal {

  final def withStreamNameAsScala(value: Option[String]): RemoveTagsFromStreamRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def withTagKeysAsScala(value: Option[Seq[String]]): RemoveTagsFromStreamRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagKeys(v.asJava)
    } // Seq[String]
  }

}

final class RemoveTagsFromStreamRequestOps(val self: RemoveTagsFromStreamRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def tagKeysAsScala: Option[Seq[String]] = Option(self.tagKeys).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemoveTagsFromStreamRequestOps {

  implicit def toRemoveTagsFromStreamRequestBuilderOps(
      v: RemoveTagsFromStreamRequest.Builder
  ): RemoveTagsFromStreamRequestBuilderOps = new RemoveTagsFromStreamRequestBuilderOps(v)

  implicit def toRemoveTagsFromStreamRequestOps(v: RemoveTagsFromStreamRequest): RemoveTagsFromStreamRequestOps =
    new RemoveTagsFromStreamRequestOps(v)

}
