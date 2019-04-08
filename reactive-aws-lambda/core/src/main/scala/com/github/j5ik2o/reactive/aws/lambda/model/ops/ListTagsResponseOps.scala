// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListTagsResponseBuilderOps(val self: ListTagsResponse.Builder) extends AnyVal {

  final def tagsAsScala(value: Option[Map[String, String]]): ListTagsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Map[String, String]
  }

}

final class ListTagsResponseOps(val self: ListTagsResponse) extends AnyVal {

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsResponseOps {

  implicit def toListTagsResponseBuilderOps(v: ListTagsResponse.Builder): ListTagsResponseBuilderOps =
    new ListTagsResponseBuilderOps(v)

  implicit def toListTagsResponseOps(v: ListTagsResponse): ListTagsResponseOps = new ListTagsResponseOps(v)

}
