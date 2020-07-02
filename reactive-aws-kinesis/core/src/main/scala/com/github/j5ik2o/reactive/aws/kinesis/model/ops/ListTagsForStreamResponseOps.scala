// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListTagsForStreamResponseBuilderOps(val self: ListTagsForStreamResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): ListTagsForStreamResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class ListTagsForStreamResponseOps(val self: ListTagsForStreamResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsForStreamResponseOps {

  implicit def toListTagsForStreamResponseBuilderOps(
      v: ListTagsForStreamResponse.Builder
  ): ListTagsForStreamResponseBuilderOps = new ListTagsForStreamResponseBuilderOps(v)

  implicit def toListTagsForStreamResponseOps(v: ListTagsForStreamResponse): ListTagsForStreamResponseOps =
    new ListTagsForStreamResponseOps(v)

}
