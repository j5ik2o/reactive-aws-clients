// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListTagsOfResourceResponseBuilderOps(val self: ListTagsOfResourceResponse.Builder) extends AnyVal {

  final def tagsAsScala(value: Option[Seq[Tag]]): ListTagsOfResourceResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListTagsOfResourceResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTagsOfResourceResponseOps(val self: ListTagsOfResourceResponse) extends AnyVal {

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsOfResourceResponseOps {

  implicit def toListTagsOfResourceResponseBuilderOps(
      v: ListTagsOfResourceResponse.Builder
  ): ListTagsOfResourceResponseBuilderOps = new ListTagsOfResourceResponseBuilderOps(v)

  implicit def toListTagsOfResourceResponseOps(v: ListTagsOfResourceResponse): ListTagsOfResourceResponseOps =
    new ListTagsOfResourceResponseOps(v)

}
