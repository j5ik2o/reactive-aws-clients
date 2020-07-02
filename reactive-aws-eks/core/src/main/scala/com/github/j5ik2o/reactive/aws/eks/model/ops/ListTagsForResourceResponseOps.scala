// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ListTagsForResourceResponseBuilderOps(val self: ListTagsForResourceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Map[String, String]]): ListTagsForResourceResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class ListTagsForResourceResponseOps(val self: ListTagsForResourceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Map[String, String]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsForResourceResponseOps {

  implicit def toListTagsForResourceResponseBuilderOps(
      v: ListTagsForResourceResponse.Builder
  ): ListTagsForResourceResponseBuilderOps = new ListTagsForResourceResponseBuilderOps(v)

  implicit def toListTagsForResourceResponseOps(v: ListTagsForResourceResponse): ListTagsForResourceResponseOps =
    new ListTagsForResourceResponseOps(v)

}
