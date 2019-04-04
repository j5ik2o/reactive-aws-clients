// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListTagsForStreamResponseBuilderOps(val self: ListTagsForStreamResponse.Builder) extends AnyVal {

  final def withTagsAsScala(value: Option[Seq[Tag]]): ListTagsForStreamResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

  final def withHasMoreTagsAsScala(value: Option[Boolean]): ListTagsForStreamResponse.Builder = {
    value.fold(self) { v =>
      self.hasMoreTags(v)
    }
  } // Boolean

}

final class ListTagsForStreamResponseOps(val self: ListTagsForStreamResponse) extends AnyVal {

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

  final def hasMoreTagsAsScala: Option[Boolean] = Option(self.hasMoreTags) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsForStreamResponseOps {

  implicit def toListTagsForStreamResponseBuilderOps(
      v: ListTagsForStreamResponse.Builder
  ): ListTagsForStreamResponseBuilderOps = new ListTagsForStreamResponseBuilderOps(v)

  implicit def toListTagsForStreamResponseOps(v: ListTagsForStreamResponse): ListTagsForStreamResponseOps =
    new ListTagsForStreamResponseOps(v)

}
