// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class TaggingBuilderOps(val self: Tagging.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSetAsScala(value: Option[Seq[Tag]]): Tagging.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSet(v.asJava)
    }
  }

}

final class TaggingOps(val self: Tagging) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSetAsScala: Option[Seq[Tag]] =
    Option(self.tagSet).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTaggingOps {

  implicit def toTaggingBuilderOps(v: Tagging.Builder): TaggingBuilderOps = new TaggingBuilderOps(v)

  implicit def toTaggingOps(v: Tagging): TaggingOps = new TaggingOps(v)

}
