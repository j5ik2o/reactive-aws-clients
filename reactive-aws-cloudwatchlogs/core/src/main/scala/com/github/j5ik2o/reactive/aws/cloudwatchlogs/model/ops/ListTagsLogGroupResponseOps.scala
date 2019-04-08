// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ListTagsLogGroupResponseBuilderOps(val self: ListTagsLogGroupResponse.Builder) extends AnyVal {

  final def tagsAsScala(value: Option[Map[String, String]]): ListTagsLogGroupResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class ListTagsLogGroupResponseOps(val self: ListTagsLogGroupResponse) extends AnyVal {

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsLogGroupResponseOps {

  implicit def toListTagsLogGroupResponseBuilderOps(
      v: ListTagsLogGroupResponse.Builder
  ): ListTagsLogGroupResponseBuilderOps = new ListTagsLogGroupResponseBuilderOps(v)

  implicit def toListTagsLogGroupResponseOps(v: ListTagsLogGroupResponse): ListTagsLogGroupResponseOps =
    new ListTagsLogGroupResponseOps(v)

}
