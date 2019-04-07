// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListTagsResponseBuilderOps(val self: ListTagsResponse.Builder) extends AnyVal {

  final def withTagListAsScala(value: Option[Seq[Tag]]): ListTagsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagList(v.asJava)
    } // Seq[Tag]
  }

}

final class ListTagsResponseOps(val self: ListTagsResponse) extends AnyVal {

  final def tagListAsScala: Option[Seq[Tag]] = Option(self.tagList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsResponseOps {

  implicit def toListTagsResponseBuilderOps(v: ListTagsResponse.Builder): ListTagsResponseBuilderOps =
    new ListTagsResponseBuilderOps(v)

  implicit def toListTagsResponseOps(v: ListTagsResponse): ListTagsResponseOps = new ListTagsResponseOps(v)

}
