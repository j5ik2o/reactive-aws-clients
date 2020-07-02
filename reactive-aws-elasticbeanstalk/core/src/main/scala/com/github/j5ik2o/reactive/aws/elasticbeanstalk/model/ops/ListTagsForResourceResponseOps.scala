// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListTagsForResourceResponseBuilderOps(val self: ListTagsForResourceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceArnAsScala(value: Option[String]): ListTagsForResourceResponse.Builder = {
    value.fold(self) { v => self.resourceArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTagsAsScala(value: Option[Seq[Tag]]): ListTagsForResourceResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceTags(v.asJava)
    }
  }

}

final class ListTagsForResourceResponseOps(val self: ListTagsForResourceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceArnAsScala: Option[String] = Option(self.resourceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTagsAsScala: Option[Seq[Tag]] =
    Option(self.resourceTags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsForResourceResponseOps {

  implicit def toListTagsForResourceResponseBuilderOps(
      v: ListTagsForResourceResponse.Builder
  ): ListTagsForResourceResponseBuilderOps = new ListTagsForResourceResponseBuilderOps(v)

  implicit def toListTagsForResourceResponseOps(v: ListTagsForResourceResponse): ListTagsForResourceResponseOps =
    new ListTagsForResourceResponseOps(v)

}
