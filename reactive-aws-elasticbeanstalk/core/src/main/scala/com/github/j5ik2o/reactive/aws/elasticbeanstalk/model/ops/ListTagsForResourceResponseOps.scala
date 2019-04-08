// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListTagsForResourceResponseBuilderOps(val self: ListTagsForResourceResponse.Builder) extends AnyVal {

  final def resourceArnAsScala(value: Option[String]): ListTagsForResourceResponse.Builder = {
    value.fold(self) { v =>
      self.resourceArn(v)
    }
  } // String

  final def resourceTagsAsScala(value: Option[Seq[Tag]]): ListTagsForResourceResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceTags(v.asJava)
    } // Seq[Tag]
  }

}

final class ListTagsForResourceResponseOps(val self: ListTagsForResourceResponse) extends AnyVal {

  final def resourceArnAsScala: Option[String] = Option(self.resourceArn) // String

  final def resourceTagsAsScala: Option[Seq[Tag]] = Option(self.resourceTags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsForResourceResponseOps {

  implicit def toListTagsForResourceResponseBuilderOps(
      v: ListTagsForResourceResponse.Builder
  ): ListTagsForResourceResponseBuilderOps = new ListTagsForResourceResponseBuilderOps(v)

  implicit def toListTagsForResourceResponseOps(v: ListTagsForResourceResponse): ListTagsForResourceResponseOps =
    new ListTagsForResourceResponseOps(v)

}
