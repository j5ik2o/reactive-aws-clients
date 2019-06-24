// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListTagsForResourceResponseBuilderOps(val self: ListTagsForResourceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): ListTagsForResourceResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class ListTagsForResourceResponseOps(val self: ListTagsForResourceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsForResourceResponseOps {

  implicit def toListTagsForResourceResponseBuilderOps(
      v: ListTagsForResourceResponse.Builder
  ): ListTagsForResourceResponseBuilderOps = new ListTagsForResourceResponseBuilderOps(v)

  implicit def toListTagsForResourceResponseOps(v: ListTagsForResourceResponse): ListTagsForResourceResponseOps =
    new ListTagsForResourceResponseOps(v)

}
