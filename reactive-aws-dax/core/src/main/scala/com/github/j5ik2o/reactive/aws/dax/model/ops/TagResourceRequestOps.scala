// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class TagResourceRequestBuilderOps(val self: TagResourceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceNameAsScala(value: Option[String]): TagResourceRequest.Builder = {
    value.fold(self) { v => self.resourceName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): TagResourceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TagResourceRequestOps(val self: TagResourceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceNameAsScala: Option[String] = Option(self.resourceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagResourceRequestOps {

  implicit def toTagResourceRequestBuilderOps(v: TagResourceRequest.Builder): TagResourceRequestBuilderOps =
    new TagResourceRequestBuilderOps(v)

  implicit def toTagResourceRequestOps(v: TagResourceRequest): TagResourceRequestOps = new TagResourceRequestOps(v)

}
