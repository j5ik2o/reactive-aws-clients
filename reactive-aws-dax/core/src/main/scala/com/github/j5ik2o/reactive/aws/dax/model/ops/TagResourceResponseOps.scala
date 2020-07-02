// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class TagResourceResponseBuilderOps(val self: TagResourceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): TagResourceResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TagResourceResponseOps(val self: TagResourceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagResourceResponseOps {

  implicit def toTagResourceResponseBuilderOps(v: TagResourceResponse.Builder): TagResourceResponseBuilderOps =
    new TagResourceResponseBuilderOps(v)

  implicit def toTagResourceResponseOps(v: TagResourceResponse): TagResourceResponseOps = new TagResourceResponseOps(v)

}
