// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UntagResourceResponseBuilderOps(val self: UntagResourceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): UntagResourceResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class UntagResourceResponseOps(val self: UntagResourceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUntagResourceResponseOps {

  implicit def toUntagResourceResponseBuilderOps(v: UntagResourceResponse.Builder): UntagResourceResponseBuilderOps =
    new UntagResourceResponseBuilderOps(v)

  implicit def toUntagResourceResponseOps(v: UntagResourceResponse): UntagResourceResponseOps =
    new UntagResourceResponseOps(v)

}
